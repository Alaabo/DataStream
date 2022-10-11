import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;



public class TP1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner( new File("test.txt"));
        File F = new File("D:\\programing\\TP01M1STIC\\src\\test.txt");
        int counterLine = 0;
        int counterWords = 0;
        int counterChar = 0;
        try {
            Scanner sc = new Scanner(F);
            while (sc.hasNextLine()) {

               String ligne=  sc.nextLine();
               counterChar+=ligne.length();
                counterLine = counterLine + 1;
                String[] words = ligne.split(" ");
                counterWords += words.length;
            }
            sc.close();
            System.out.println(""+counterLine);
            System.out.println(counterChar);
            System.out.println(counterWords);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
