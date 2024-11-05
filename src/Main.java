import java.io.*;

public class Main {

    public static PalavrasReservadas palavras = new PalavrasReservadas();
    public static Estado estado = new Estado();
    public static TokenStore tokenStore = new TokenStore();
    public static BufferedReader br;
    public static int i = 0;
    public static char c;

    public static void main(String[] args) throws IOException {
        //tabela.getTabela();

        br = new BufferedReader(new FileReader("Files/file2.spice"));
        while((i = br.read()) != -1){
            analisadorLexico(i);
            analisadorSintatico();
        }
        tokenStore.getAllTokensId();
    }

    private static void analisadorLexico(int i) throws IOException {
        c = (char) i;
        Estado.buffer = Estado.buffer + c;
        if(Estado.estadoAtual != -1 || c == ' '){
            char aux = c;
            Estado.proximoEstado(c);
        }
        Estado.coluna++;
    }

    private static void analisadorSintatico() {
    }

}