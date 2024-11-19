package IDS;

public class IDsReservados {

    public static String [][] ids;

    public IDsReservados(){
        ids = new String[50][3]; // Armazena 50 IDS, |id|tipo|valor|
    }

    public static boolean IDexists(String id){
        for(int i = 0; i < 5; i++){
            if(id.equals(ids[i][0])){
                return true;
            }
        }
        return false;
    }

    public static boolean inicializaded(String id){
        for(int i = 0; i < 5; i++){
            if(id.equals(ids[i][0])){
                if(ids[i][2] != "null"){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean addValorID(String id,String tipo, String valor){
        for(int i = 0; i < 5; i++){
            if(ids[i][0]==id){
                if(ids[i][2] == null || ids[i][2] == ""){
                    ids[i][1] = tipo;
                    ids[i][2] = valor;
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean addInicializaded(String id,String valor){
        for(int i = 0; i < 5; i++){
            if(id.equals(ids[i][0])){
                if(ids[i][2] == null || ids[i][2] == ""){
                    ids[i][2] = valor;
                    return true;
                }
            }
        }
        return false;
    }
    public void setValorID(String id, String valor) {
        for(int i = 0; i < 5; i++){
            if(id.equals(ids[i][0])){
                ids[i][2] = valor;
            }
        }
    }

    public String getTipoID(String id) {
        for(int i = 0; i < 5; i++){
            if(id.equals(ids[i][0])){
                return ids[i][1];
            }
        }
        return null;
    }

    public static void addID(String id, String tipo, String valor){
        for(int i = 0; i < 50; i++){
            if (ids[i][0] == null){
                ids[i][0] = id;
                ids[i][1] = tipo;
                ids[i][2] = valor;
                break;
            }
        }
    }

    // Pega todas os tokens id e seus valores
    public static void getAllTokensId(){
        System.out.println("\nValores dos Tokens IDs:\n");
        System.out.println("______________________________________");
        for(int i = 0; i < 50; i++){
            if(ids[i][0] != null){
                System.out.printf("ID-> [%s] Tipo-> [%s] Valor-> [%s]\n", ids[i][0], ids[i][1], ids[i][2]);
            }
        }
        System.out.println("______________________________________\n");
    }



}
