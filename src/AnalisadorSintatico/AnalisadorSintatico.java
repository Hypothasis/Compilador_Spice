package AnalisadorSintatico;

public class AnalisadorSintatico {

    private  String [] tokens;
    private int posicao;

    public void teste(String[] cmd){
        System.out.println("<---- ANALISADOR SINTATICO ---->");

        int i = 0;
        System.out.printf("{");
        while (cmd[i] != null){
            System.out.printf("[%s] ",cmd[i]);
            i++;
        }
        System.out.printf("}\n\n");
    }

    public void analisar(String[] cmd) {
        if (S() && posicao == tokens.length) {
            System.out.println("Entrada válida!");
        } else {
            System.out.println("Erro de sintaxe na posição " + posicao);
        }
    }

    private boolean S() {
        System.out.println("Executando regra S");
        return CMDS();
    }

    private boolean CMDS() {
        System.out.println("Executando regra CMDS na posição: " + posicao);
        if (CMD()) {
            while (match(";")) {
                if (!CMD()) return false;
            }
            return true;
        }
        return false;
    }

    private boolean CMD() {
        System.out.println("Executando regra CMD na posição: " + posicao);
        int savePos = posicao;

        if (match("If")) {
            if (COND() && CMDS() && match("end")) return true;
        }

        if (match("Repeat")) {
            if (match("num") && CMDS() && match("end")) return true;
            posicao = savePos;
        }

        if (match("id")) {
            if (match("=") && EXP()) return true;
            posicao = savePos;
        }

        if (match("Read")) return match("id");
        if (match("Write")) return EXP();
        if (match(";")) return true;
        if (match("end")) return true;

        return false;
    }

    private boolean COND() {
        System.out.println("Executando regra COND na posição: " + posicao);
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
        System.out.println("Executando regra EXP na posição: " + posicao);
        if (TERMO()) {
            while (match("+") || match("-")) {
                if (!TERMO()) return false;
            }
            return true;
        }
        return false;
    }

    private boolean TERMO() {
        System.out.println("Executando regra TERMO na posição: " + posicao);
        if (FATOR()) {
            while (match("*") || match("/")) {
                if (!FATOR()) return false;
            }
            return true;
        }
        return false;
    }

    private boolean FATOR() {
        System.out.println("Executando regra FATOR na posição: " + posicao);
        int savePos = posicao;

        if (match("(")) {
            if (EXP() && match(")")) return true;
            posicao = savePos;
            return false;
        }

        if (match("id") || match("num")) return true;
        return false;
    }

    private boolean match(String esperado) {
        /*
        if (posicao < tokens.size() && tokens.get(posicao).equals(esperado)) {
            System.out.println("Consumindo token: " + esperado + " na posição " + posicao);
            posicao++;
            return true;
        }
         */
        return false;
    }
}
