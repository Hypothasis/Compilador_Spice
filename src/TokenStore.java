import java.util.HashMap;

public class TokenStore {
    public static HashMap<String, String> idTokens = new HashMap<>();
    public static String [] cmd;
    private static Integer index = 0;
    private static Integer cmdCount = 1;

    TokenStore (){
        cmd = new String[30];
    }

    //Adiciona um token ao comando atual a ser analisado
    void addCMD(String token){
        cmd[index] = token;
        index++;
    }

    //Limpa o vetor comando para entrar outro comando a ser analisado
    void clearCMD(){
        cmd = new String[30];
        index = 0;
        cmdCount++;
    }

    //Mostra o comando atual para ser analisado com o Sintatico
    void getAllCMD (){
        System.out.printf("\n%d° comando: ",cmdCount);
        int i = 0;
        System.out.printf("{");
        while (cmd[i] != null){
            System.out.printf("[%s] ",cmd[i]);
            i++;
        }
        System.out.printf("}\n\n");
    }
    // Pega todas os tokens id e seus valores
    void getAllTokensId(){
        System.out.print("\n"+idTokens+"\n");
    }
}
