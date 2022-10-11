import java.io.*;


public class desserialize {
    public static void desserializer(){
        Object e = null;
        FileInputStream fis;
        ObjectInputStream ois;
        try {
            fis = new FileInputStream("D:\\programing\\TP01M1STIC\\src\\users.txt");
            ois = new ObjectInputStream(fis);
           while(((e = ois.readObject()) instanceof  endoffile) == false){

               System.out.println(((utilisateur)e).nom +" ,"+ ((utilisateur)e).prenom +" ,"+ ((utilisateur)e).user +" ,"+ ((utilisateur)e).mdp +" ,"+ ((utilisateur)e).num);


           }
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();

        }

    }
}
