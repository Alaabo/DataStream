//todo create buffer to read all existing all users
//todo setup the serializer and the deserializer
import java.util.ArrayList;

public class _emty {
    public _emty() {

    }
    public static ArrayList buffering(){
        ArrayList<utilisateur> users = new ArrayList<>();
        ArrayList<Object> buffer = new ArrayList<>();
        buffer = desserialize.desserializer();
        for (Object o : buffer )
            if(!(o == null)){ users.add((utilisateur) o); }

        return users;
    }
}
