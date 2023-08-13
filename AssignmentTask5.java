import java.util.Scanner;

public class AssignmentTask5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a text (ASCII only): ");
        String input = scanner.nextLine();
        
        if (!input.isEmpty()) {
            String reversedText = "";
            
            for (int i = input.length() - 1; i >= 0; i--) {
                reversedText += input.charAt(i);
            }
            
            System.out.println("Reversed text: " + reversedText);
        } else {
            System.out.println("Input is empty. Please enter a valid text.");
        }
        
        scanner.close();
    }
}
