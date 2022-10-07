public class exo3 {
    public static void main(String[] args) {
        utilisateur u1 = new utilisateur("alaa1" , "bou" , "alaabo" , "test" , "0666666");
        utilisateur u2 = new utilisateur("alaa2" , "bou" , "alaabo" , "test" , "0666666");
        utilisateur u3 = new utilisateur("alaa3" , "bou" , "alaabo" , "test" , "0666666");
        utilisateur u4 = new utilisateur("alaa4" , "bou" , "alaabo" , "test" , "0666666");
//        serialize.serializer(u1);
        serialize.serializer(u2);
        serialize.serializer(u3);
        serialize.serializer(u4);
        desserialize.desserializer();
    }
}
