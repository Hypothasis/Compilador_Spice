package main;

import AnalisadorLexico.Estado;
import AnalisadorLexico.TokenStore;
import AnalisadorSintatico.AnalisadorSintatico;
import AnalisadorSemantico.analisadorSemantico;
import IDS.IDsReservados;
import Staticos.PalavrasReservadas;

import java.io.*;

public class Main {

    public static PalavrasReservadas palavras = new PalavrasReservadas();
    public static Estado estado = new Estado();
    public static TokenStore tokenStore = new TokenStore();
    public static AnalisadorSintatico analisadorSintatico = new AnalisadorSintatico();
    public static analisadorSemantico analisadorSemantico = new analisadorSemantico();
    public static IDsReservados ids = new IDsReservados();
    public static BufferedReader br;
    public static int countLetters=0;
    public static int i = 0;
    public static char c;

    public static void main(String[] args) throws IOException {
        //tabela.getTabela();
        System.out.println("______________________________________");
        br = new BufferedReader(new FileReader("Files/file.spice"));
        while((i = br.read()) != -1){
            analisadorLexico(i);
            analisadorSintatico();
            analisadorSemantico();
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
            Main.tokenStore.getCMD(); // Mostra os valores docomando a ser analisado
            analisadorSintatico.init(tokenStore.cmd);
            analisadorSintatico.analisar();
            //Main.tokenStore.clearCMD(); // Limpa o buffer de comando para o proximo
            ///TokenStore.flag = false;
            System.out.println("______________________________________");
        }
    }

    private static void analisadorSemantico() {
        if (tokenStore.flag == true) {
            analisadorSemantico.init(tokenStore.cmd);  // Inicializa o analisador semântico
            analisadorSemantico.analisar();  // Executa a análise semântica
            Main.tokenStore.clearCMD(); // Limpa o buffer de comando para o proximo
            TokenStore.flag = false;
            System.out.println("////////////////////////////////////////////");
        }
    }

    private static void statistics() {
        System.out.println("_____________Estatísticas_____________");
        System.out.println("______________________________________");
        System.out.print("Número de Tokens encontrados: "+ TokenStore.countTokens);
        System.out.printf("\nNúmero de comandos executados: %s", TokenStore.cmdCount-1);
        System.out.printf("\nNúmero de caracteres encontrados: %s\n",countLetters);
        IDsReservados.getAllTokensId();
    }

    public static void exit(String msg) {
        System.out.println(msg+"linha: "+Estado.linha+" e coluna: "+Estado.coluna);
        System.exit(-1);
    }

}