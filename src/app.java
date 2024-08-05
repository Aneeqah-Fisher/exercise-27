import java.util.Scanner;
import java.util.Arrays;

public class app{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        // Sort the string
        String sortedString = sort(s);

        // Display the sorted string
        System.out.println("The sorted string is: " + sortedString);

        input.close();
    }

    public static String sort(String s) {
        // Convert the string to a char array
        char[] charArray = s.toCharArray();

        // Sort the char array
        Arrays.sort(charArray);

        // Convert the sorted char array back to a string
        return new String(charArray);
    }
}
