public class leetcode {

    //question 39=============Start=========================================
    class Solution {
        List<List<Integer>> res =  new ArrayList<>();
        List<Integer> smallAns = new ArrayList<>();
        public void combination(int[] arr , int idx ,int target){
            if(idx==arr.length || target==0){
                if(target==0){
                    res.add(new ArrayList<>(smallAns));
                }
                return;
            }
            if(target-arr[idx]>=0){
                smallAns.add(arr[idx]);
                combination(arr,idx,target-arr[idx]);
                smallAns.remove(smallAns.size()-1);
            }
            combination(arr,idx+1,target);
            
        }
        public List<List<Integer>> combinationSum(int[] arr, int target) {
            combination(arr,0,target);
            return res;
            
        }
    }

    //=======================END=================================================



}