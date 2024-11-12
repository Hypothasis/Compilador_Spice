package Staticos;

import java.util.HashMap;

public class PalavrasReservadas {
    public static HashMap<String, String> Reservadas;

    public PalavrasReservadas (){
        palavrasReservadasInit();
    }

    public static void palavrasReservadasInit() {
        //                                  Key   ,  value
        Reservadas = new HashMap <String , String>();
        Reservadas.put("If ", "se"); // <If, se> token se
        Reservadas.put("Repeat ", "enquanto"); // <Repeat, enquanto> (token de repetir)
        Reservadas.put("Read ","entrada"); // <Read, entrada> (token de input)
        Reservadas.put("Write ","saida"); // <Write, saida> (token de print)

        Reservadas.put("id","variavel"); // <id,variavel> (token de id)
        Reservadas.put("Int ","INT"); // <int, INT> (token de numero inteiro)
        Reservadas.put("String ","STRING"); // <String, String> (token de texto)
        Reservadas.put("num","NUM"); // <String, NUM> (token de Num)

        Reservadas.put("==","comparação"); // <==,comparação> (token de comparação)
        Reservadas.put("#","Comentário"); // <#, comentario> (token de comentario)
        Reservadas.put("!=","diferente"); // <!=,diferente> (token de diferente)
        Reservadas.put("->","atribuir"); // < ->, atribuir> (token de atribuir)
        Reservadas.put("||","ou");
        Reservadas.put("&&","e");
        Reservadas.put(",","auxiliar");
        Reservadas.put(";","final"); // <final, ;> (token final de comando)
        Reservadas.put(" ","space"); // <space, ' '> (token de espaço)
        Reservadas.put("\"","aspas"); // <", aspas> (token para aspas)
        Reservadas.put("(","abrir seção"); // <(,abrir seção> (token de parentese)
        Reservadas.put(")","fechar seção"); // <),fechar seção> (token de fechar)
        Reservadas.put("end","END"); // <end, END> (token para fim de bloco)
        Reservadas.put("-","menos"); // <-, menos> (token de subtrair)
        Reservadas.put("+","mais"); // <+, mais> (token de somar)
        Reservadas.put("*","multiplica"); // <*, multiplicar> (token de multiplicar)
        Reservadas.put("/","dividir"); // </,dividir> (token de dividir)
    }
}
