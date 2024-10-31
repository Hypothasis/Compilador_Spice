import java.io.*;

public class ExemploTXT {
    public static int linha = 0;
    public static int coluna = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Files/texto.txt"));
        int buffer;
        while ((buffer = br.read()) != -1) {
            System.out.print((char) buffer);
            coluna++;
            if(buffer == 10){
                //pula a linha
                linha++;
                coluna = 0;
            }
        }
    }
}
