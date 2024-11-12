import Staticos.TabelaTrans;

import java.io.IOException;

public class Estado {
    public static TabelaTrans tabela;
    public static int linha = 1;
    public static int coluna = 1;
    public static String buffer = "";
    public static Integer estadoAtual = 0;
    public static int proximoEstado = 0;
    public static int colunaEstado;
    public static int countTokens = 0;

    public  Estado() {
        tabela = new TabelaTrans();
    }

    public static void proximoEstado(char caracter) throws IOException {
        switch (caracter) {
            case 'a':
                // Código para 'a'
                colunaEstado = 0;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'b':
                // Código para 'b'
                colunaEstado = 1;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'c':
                // Código para 'c'
                colunaEstado = 2;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'd':
                // Código para 'd'
                colunaEstado = 3;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'e':
                // Código para 'e'
                colunaEstado = 4;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'f':
                // Código para 'f'
                colunaEstado = 5;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'g':
                // Código para 'g'
                colunaEstado = 6;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'h':
                // Código para 'h'
                colunaEstado = 7;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'i':
                // Código para 'i'
                colunaEstado = 8;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'j':
                // Código para 'j'
                colunaEstado = 9;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'k':
                // Código para 'k'
                colunaEstado = 10;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'l':
                // Código para 'l'
                colunaEstado = 11;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'm':
                // Código para 'm'
                colunaEstado = 12;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'n':
                // Código para 'n'
                colunaEstado = 13;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'o':
                // Código para 'o'
                colunaEstado = 14;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'p':
                // Código para 'p'
                colunaEstado = 15;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'q':
                // Código para 'q'
                colunaEstado = 16;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'r':
                // Código para 'r'
                colunaEstado = 17;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 's':
                // Código para 's'
                colunaEstado = 18;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 't':
                // Código para 't'
                colunaEstado = 19;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'u':
                // Código para 'u'
                colunaEstado = 20;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'v':
                // Código para 'v'
                colunaEstado = 21;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'w':
                // Código para 'w'
                colunaEstado = 22;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'x':
                // Código para 'x'
                colunaEstado = 23;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'y':
                // Código para 'y'
                colunaEstado = 24;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'z':
                // Código para 'z'
                colunaEstado = 25;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'A':
                // Código para 'A'
                colunaEstado = 26;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'B':
                // Código para 'B'
                colunaEstado = 27;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'C':
                // Código para 'C'
                colunaEstado = 28;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'D':
                // Código para 'D'
                colunaEstado = 29;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'E':
                // Código para 'E'
                colunaEstado = 30;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'F':
                // Código para 'F'
                colunaEstado = 31;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'G':
                // Código para 'G'
                colunaEstado = 32;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'H':
                // Código para 'H'
                colunaEstado = 33;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'I':
                // Código para 'I'
                colunaEstado = 34;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'J':
                // Código para 'J'
                colunaEstado = 35;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'K':
                // Código para 'K'
                colunaEstado = 36;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'L':
                // Código para 'L'
                colunaEstado = 37;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'M':
                // Código para 'M'
                colunaEstado = 38;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'N':
                // Código para 'N'
                colunaEstado = 39;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'O':
                // Código para 'O'
                colunaEstado = 40;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'P':
                // Código para 'P'
                colunaEstado = 41;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'Q':
                // Código para 'Q'
                colunaEstado = 42;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'R':
                // Código para 'R'
                colunaEstado = 43;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'S':
                // Código para 'S'
                colunaEstado = 44;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'T':
                // Código para 'T'
                colunaEstado = 45;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'U':
                // Código para 'U'
                colunaEstado = 46;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'V':
                // Código para 'V'
                colunaEstado = 47;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'W':
                // Código para 'W'
                colunaEstado = 48;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'X':
                // Código para 'X'
                colunaEstado = 49;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'Y':
                // Código para 'Y'
                colunaEstado = 50;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case 'Z':
                // Código para 'Z'
                colunaEstado = 51;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case '0': case '1': case '2': case '3': case '4':
            case '5': case '6': case '7': case '8': case '9':
                //Numero
                Main.i = Main.br.read();
                while (Main.i != ' ' && Main.i != -1 && Main.i != '\n' & Main.i != ')'){
                    Main.c = (char) Main.i;
                    Estado.buffer = Estado.buffer + Main.c;
                    Main.i = Main.br.read();
                }
                System.out.println("Token Num encontrado: \""+Estado.buffer+"\"");
                Main.tokenStore.addCMD(buffer);
                buffer = "";
                proximoEstado = 0;
                estadoAtual = 0;
                countTokens++;
                break;
            case '=':
                if(buffer.equals("!=")){
                    System.out.println("Token != encontrado: \""+Estado.buffer+"\"");
                    buffer = "";
                    proximoEstado = 0;
                    countTokens++;
                }else{
                    colunaEstado = 53;
                    proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                    estadoAtual = proximoEstado;
                }
                break;
            case '#':
                //comentario fazer logica
                Main.i = Main.br.read();
                while (Main.i != '\n'){
                    Main.c = (char) Main.i;
                    Estado.buffer = Estado.buffer + Main.c;
                    Main.i = Main.br.read();
                }
                System.out.println("Token comentario encontrado: \""+Estado.buffer+"\"");
                Main.tokenStore.addCMD(buffer);
                buffer = "";
                proximoEstado = 0;
                estadoAtual = 0;
                countTokens++;
                break;
            case '!':
                colunaEstado = 55;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case '-':
                colunaEstado = 56;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case '>':
                if(buffer.equals("->")){
                    System.out.println("Token -> encontrado: \""+Estado.buffer+"\"");
                    Main.tokenStore.addCMD(buffer);
                    buffer = "";
                    proximoEstado = 0;
                    estadoAtual = 0;
                    countTokens++;
                } else {
                    System.out.printf("Error na linha %s coluna %s.\n",linha,coluna);
                    System.exit(-1);
                }
                break;
            case '|':
                colunaEstado = 58;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case '&':
                colunaEstado = 59;
                proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                estadoAtual = proximoEstado;
                break;
            case ',':
                System.out.println("Token , encontrado");
                buffer = "";
                estadoAtual = 0;
                countTokens++;
                break;
            case ';':
                System.out.println("Token ; encontrado");
                Main.tokenStore.addCMD(buffer);
                buffer = "";
                estadoAtual = 0;
                countTokens++;
                break;
            case '\"':
                //implementar o "texto"
                Main.i = Main.br.read();
                while (Main.i != '\"'){
                    Main.c = (char) Main.i;
                    Estado.buffer = Estado.buffer + Main.c;
                    Main.i = Main.br.read();
                }
                Estado.buffer = Estado.buffer + "\"";
                System.out.println("Token \"Texto\" encontrado: "+Estado.buffer);
                Main.tokenStore.addCMD(buffer);
                buffer = "";
                proximoEstado = 0;
                estadoAtual = 0;
                countTokens++;
                break;
            case '(':
                System.out.println("Token ( encontrado");
                Main.tokenStore.addCMD(buffer);
                buffer = "";
                estadoAtual = 0;
                countTokens++;
                break;
            case ')':
                System.out.println("Token ) encontrado");
                Main.tokenStore.addCMD(buffer);
                buffer = "";
                estadoAtual = 0;
                countTokens++;
                break;
            case '+':
                System.out.println("Token + encontrado");
                Main.tokenStore.addCMD(buffer);
                buffer = "";
                estadoAtual = 0;
                countTokens++;
                break;
            case '*':
                System.out.println("Token * encontrado");
                Main.tokenStore.addCMD(buffer);
                buffer = "";
                estadoAtual = 0;
                countTokens++;
                break;
            case '/':
                System.out.println("Token / encontrado");
                Main.tokenStore.addCMD(buffer);
                buffer = "";
                estadoAtual = 0;
                countTokens++;
                break;
            case '\n':
                // ASCII '\n' 10
                linha++;
                coluna = 1;
                buffer = "";
                break;
            case ' ':
                colunaEstado = 68;
                if(estadoAtual > 0){
                    proximoEstado = tabela.estados[estadoAtual][colunaEstado];
                }
                switch (proximoEstado) {
                    case 0:
                        //spaço
                        System.out.println("Token \" \" encontrado");
                        Main.tokenStore.addCMD(buffer);
                        buffer = "";
                        proximoEstado = 0;
                        estadoAtual = 0;
                        countTokens++;
                        break;
                    case -1:
                        //Id
                        System.out.println("Token id \'"+buffer+"\' encontrado");
                        TokenStore.idTokens.put(buffer,"null");
                        Main.tokenStore.addCMD(buffer);
                        buffer = "";
                        proximoEstado = 0;
                        estadoAtual = 0;
                        countTokens++;
                        break;
                    case -2:
                        //String
                        System.out.println("Token String encontrado");
                        Main.tokenStore.addCMD(buffer);
                        buffer = "";
                        proximoEstado = 0;
                        estadoAtual = 0;
                        countTokens++;
                        break;
                    case -3:
                        //Int
                        System.out.println("Token Int encontrado");
                        Main.tokenStore.addCMD(buffer);
                        buffer = "";
                        proximoEstado = 0;
                        estadoAtual = 0;
                        countTokens++;
                        break;
                    case -4:
                        //Write
                        System.out.println("Token Write encontrado");
                        Main.tokenStore.addCMD(buffer);
                        buffer = "";
                        proximoEstado = 0;
                        estadoAtual = 0;
                        countTokens++;
                        break;
                    case -5:
                        //Read
                        System.out.println("Token Read encontrado");
                        Main.tokenStore.addCMD(buffer);
                        buffer = "";
                        proximoEstado = 0;
                        estadoAtual = 0;
                        countTokens++;
                        break;
                    case -6:
                        //Repeat
                        System.out.println("Token Repeat encontrado");
                        Main.tokenStore.addCMD(buffer);
                        buffer = "";
                        proximoEstado = 0;
                        estadoAtual = 0;
                        countTokens++;
                        break;
                    case -7:
                        //If
                        System.out.println("Token If encontrado");
                        Main.tokenStore.addCMD(buffer);
                        buffer = "";
                        proximoEstado = 0;
                        estadoAtual = 0;
                        countTokens++;
                        break;
                    case -8:
                        //end
                        System.out.println("Token end encontrado");
                        Main.tokenStore.addCMD(buffer);
                        buffer = "";
                        proximoEstado = 0;
                        estadoAtual = 0;
                        countTokens++;
                        break;
                    case -9:
                        //!=
                        System.out.println("Token != encontrado");
                        Main.tokenStore.addCMD(buffer);
                        buffer = "";
                        proximoEstado = 0;
                        estadoAtual = 0;
                        countTokens++;
                        break;
                    case -10:
                        //==
                        System.out.println("Token == encontrado");
                        Main.tokenStore.addCMD(buffer);
                        buffer = "";
                        proximoEstado = 0;
                        estadoAtual = 0;
                        countTokens++;
                        break;
                    case -11:
                        //->
                        System.out.println("Token -> encontrado");
                        Main.tokenStore.addCMD(buffer);
                        buffer = "";
                        proximoEstado = 0;
                        estadoAtual = 0;
                        countTokens++;
                        break;
                    case -12:
                        //||
                        System.out.println("Token || encontrado");
                        Main.tokenStore.addCMD(buffer);
                        buffer = "";
                        proximoEstado = 0;
                        estadoAtual = 0;
                        countTokens++;
                        break;
                    case -13:
                        //&&
                        System.out.println("Token && encontrado");
                        Main.tokenStore.addCMD(buffer);
                        buffer = "";
                        proximoEstado = 0;
                        estadoAtual = 0;
                        countTokens++;
                        break;
                    case -15:
                        //Num
                        System.out.println("Token Num encontrado");
                        Main.tokenStore.addCMD(buffer);
                        buffer = "";
                        proximoEstado = 0;
                        estadoAtual = 0;
                        countTokens++;
                        break;
                    case -19:
                        //-
                        System.out.println("Token - encontrado");
                        Main.tokenStore.addCMD(buffer);
                        buffer = "";
                        proximoEstado = 0;
                        estadoAtual = 0;
                        countTokens++;
                        break;
                    case -26:
                        //" "
                        System.out.println("Token \" \" encontrado");
                        Main.tokenStore.addCMD(buffer);
                        buffer = "";
                        proximoEstado = 0;
                        estadoAtual = 0;
                        countTokens++;
                        break;
                    case -66:
                        // ERROR
                        System.out.printf("Error na linha %s coluna %s.\n",linha,coluna);
                        System.exit(-1);
                        break;
                    default:
                        // ERROR
                        System.out.printf("Error na linha %s coluna %s.\n",linha,coluna);
                        System.exit(-1);
                        break;
                }
                break;
            default:
                System.out.printf("Error: Simbolo nao pertence a linguagem, na linha: %s ,coluna: %s",linha,coluna);
                break;
        }

    }
}
