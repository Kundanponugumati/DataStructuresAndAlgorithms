import java.util.Scanner;

public class ExtractNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < testCases; i++) {
            String inputString = scanner.nextLine();
            StringBuilder extractedNumber = new StringBuilder();

            for (char ch : inputString.toCharArray()) {
                if (Character.isDigit(ch) && ch != '9') {
                    extractedNumber.append(ch);
                } else if (extractedNumber.length() > 0) {
                    System.out.print(extractedNumber+" ");
                    extractedNumber = new StringBuilder();
                }
            }

            if (extractedNumber.length() > 0) {
                System.out.println(extractedNumber);
            }
        }
    }
}
