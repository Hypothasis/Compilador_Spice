import java.io.*;
import java.nio.Buffer;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static HashMap <String, String> Palavras_Reservadas;
    private static String buffer = "";
    private static int countTokens = 0;

    public static void main(String[] args) throws IOException {
        Palavras_Reservadas_init();
        
        LerArquivo();
    }

    private static void LerArquivo() throws IOException {
        // ASCII '\n' 10
        int i = 0;
        BufferedReader buffer = new BufferedReader(new FileReader("file.spice"));
        while((i = buffer.read()) != -1){
            char c = (char) i;
            AnalisadorLexico(c);
        }
    }

    private static void AnalisadorLexico(char c) {
        buffer = buffer + c;
        if(Palavras_Reservadas.containsKey(buffer)) {
            System.out.println("Token encontrado no programa : " + Palavras_Reservadas.get(String.valueOf(buffer)));
            countTokens++;
            buffer = "";
        }
    }

    private static void Palavras_Reservadas_init() {
        //                                  Key   ,  value
        Palavras_Reservadas = new HashMap <String , String>();
        Palavras_Reservadas.put("id","variavel"); // <id,variavel> (token de id)
        Palavras_Reservadas.put("int","INT"); // <int, INT> (token de numero inteiro)
        Palavras_Reservadas.put("real","FLOAT"); // <real, REAL> (token de numero real)
        Palavras_Reservadas.put("text","TEXTO"); // <text, TEXTO> (token de texto)


        Palavras_Reservadas.put("-","menos"); // <-, menos> (token de subtrair)
        Palavras_Reservadas.put("+","mais"); // <+, mais> (token de somar)
        Palavras_Reservadas.put("*","multiplica"); // <*, multiplicar> (token de multiplicar)
        Palavras_Reservadas.put("%","divide"); // <%,divide> (token de dividir)

        Palavras_Reservadas.put("->","atribuir"); // <=, atribuir> (token de atribuir)

        Palavras_Reservadas.put("==","igual"); // <==,igual> (token de igual)
        Palavras_Reservadas.put("!=","diferente"); // <!=,diferente> (token de nao igual)

        Palavras_Reservadas.put(";","end"); // <final, ;> (token final de comando)
        Palavras_Reservadas.put(" ","space"); // <space, ' '> (token de espaço)
        Palavras_Reservadas.put("(","abrir seção"); // <(,abrir> (token de parentese)
        Palavras_Reservadas.put(")","fechar seção"); // <),fechar> (token de fechar)
        Palavras_Reservadas.put("\"","aspas"); // <", aspas> (token para aspas)


        Palavras_Reservadas.put("if", "se"); // <if, se> token se
        Palavras_Reservadas.put("while", "enquanto"); // <while, se> (token de repetir)
        Palavras_Reservadas.put("read","input"); // <read, input> (token de input)
        Palavras_Reservadas.put("write","output"); // <write, output> (token de print)
    }
}