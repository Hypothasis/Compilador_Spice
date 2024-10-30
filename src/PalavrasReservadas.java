import java.util.HashMap;

public class PalavrasReservadas {
    public static HashMap<String, String> palavrasReservadas;

    PalavrasReservadas (){
        palavrasReservadasInit();
    }

    public static void palavrasReservadasInit() {
        //                                  Key   ,  value
        palavrasReservadas = new HashMap <String , String>();
        palavrasReservadas.put("If", "se"); // <If, se> token se
        palavrasReservadas.put("Repeat", "enquanto"); // <Repeat, enquanto> (token de repetir)
        palavrasReservadas.put("Read","entrada"); // <Read, entrada> (token de input)
        palavrasReservadas.put("Write","saida"); // <Write, saida> (token de print)

        palavrasReservadas.put("id","variavel"); // <id,variavel> (token de id)
        palavrasReservadas.put("Int","INT"); // <int, INT> (token de numero inteiro)
        palavrasReservadas.put("String","STRING"); // <String, String> (token de texto)

        palavrasReservadas.put("==","comparação"); // <==,comparação> (token de comparação)
        palavrasReservadas.put("#","Comentário"); // <#, comentario> (token de comentario)
        palavrasReservadas.put("!=","diferente"); // <!=,diferente> (token de diferente)
        palavrasReservadas.put("->","atribuir"); // < ->, atribuir> (token de atribuir)
        palavrasReservadas.put("||","ou");
        palavrasReservadas.put("&&","e");
        palavrasReservadas.put(",","auxiliar");
        palavrasReservadas.put(";","final"); // <final, ;> (token final de comando)
        palavrasReservadas.put(" ","space"); // <space, ' '> (token de espaço)
        palavrasReservadas.put("\"","aspas"); // <", aspas> (token para aspas)
        palavrasReservadas.put("(","abrir seção"); // <(,abrir seção> (token de parentese)
        palavrasReservadas.put(")","fechar seção"); // <),fechar seção> (token de fechar)
        palavrasReservadas.put("end","END"); // <end, END> (token para fim de bloco)
        palavrasReservadas.put("-","menos"); // <-, menos> (token de subtrair)
        palavrasReservadas.put("+","mais"); // <+, mais> (token de somar)
        palavrasReservadas.put("*","multiplica"); // <*, multiplicar> (token de multiplicar)
        palavrasReservadas.put("/","dividir"); // </,dividir> (token de dividir)
    }
}
