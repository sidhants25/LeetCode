public class BinarySearch_704{

//704. Binary Search

public int search(int[] nums, int target) {

        return biSearch (nums, 0, nums.length-1, target);
        
    }

public int biSearch (int[] nums, int lo, int hi, int target) {

    if (hi == lo ) {
        if (nums[lo] == target){
            return lo;
        }
        else {
            return -1;
        }
    }

    int mid = (lo+hi)/2;

    if (nums[mid] == target){
        return mid;
    }
    else if (nums[mid] < target) {
        return biSearch (nums, mid+1, hi, target);
    }
    else {
        return biSearch (nums, lo, mid, target);
    }

}

}