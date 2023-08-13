import java.util.Scanner;

public class AssignmentTask6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence (ASCII characters only): ");
        String input = scanner.nextLine();
        
        if (!input.isEmpty()) {
            String[] words = input.split(" ");
            StringBuilder reversed = new StringBuilder();
            
            for (int i = words.length - 1; i >= 0; i--) {
                reversed.append(words[i]).append(" ");
            }
            
            System.out.println("Reversed sentence: " + reversed.toString().trim());
        } else {
            System.out.println("Input is empty. Please enter a valid sentence.");
        }
        
        scanner.close();
    }
}
