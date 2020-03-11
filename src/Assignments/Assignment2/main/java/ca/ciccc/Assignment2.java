package ca.ciccc;

/**
 * This is the starter file for the Assignment 2
 *
 * @author Derrick Park
 * @version 1.0
 */
public class Assignment2 {
    /**
     * Write nested for-loops to produce the following output from the given input n.
     * @param n number to create a pattern.
     * @return pattern
     * Sample Input / Output
     * numberLoops(3);
     * Sample Output
     * ..1
     * .22
     * 333
     */
    public String numberLoops(int n) {
        int counter1 = n-1, counter2=1;
        String result="";
        if (n > 1) {
            for (int i = 1; i <= n; i++){
                for (int j = 1; j <= counter1; j++) { result=result+"."; }
                for (int k = 1; k <= counter2; k++) { result=result+counter2; }
                counter1--; counter2++;
                if (counter2 <= n) result=result+"\n";
            }
        }
        else{
            result="1";
        }
        return result;
    }
    
    /**
     * Given an array of integers, return true if the number of 1s is greater than the number of 7s
     * @param nums array of ints
     * @return true if the number of 1s is greater than the number of 7s
     */
    public boolean countNumbers(int[] nums) {
        int counterOne = 0, counterSeven = 0;
            if (nums.length>0){
            for(int num: nums){
                if (num==1)counterOne++;
                else if(num==7) counterSeven++;
            }
            if (counterOne>counterSeven) return true;
            else return false;
        }
        else
            return false;
    }

    /**
     * Return the sum of numbers in the array, returning 0 for an empty array. Except the number 13
     * is very unlucky, so it does not count the number that comes immediately after a 13, also 13 itself
     * does not count.
     * @param nums array of numbers
     * @return the sum except for 13
     *
     * Sample Input / Output
     * sumExcept13({1, 2, 2, 1}) -> 6
     * sumExcept13({1, 2, 2, 1, 13} -> 6
     * sumExcept13({1, 2, 13, 2, 1, 13} -> 4
     */
    public int sumExcept13(int[] nums) {
        if (nums.length<1) return 0;
        else{
            int sum=0,numBefore=0;
            for (int num: nums) {
                if (numBefore==13){ numBefore=num; continue; } numBefore=num;
                if (num==13) continue;
                sum=sum+num;
            }
            return sum;
        }
    }

    /**
     * Return an array that is "left shifted" by one -- so {6, 2, 5, 3} return {2, 5, 3, 6}.
     * You may modify and return the given array, or return a new array.
     * @param nums array of ints
     * @return shifted array
     *
     * Sample Input / Output
     * shiftArray({6, 2, 5, 3}) -> {2, 4, 3, 6}
     * shiftArray({2, 3}) -> {3, 2}
     * shiftArray({7}) -> {7}
     */
    public int[] shiftArray(int[] nums) {
        if (nums.length <=1) return nums;
        int[] nums2 = new int [nums.length];
        for (int i = 1; i < nums.length; i++) { nums2[i-1] = nums[i]; }
        nums2[nums2.length-1] = nums[0];
        return nums2;
    }

    /**
     * Return true if the array contains three increasing adjacent numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains three increasing adjacent numbers, otherwise false.
     */
    public boolean tripleIncreasingOrder(int[] nums) {
        if(nums.length < 3) return false;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]+1) {
                count++;
                if (count == 3) break;
            }else count=1;
        }
        if (count == 3) return true;
        else return false;
    }

    /**
     * Return true if the array contains the same number of odds and even numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains the same number of odds and even numbers, otherwise false.
     */
    public boolean evenOrOdd(int[] nums){
        int count1 = 0,count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2==0) count2++;
            else count1++;
        }
        if (count1 == count2) return true;
        else return false;
    }
}

