import java.io.*;
import java.util.ArrayList;


public class desserialize {
    public static ArrayList desserializer(){
//        Object e;
//        boolean x = true ;
        FileInputStream fis;
        ObjectInputStream ois;
        ArrayList<utilisateur> users = new ArrayList<>();
        try {
            fis = new FileInputStream("D:\\programing\\TP01M1STIC\\src\\users.txt" );
            ois = new ObjectInputStream(fis);
//           while(x){
//               e = ois.readObject();
//               if(e instanceof utilisateur){
//                   System.out.println(((utilisateur)e).nom +" ,"+ ((utilisateur)e).prenom +" ,"+ ((utilisateur)e).user +" ,"+ ((utilisateur)e).mdp +" ,"+ ((utilisateur)e).num);
//               }else{
//                   x= false;
//               }
//
//
//           }
            users = (ArrayList<utilisateur>) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException z) {
            System.out.println("error found");


        }
        return users;
    }
}
