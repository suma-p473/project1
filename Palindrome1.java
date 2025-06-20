import java.util.Scanner;

public class StringPali{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a string");
        String str = scanner.nextLine();
        String rev = "";

        for (int i = 0; i < str.length(); i++) {
            reversed = str.charAt(i) + rev;
        if (str.equals(rev))
            System.out.println("is a palindrome");
        else
            System.out.println("is not a palindrome");
    }
}
