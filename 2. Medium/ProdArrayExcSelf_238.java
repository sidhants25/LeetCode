public class ProdArrayExcSelf_238 {
    
    public int[] productExceptSelf(int[] nums) {

        int[] arr = new int[nums.length];
        int currProd = 1;
        arr[0] = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            currProd *= nums[i];
            arr[i+1] = currProd;
        }

        currProd = 1;

        for (int i = nums.length - 1; i > 0; i--) {
            currProd *= nums[i];
            arr[i-1] *= currProd;
        }
        
        return arr;
    }
}