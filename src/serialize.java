import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class serialize {



    public static void serializer(Object user) {
        ArrayList buffer = new ArrayList<>();
        buffer = _emty.buffering();
        buffer.add((utilisateur)user);
        try {
            new FileOutputStream("D:\\programing\\TP01M1STIC\\src\\users.txt" ).close();
            FileOutputStream fout = new FileOutputStream("D:\\programing\\TP01M1STIC\\src\\users.txt" , true);
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            for(Object x : buffer)
                oos.writeObject(x);
            oos.writeObject(new endoffile());
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
