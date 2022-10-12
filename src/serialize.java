import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serialize {



    public static void serializer(Object user) {

        try {
            FileOutputStream fout = new FileOutputStream("D:\\programing\\TP01M1STIC\\src\\users.txt" , true);
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(user);
            oos.close();
            fout.close();
            System.out.println("object serialized succefully");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
