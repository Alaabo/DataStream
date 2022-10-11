import java.io.*;
import java.util.Scanner;

public class TP1EXO2 {
    public static void main(String[] args) {

        File F = new File("D:\\programing\\TP01M1STIC\\src\\test.txt");

        try {
            long IntTIme1 = System.currentTimeMillis();
            Scanner sc = new Scanner(F);
            while (sc.hasNextLine()) {
                sc.nextLine();

            }
            long SecondReadTime = System.currentTimeMillis();
            sc.close();
            long IntTIme = System.currentTimeMillis();
            BufferedReader b = new BufferedReader( new FileReader("D:\\programing\\TP01M1STIC\\src\\test.txt"));
            while (b.readLine() != null) {

            }
            long ReadTime = System.currentTimeMillis();
            System.out.println(SecondReadTime-IntTIme1);
            System.out.println(ReadTime-IntTIme);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
