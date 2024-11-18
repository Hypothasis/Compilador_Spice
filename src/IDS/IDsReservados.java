package IDS;

public class IDsReservados {

    public static String [][] ids;

    public IDsReservados(){
        ids = new String[50][3]; // Armazena 50 IDS, |id|tipo|valor|
    }

    public static boolean IDexists(String id){
        for(int i = 0; i < 50; i++){
            if(ids[i][0]==id){
                return true;
            }
        }
        return false;
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
        System.out.println("\nValores dos Tokens IDs:");
        System.out.print("\n");
        for(int i = 0; i < 50; i++){
            if(ids[i][0] != null){
                System.out.print("\t"+ids[i][0]);
            }
        }
        System.out.print("\n");
        System.out.println("______________________________________");
    }
}
