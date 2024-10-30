import java.io.*;

public class Main {

    public static PalavrasReservadas palavras;
    public static TabelaTrans tabela;
    private static String buffer = "";
    private static int proximoEstado = 0;
    private static int colunaEstado;
    private static int countTokens = 0;

    public static void main(String[] args) throws IOException {
        tabela = new TabelaTrans();
        palavras = new PalavrasReservadas();
        tabela.getTabela();
        // ASCII '\n' 10
        int i = 0;
        BufferedReader buffer = new BufferedReader(new FileReader("file.spice"));
        while((i = buffer.read()) != -1){
            char c = (char) i;
            //AnalisadorLexico(c);
        }
    }

    private static void AnalisadorLexico(char c) {
        ProximoEstado(c);
        buffer = buffer + c;
        if(palavras.palavrasReservadas.containsKey(buffer)) {
            System.out.println("Token encontrado no programa : " + palavras.palavrasReservadas.get(String.valueOf(buffer)));
            countTokens++;
            buffer = "";
        }
    }

    private static void ProximoEstado(char caracter) {
        switch (caracter) {
            case 'i':
                colunaEstado = 1;
                proximoEstado = 1; //q1
                break;
            case 'n':
                colunaEstado = 2;
                proximoEstado = 2; //q2
                break;
            case 't':
                colunaEstado = 3;
                proximoEstado = 4; // INT
                break;
            case ';':
                colunaEstado = 4;
                proximoEstado = 5; // END
            default:
                if(caracter <= 'a' && caracter >= 'z') {
                    //palavras de a-z
                    colunaEstado = 0;
                    proximoEstado = 3; // ID
                }
                break;
        }
    }

}