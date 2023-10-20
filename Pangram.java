import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {
    public static boolean isPangram(String str) {
        str = str.toLowerCase();
        Set<Character> alphabetSet = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                alphabetSet.add(c);
            }
        }
        return alphabetSet.size() == 26;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = scanner.nextLine();

        if (isPangram(s)) {
            System.out.println("The input string is a pangram.");
        } else {
            System.out.println("The input string is not a pangram.");
        }
    }
}
