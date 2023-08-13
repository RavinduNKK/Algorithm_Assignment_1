public class AssignmentTask4 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            
            left++;
            right--;
        }

            System.out.print("Modified nums array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
