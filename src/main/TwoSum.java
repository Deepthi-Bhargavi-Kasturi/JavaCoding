import java.util.HashMap;
import java.util.Arrays;

class Solution {

  public int[] twoSum(int[] nums, int target) {

      //My Approach using HashMap
      int lenOfArr = nums.length;
      int diff = 0;
      int[] arr = new int[2];

      HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

      for(int i = 0; i < lenOfArr; i+=1) {
          //System.out.println("i:"+i);
          diff = target - nums[i];

          if(hm.containsKey(diff)) {
              arr[0] = hm.get(diff);
              arr[1] = i;
              return arr;
          } else {
              hm.put(nums[i], i);
          }
      }

      return arr;


  }

}

class Solution2 {

  public int[] twoSum2(int[] nums, int target) {

      //Optimized code as per LC
      int count = 0;
      for(int i = 1;i<nums.length;i++){

          for(int j = i;j<nums.length;j++){
             //System.out.println(count++);
              if(nums[j]+nums[j-i] == target)
                 return new int[]{j,j-i};
          }

      }
      return null;
  }

}


class Main {
  public static void main(String[] args) {

    //Array Declaration
    int[] nums = {2,11,33,15,27,8,19,0,23,34,35,46,98,55,51,7};

    
    //Instantiation
    Solution twoSumPgm = new Solution(); //HashMap sol
    Solution2 twoSumPgm2 = new Solution2();//Two pointer, nested loop solution
    

    /////Approach 1 - Stats
    System.out.println("First Way: Using HashMap and single for loop=====");
    long startTime = System.currentTimeMillis();
    System.out.println("Start Time:::::"+startTime);

    //Call
    System.out.println("Result: "+Arrays.toString(twoSumPgm.twoSum(nums, 9)));

    long endTime   = System.currentTimeMillis();
    System.out.println("End Time:::::"+endTime);
    long totalTime = endTime - startTime;
    System.out.println("Total Time:::::"+totalTime);

    /////Approach 2 -- stats
    System.out.println("   ");
    System.out.println("Second Way: Two Pointer Approach with nested for loops=====");

    long startTime2 = System.currentTimeMillis();
    System.out.println("Start Time:::::"+startTime2);

    //Call
    System.out.println("Result: "+Arrays.toString(twoSumPgm2.twoSum2(nums, 9)));

    long endTime2   = System.currentTimeMillis();
    System.out.println("End Time:::::"+endTime2);
    long totalTime2 = endTime2 - startTime2;
    System.out.println("Total Time:::::"+totalTime2);


    
  }
}