import AnalisadorSintatico.AnalisadorSintatico;
import Staticos.PalavrasReservadas;

import java.io.*;

public class Main {

    public static PalavrasReservadas palavras = new PalavrasReservadas();
    public static Estado estado = new Estado();
    public static TokenStore tokenStore = new TokenStore();
    public static AnalisadorSintatico analisadorSintatico = new AnalisadorSintatico();
    public static BufferedReader br;
    public static int countLetters=0;
    public static int i = 0;
    public static char c;

    public static void main(String[] args) throws IOException {
        //tabela.getTabela();
        System.out.println("______________________________________");
        br = new BufferedReader(new FileReader("Files/file2.spice"));
        while((i = br.read()) != -1){
            analisadorLexico(i);
            analisadorSintatico();
            countLetters++;
        }
        statistics();
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
        if (tokenStore.flag == true){
            Main.tokenStore.getCMD(); // Mostra os valores do comando a ser analisado
            analisadorSintatico.teste(tokenStore.cmd);
            Main.tokenStore.clearCMD(); // Limpa o buffer de comando para o proximo
            System.out.println("______________________________________");
        }

    }
    private static void statistics() {
        System.out.println("_____________Estatísticas_____________");
        System.out.println("______________________________________");
        System.out.print("Número de Tokens encontrados: "+TokenStore.countTokens);
        System.out.printf("\nNúmero de comandos executados: %s",TokenStore.cmdCount-1);
        System.out.printf("\nNúmero de caracteres encontrados: %s\n",countLetters);
        tokenStore.getAllTokensId();
    }

}