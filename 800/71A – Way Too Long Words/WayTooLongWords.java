import java.util.*;

public class WayTooLongWords{
public static String waytoolong( String word){
 if (word.length() > 10) {
            return word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1);
        } else {
            return word;
        }
}
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your word: ");
    int n = sc.nextInt();
    sc.nextLine();

    for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            System.out.println(waytoolong(word));
        }

        sc.close();
}
}
