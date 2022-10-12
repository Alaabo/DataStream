import java.io.*;
import java.util.ArrayList;


public class desserialize {
    public static ArrayList desserializer(){
        Object e;
        boolean x = true ;
        FileInputStream fis;
        ObjectInputStream ois;
        ArrayList<utilisateur> users = new ArrayList<>();
        try {
            fis = new FileInputStream("D:\\programing\\TP01M1STIC\\src\\users.txt" );
            ois = new ObjectInputStream(fis);
           while(x){
               e = ois.readObject();
               if(e instanceof utilisateur){
                   users.add((utilisateur)e);
               }else{
                   x= false;
               }


           }
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException z) {
            System.out.println("error found");


        }
        return users;
    }
}
