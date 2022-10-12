import java.util.ArrayList;
import java.util.Scanner;




public class exo3 {
    private static String x = "1";
    static ArrayList<utilisateur> users = new ArrayList<>();
    static ArrayList<utilisateur> fetched = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("please insert your data");

        while(x.equals("1")){
            input();
            System.out.println("if you want to insert new user type 1 ");
            System.out.println("if you want to end adding new users type anything else ");
            x = sc.nextLine();

        }
        for (Object x : users)
            serialize.serializer(x);

        fetched = desserialize.desserializer();
        for (utilisateur  x : fetched)
            System.out.println(x.nom + "  " + x.prenom + "  " + x.user+ "  " +x.mdp+ "  " +x.num);
    }
    public static void input() {

        System.out.println("enter the name :");
        String nom = sc.nextLine();
        System.out.println("enter the prenom :");
        String pre = sc.nextLine();
        System.out.println("enter the user :");
        String user = sc.nextLine();
        System.out.println("enter the password :");
        String psw = sc.nextLine();
        System.out.println("enter the number :");
        String num = sc.nextLine();
        users.add(new utilisateur(nom , pre ,user , psw , num));
    }

}
