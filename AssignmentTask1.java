import java.util.Scanner;

public class AssignmentTask1 {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        do {
            System.out.println("Enter a number");
            int search = scanner.nextInt();

            if (search > 0) {
                int[] myArray = new int[search];
                myArray[0] = 0;
                myArray[1] = 1;

                System.out.print(myArray[0] + ", " + myArray[1]);

                for (int i = 2; i < myArray.length; i++) {
                    myArray[i] = myArray[i - 1] + myArray[i - 2];
                    System.out.print(", " + myArray[i]);
                }
                
                System.out.println(); 
            } else {
                System.out.println("Please enter a positive number");
            }
        } while (true);
    }
}
