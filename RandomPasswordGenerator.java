import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomPasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = scanner.next();
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        String password = generatePassword(firstName, number);
        System.out.println("Your password is: " + password);
        scanner.close();
    }

    public static String generatePassword(String firstName, int number) {
        String password = firstName + number;
        List<Character> chars = new ArrayList<>();
        for (char c : password.toCharArray()) {
            chars.add(c);
        }
        Collections.shuffle(chars, new Random());
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            sb.append(c);
        }
        return sb.toString();
    }
}
