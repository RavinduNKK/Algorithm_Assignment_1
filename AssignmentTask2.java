public class AssignmentTask2 {
    public static void main(String[] args) {
         
         int[] nums = {-5, 2, 7, 10, 58, -7, 8, 23};

         int smallest = nums[0]; 
         int largest = nums[0];  

         for (int i = 1; i < nums.length; i++) {
            if(nums[i] < smallest) {
                smallest = nums[i]; 
            }
            
            if(nums[i] > largest) {
                largest = nums[i]; 
            }
         }

         System.out.println("The smallest value is: " + smallest);
         System.out.println("The largest value is: " + largest);
    }
}
