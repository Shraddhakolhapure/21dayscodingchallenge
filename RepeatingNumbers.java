public class RepeatingNumbers {

    public static void findRepeatingNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]); // Get the index to mark the presence
            
            // Check if the element at index is negative
            if (nums[index] >= 0) {
                nums[index] = -nums[index]; // Mark its presence by making it negative
            } else {
                System.out.print(index + " "); // Already visited, so it's a repeating number
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 4, 2, 5};
        System.out.println("Repeating numbers:");
        findRepeatingNumbers(nums);
    }
}
