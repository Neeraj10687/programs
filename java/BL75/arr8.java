import java.util.*;
class Solution {
    public static void longestConsecutive(int[] nums) {

        Set<Integer> hset =new HashSet<>();
        for(Integer n: nums){
            hset.add(n);
        }

        int length =0;
        int longes =0;

        for(Integer num:hset){
            if(!hset.contains(num-1)){
                length=0;
                while(hset.contains(num+length)){
                    length+=1;
                }
                longes=Math.max(length,longes);
            }
        }
        System.out.println(longes);

        
    }
    public static void main(String args[]){
      int pp[] = new int[]{100,2,3,5,399,4};

      longestConsecutive(pp);
      
    }
}

