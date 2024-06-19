import java.util.Arrays;
import java.util.HashMap;

    public class TwoSum{

        public static int[] twoSum(int[] nums, int target) {

            HashMap<Integer,Integer> hm = new HashMap<>();

            for(int i=0; i< nums.length ; i++){
                int complement = target - nums[i];

                if(hm.containsKey(complement)){

                    return new int[]{hm.get(complement), i};
                }

                hm.put(nums[i],i);     
            }

            return new int[]{1,-1};   
        }


    public static void main(String[] args) {
        
        // HashMap<Integer,Integer> hm = new HashMap<>();

        int[] nums =  {2,7,11,15};

        // for(int i=0; i< nums.length ; i++){
        //     // int complement = target - nums[i];

        //     hm.put(nums[i],i);     
        // }

        // for(Map.Entry<Integer,Integer> entry : hm.entrySet()){

        //     System.out.println(entry.getKey() +" " + entry.getValue());
        // }


        int[] arr = TwoSum.twoSum(nums, 10);

        System.out.println(Arrays.toString(arr));


    }


}