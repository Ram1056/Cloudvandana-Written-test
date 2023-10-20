import java.util.Scanner;

public class RomanNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String a = scanner.nextLine();
        int result = romanToInteger(a);
        System.out.println("The integer value of " + a + " is: " + result);
    }

    public static int romanToInteger(String s) {
        // Define the values of Roman numerals
        int[] values = {1000, 500, 100, 50, 10, 5, 1};
        String romanChars = "MDCLXVI";

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int value = values[romanChars.indexOf(c)];

            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }
            prevValue = value;
        }

        return result;
    }
}
