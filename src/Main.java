import java.io.*;

public class Main {

    public static PalavrasReservadas palavras;
    public static Estado estado;
    public static BufferedReader br;
    public static int i = 0;
    public static char c;

    public static void main(String[] args) throws IOException {
        palavras = new PalavrasReservadas();
        estado = new Estado();

        //tabela.getTabela();

        br = new BufferedReader(new FileReader("Files/file.spice"));
        while((i = br.read()) != -1){
            c = (char) i;
            Estado.buffer = Estado.buffer + c;
            if(Estado.estadoAtual != -1 || c == ' '){
                    Estado.proximoEstado(c);
            }
            Estado.coluna++;
        }
    }

}