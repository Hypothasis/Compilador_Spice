package AnalisadorSintatico;

import main.Main;
import IDS.IDsReservados;

import java.util.ArrayList;
import java.util.List;

public class AnalisadorSintatico {

    private List<String> tokens;
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
    public void init(String[] cmd){
        tokens = new ArrayList<>();
        for (int i = 0; i < cmd.length; i++){
            if (cmd[i] != null){
                tokens.add(cmd[i]);
            }
        }
        posicao = 0;
    }

    public void analisar() {
        System.out.println("__________Analise Sintatica__________");
        if (S()) {
            System.out.println("\nEntrada válida!\n");
        } else {
            System.out.println("\nError Sintatico!\n");
            System.exit(-1);
        }
    }

    private boolean S() {
        System.out.println("Executando regra S");
        return CMDS();
    }

    private boolean CMDS() {
        System.out.println("Executando regra CMDS na posição: " + posicao + " (" + tokens.get(posicao) + ")");
        if (CMD()) {
            if(tokens.size() < posicao) return true;
            while (match(";")) {
                if(posicao >= tokens.size() || tokens.get(posicao).isEmpty()) return true;
                if (CMD()) return false;
            }
            return true;
        }
        return false;
    }

    private boolean CMD() {
        System.out.println("Executando regra CMD na posição: " + posicao+ " (" + tokens.get(posicao) + ")");
        int savePos = posicao;

        if (match("Int")) {
            if (Main.ids.IDexists(tokens.get(posicao))) {
                System.out.println("Consumindo token: id na posição " + posicao + " (" + tokens.get(posicao) + ")");
                posicao++;
                if (match(";")) return true; // variavel nao inicializada
                if (match("->") && match("num")) return true; // variavel inicializada

            }
            //posicao = savePos;
        }

        if (match("String")) {
            if (Main.ids.IDexists(tokens.get(posicao))) {
                System.out.println("Consumindo token: id na posição " + posicao + " (" + tokens.get(posicao) + ")");
                posicao++;
                if (match(";")) return true; // variavel nao inicializada
                if (match("->") && match("\"Texto\"")) return true; // Inicializada
            }
            posicao = savePos;
        }


        if (match("If")) {
            if (COND() && CMDS() && match("end")) return true;
        }

        if (match("Repeat")) {
            if (match("num") && CMDS() && match("end")) return true;
        }

        if (match("Read")) {
            if (Main.ids.IDexists(tokens.get(posicao))) {
                System.out.println("Consumindo token: id na posição " + posicao + " (" + tokens.get(posicao) + ")");
                posicao++;
                if (match(";")) return true; // variavel nao inicializada
            }
            return false;
        }

        if (match("Write")) return EXP();
        if (match(";")) return true;
        if (match("end")) return true;

        return false;
    }

    private boolean COND() {
        System.out.println("Executando regra COND na posição: " + posicao + " (" + tokens.get(posicao) + ")");
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
        System.out.println("Executando regra EXP na posição: " + posicao + " (" + tokens.get(posicao) + ")");
        if (TERMO()) {
            while (match("+") || match("-")) {
                if (!TERMO()) return false;
            }
            return true;
        }
        return false;
    }

    private boolean TERMO() {
        System.out.println("Executando regra TERMO na posição: " + posicao + " (" + tokens.get(posicao) + ")");
        if (FATOR()) {
            while (match("*") || match("/")) {
                if (!FATOR()) return false;
            }
            return true;
        }
        return false;
    }

    private boolean FATOR() {
        System.out.println("Executando regra FATOR na posição: " + posicao + " (" + tokens.get(posicao) + ")");
        int savePos = posicao;

        if (match("(")) {
            if (EXP() && match(")")) return true;
            posicao = savePos;
            return false;
        }

        if (match("id") || match("num") || match("\"")) return true;
        return false;
    }

    private boolean match(String esperado) {
        if (posicao < tokens.size()) {

            if(esperado.equals("num")){
                if(isInteger(tokens.get(posicao))){
                    System.out.println("Consumindo token: " + esperado + " na posição " + posicao + " (" + tokens.get(posicao) + ")");
                    posicao++;
                    return true;
                }
                return false;
            }

            if(esperado.equals("id")){
                if(Main.ids.IDexists(tokens.get(posicao))){
                    System.out.println("Consumindo token: " + esperado + " na posição " + posicao + " (" + tokens.get(posicao) + ")");
                    posicao++;
                    return true;
                }
                System.out.println("Error de ID nao encontrado");
                return false;
            }


            if(esperado.startsWith("\"")){
                System.out.println("Consumindo token: \"Texto\" " + esperado + " na posição " + posicao + " (" + tokens.get(posicao) + ")");
                posicao++;
                return true;
            }

            if (esperado.equals(tokens.get(posicao))) {
                System.out.println("Consumindo token: " + esperado + " na posição " + posicao + " (" + tokens.get(posicao) + ")");
                if(tokens.get(posicao).equals("end")){
                    return true;
                }
                posicao++;
                return true;
            }

            if (tokens.get(posicao) == null) {
                System.out.println("Erro: token na posição " + posicao + " é nulo.");
                return false;
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
