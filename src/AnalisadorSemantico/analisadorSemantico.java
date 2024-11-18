package AnalisadorSemantico;

import main.Main;

public class analisadorSemantico {

    private String[] tokens;
    private int posicao;

    public void init(String[] cmd) {
        tokens = new String[cmd.length];
        for (int i = 0; i < cmd.length; i++) {
            if (cmd[i] != null) {
                tokens[i] = cmd[i];
            }
        }
        posicao = 0;
    }

    public void analisar() {
        System.out.println("__________Análise Semântica__________");
        if (S()) {
            System.out.println("\nEntrada semântica válida!\n");
        } else {
            System.out.println("\nErro Semântico!\n");
            System.exit(-1);
        }
    }

    private boolean S() {
        System.out.println("Executando regra S");
        return CMDS();
    }

    private boolean CMDS() {
        System.out.println("Executando regra CMDS na posição: " + posicao + " (" + tokens[posicao] + ")");
        if (CMD()) {
            if (tokens[posicao] == null) return true;
            while (match(";")) {
                if (tokens[posicao] == null) return true;
                if (!CMD()) return false;
            }
            return true;
        }
        return false;
    }

    private boolean CMD() {
        System.out.println("Executando regra CMD na posição: " + posicao + " (" + tokens[posicao] + ")");
        int savePos = posicao;

        // Verificação para tipo Int
        if (match("Int")) {
            if (!Main.ids.IDexists(tokens[posicao])) { // Se não existe, declaramos
                Main.ids.addID(tokens[posicao], "Int", "null"); // Declarada, mas não inicializada
                posicao++;
                if (match(";")) return true; // Variável não inicializada
                if (match("->") && match("num")) return true; // Variável inicializada
            } else {
                System.out.println("Erro: Variável " + tokens[posicao] + " já foi declarada.");
                return false;
            }
        }

        // Verificação para tipo String
        if (match("String")) {
            if (!Main.ids.IDexists(tokens[posicao])) { // Se não existe, declaramos
                Main.ids.addID(tokens[posicao], "String", "null"); // Declarada, mas não inicializada
                posicao++;
                if (match(";")) return true; // Variável não inicializada
                if (match("->") && match("\"Texto\"")) return true; // Inicializada
            } else {
                System.out.println("Erro: Variável " + tokens[posicao] + " já foi declarada.");
                return false;
            }
        }

        // Verificação para If
        if (match("If")) {
            if (EXP() && COND() && CMDS() && match("end")) return true;
        }

        // Verificação para Read
        if (match("Read")) {
            if (Main.ids.IDexists(tokens[posicao])) {
                posicao++;
                if (match(";")) return true; // Variável não inicializada
                return false;
            } else {
                System.out.println("Erro: Variável " + tokens[posicao] + " não declarada.");
                return false;
            }
        }

        // Verificação para Write
        if (match("Write")) return EXP();

        // Verificação para Repeat
        if (match("Repeat")) {
            if (match("num")) { // Verifica se o número é válido
                if (CMDS() && match("end")) return true;
            }
        }

        // Se for apenas ponto e vírgula ou "end", retorna true
        if (match(";")) return true;
        if (match("end")) return true;

        return false;
    }

    private boolean COND() {
        System.out.println("Executando regra COND na posição: " + posicao + " (" + tokens[posicao] + ")");
        int savePos = posicao;
        if (EXP()) {
            if (match("!=") || match("==")) {
                if (EXP()) return true;
            }
        }
        posicao = savePos;
        return false;
    }

    private boolean EXP() {
        System.out.println("Executando regra EXP na posição: " + posicao + " (" + tokens[posicao] + ")");
        if (TERMO()) {
            while (match("+") || match("-")) {
                if (!TERMO()) return false;
            }
            return true;
        }
        return false;
    }

    private boolean TERMO() {
        System.out.println("Executando regra TERMO na posição: " + posicao + " (" + tokens[posicao] + ")");
        if (FATOR()) {
            while (match("*") || match("/")) {
                if (!FATOR()) return false;
            }
            return true;
        }
        return false;
    }

    private boolean FATOR() {
        System.out.println("Executando regra FATOR na posição: " + posicao + " (" + tokens[posicao] + ")");
        int savePos = posicao;

        if (match("(")) {
            if (EXP() && match(")")) return true;
            posicao = savePos;
            return false;
        }

        if (match("id")) {
            if (!Main.ids.IDexists(tokens[posicao])) {
                System.out.println("Erro: ID não encontrado para " + tokens[posicao]);
                return false;
            }
            return true;
        }

        if (match("num")) return true;

        return false;
    }

    private boolean match(String esperado) {
        if (posicao < tokens.length) {
            // Verificar se é um número
            if (esperado.equals("num")) {
                if (isInteger(tokens[posicao])) {
                    posicao++;
                    return true;
                }
                return false;
            }

            // Verificar se é um id
            if (esperado.equals("id")) {
                if (Main.ids.IDexists(tokens[posicao])) {
                    posicao++;
                    return true;
                }
                System.out.println("Erro: ID não encontrado para " + tokens[posicao]);
                return false;
            }

            // Verificar se é um literal de string
            if (esperado.startsWith("\"")) {
                posicao++;
                return true;
            }

            // Verificar se o token corresponde ao esperado
            if (esperado.equals(tokens[posicao])) {
                posicao++;
                return true;
            }
        }
        return false;
    }

    private boolean isInteger(String str) {
        if (str == null || str.isEmpty()) return false;
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
