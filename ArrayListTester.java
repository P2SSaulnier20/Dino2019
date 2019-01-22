
/**
 * Write a description of class ArrayListTester here.
 *
 * @author (Big Small man)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListTester
{
    public static void main (String[] args)
    {
      System.out.print("How many Words:");
      Scanner scan = new Scanner(System.in);
      Scanner scan2 = new Scanner(System.in);
      int numWords = scan.nextInt();
      System.out.println(numWords);
      
      // Create an ArrayList of words
      ArrayList<String> words = new ArrayList<String>();
      
      // Add the a word to the word list
      System.out.println(words.size());
      words.add("fun");
      words.add("work");
      words.add(0,"sleep");
      System.out.println(words.size());
      System.out.println(words);
      words.remove("fun");
      System.out.println(words);
    }
}
