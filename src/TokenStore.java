import java.util.HashMap;

public class TokenStore {
    public static HashMap<String, String> idTokens = new HashMap<>();
    public static String [] cmd;
    private static Integer index = 0;
    public static Integer cmdCount = 1;
    public static Integer countTokens = 0;
    public boolean flag;

    TokenStore (){
        cmd = new String[30];
    }

    //Adiciona um token ao comando atual a ser analisado
    void addCMD(String token){
        // Se terminou de ler um comando adciona flag para analisador sintatico possa ler
        if (token.equals(";") || token.equals("end")) flag = true;
        cmd[index] = token;
        index++;
        countTokens++;
    }

    //Limpa o vetor comando para entrar outro comando a ser analisado
    void clearCMD(){
        cmd = new String[30];
        index = 0;
        cmdCount++;
    }

    //Mostra o comando atual para ser analisado com o Sintatico
    void getCMD (){
        if (flag == true){
            System.out.printf("\n%d° comando: ",cmdCount);
            int i = 0;
            System.out.printf("{");
            while (cmd[i] != null){
                System.out.printf("[%s] ",cmd[i]);
                i++;
            }
            System.out.printf("}\n\n");
            flag = false;
        }
    }
    // Pega todas os tokens id e seus valores
    void getAllTokensId(){
        System.out.println("\nValores dos Tokens IDs:");
        System.out.print("\n"+idTokens+"\n");
        System.out.println("______________________________________");
    }
}
