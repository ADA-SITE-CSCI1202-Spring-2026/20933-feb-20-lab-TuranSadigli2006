import java.util.Scanner;

public class Stringreverse {

    // b) Method that takes a String and returns its reverse
    public static String reverseString(String text) {
        StringBuilder reversed = new StringBuilder();

        // c) Using charAt(index)
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a) Given a string, reverse it
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = reverseString(input);
        System.out.println("Reversed string: " + result);

        sc.close();
    }
}