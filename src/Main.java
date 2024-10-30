import java.io.*;

public class Main {

    public static PalavrasReservadas palavras;
    public static TabelaTrans tabela;
    public static int linha = 0;
    public static int coluna = 0;
    private static String buffer = "";
    private static int proximoEstado = 0;
    private static int colunaEstado;
    private static int countTokens = 0;

    public static void main(String[] args) throws IOException {
        tabela = new TabelaTrans();
        palavras = new PalavrasReservadas();
        tabela.getTabela();

        int i = 0;
        BufferedReader buffer = new BufferedReader(new FileReader("Files/file.spice"));
        while((i = buffer.read()) != -1){
            char c = (char) i;
            if(c == '\n'){
                // ASCII '\n' 10
                linha++;
                coluna = 0;
            }
            coluna++;
            //AnalisadorLexico(c);
        }
    }

    private static void AnalisadorLexico(char c) {
        ProximoEstado(c);
        buffer = buffer + c;
        if(palavras.Reservadas.containsKey(buffer)) {
            System.out.println("Token encontrado no programa : " + palavras.Reservadas.get(String.valueOf(buffer)));
            countTokens++;
            buffer = "";
        }
    }

    private static void ProximoEstado(char caracter) {
        switch (caracter) {
            case 'a':
                colunaEstado = 0;
                // Código para 'a'
                break;
            case 'b':
                colunaEstado = 1;
                // Código para 'b'
                break;
            case 'c':
                colunaEstado = 2;
                // Código para 'c'
                break;
            case 'd':
                colunaEstado = 3;
                // Código para 'd'
                break;
            case 'e':
                colunaEstado = 4;
                // Código para 'e'
                break;
            case 'f':
                colunaEstado = 5;
                // Código para 'f'
                break;
            case 'g':
                colunaEstado = 6;
                // Código para 'g'
                break;
            case 'h':
                colunaEstado = 7;
                // Código para 'h'
                break;
            case 'i':
                colunaEstado = 8;
                // Código para 'i'
                break;
            case 'j':
                colunaEstado = 9;
                // Código para 'j'
                break;
            case 'k':
                colunaEstado = 10;
                // Código para 'k'
                break;
            case 'l':
                colunaEstado = 11;
                // Código para 'l'
                break;
            case 'm':
                colunaEstado = 12;
                // Código para 'm'
                break;
            case 'n':
                colunaEstado = 13;
                // Código para 'n'
                break;
            case 'o':
                colunaEstado = 14;
                // Código para 'o'
                break;
            case 'p':
                colunaEstado = 15;
                // Código para 'p'
                break;
            case 'q':
                colunaEstado = 16;
                // Código para 'q'
                break;
            case 'r':
                colunaEstado = 17;
                // Código para 'r'
                break;
            case 's':
                colunaEstado = 18;
                // Código para 's'
                break;
            case 't':
                colunaEstado = 19;
                // Código para 't'
                break;
            case 'u':
                colunaEstado = 20;
                // Código para 'u'
                break;
            case 'v':
                colunaEstado = 21;
                // Código para 'v'
                break;
            case 'w':
                colunaEstado = 22;
                // Código para 'w'
                break;
            case 'x':
                colunaEstado = 23;
                // Código para 'x'
                break;
            case 'y':
                colunaEstado = 24;
                // Código para 'y'
                break;
            case 'z':
                colunaEstado = 25;
                // Código para 'z'
                break;
            case 'A':
                colunaEstado = 26;
                // Código para 'A'
                break;
            case 'B':
                colunaEstado = 27;
                // Código para 'B'
                break;
            case 'C':
                colunaEstado = 28;
                // Código para 'C'
                break;
            case 'D':
                colunaEstado = 29;
                // Código para 'D'
                break;
            case 'E':
                colunaEstado = 30;
                // Código para 'E'
                break;
            case 'F':
                colunaEstado = 31;
                // Código para 'F'
                break;
            case 'G':
                colunaEstado = 32;
                // Código para 'G'
                break;
            case 'H':
                colunaEstado = 33;
                // Código para 'H'
                break;
            case 'I':
                colunaEstado = 34;
                // Código para 'I'
                break;
            case 'J':
                colunaEstado = 35;
                // Código para 'J'
                break;
            case 'K':
                colunaEstado = 36;
                // Código para 'K'
                break;
            case 'L':
                colunaEstado = 37;
                // Código para 'L'
                break;
            case 'M':
                colunaEstado = 38;
                // Código para 'M'
                break;
            case 'N':
                colunaEstado = 39;
                // Código para 'N'
                break;
            case 'O':
                colunaEstado = 40;
                // Código para 'O'
                break;
            case 'P':
                colunaEstado = 41;
                // Código para 'P'
                break;
            case 'Q':
                colunaEstado = 42;
                // Código para 'Q'
                break;
            case 'R':
                colunaEstado = 43;
                // Código para 'R'
                break;
            case 'S':
                colunaEstado = 44;
                // Código para 'S'
                break;
            case 'T':
                colunaEstado = 45;
                // Código para 'T'
                break;
            case 'U':
                colunaEstado = 46;
                // Código para 'U'
                break;
            case 'V':
                colunaEstado = 47;
                // Código para 'V'
                break;
            case 'W':
                colunaEstado = 48;
                // Código para 'W'
                break;
            case 'X':
                colunaEstado = 49;
                // Código para 'X'
                break;
            case 'Y':
                colunaEstado = 50;
                // Código para 'Y'
                break;
            case 'Z':
                colunaEstado = 51;
                // Código para 'Z'
                break;
            case '0': case '1': case '2': case '3': case '4':
            case '5': case '6': case '7': case '8': case '9':
                colunaEstado = 52;
                //Numero
                break;
            case '=':
                colunaEstado = 53;
                break;
            case '#':
                colunaEstado = 54;
                break;
            case '!':
                colunaEstado = 55;
                break;
            case '>':
                colunaEstado = 56;
                break;
            case '|':
                colunaEstado = 57;
                break;
            case '&':
                colunaEstado = 58;
                break;
            case ',':
                colunaEstado = 59;
                break;
            case ';':
                colunaEstado = 60;
                break;
            case '\"':
                colunaEstado = 61;
                break;
            case '(':
                colunaEstado = 62;
                break;
            case ')':
                colunaEstado = 63;
                break;
            case '+':
                colunaEstado = 64;
                break;
            case '-':
                colunaEstado = 65;
                break;
            case '*':
                colunaEstado = 66;
                break;
            case '/':
                colunaEstado = 67;
                break;
            case ' ':
                colunaEstado = 68;
                break;
            default:
                //simbolo nao reconhecido pela linguagem
                break;
        }

    }

}