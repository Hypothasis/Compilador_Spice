import java.io.*;

public class Main {

    public static PalavrasReservadas palavras;
    public static Estado estado;

    public static void main(String[] args) throws IOException {
        palavras = new PalavrasReservadas();
        estado = new Estado();

        //tabela.getTabela();

        int i = 0;
        BufferedReader br = new BufferedReader(new FileReader("Files/file.spice"));
        while((i = br.read()) != -1){
            char c = (char) i;
            Estado.coluna++;
            Estado.buffer = Estado.buffer + c;
            if(Estado.estadoAtual != -1 || c == ' '){
                if(c == '\n' ){
                    // ASCII '\n' 10
                    Estado.linha++;
                    Estado.coluna = 0;
                    Estado.buffer = "";
                } else {
                    Estado.proximoEstado(c);
                }
            }
        }
    }

}