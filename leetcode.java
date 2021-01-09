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


    //question 40============start===============================================
    class Solution {
        List<Integer> smallAns = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        public void combination(int[] arr , int idx , int target){
            if(idx==arr.length || target == 0){
                if(target==0){
                    res.add(new ArrayList<>(smallAns));
                }
                return ;
            }
            int prev =-1;
            for(int i =idx ; i< arr.length;i++){
                if(prev!=-1 && arr[prev]==arr[i]){
                    continue;
                }
                if(target-arr[i]>=0){
                    smallAns.add(arr[i]);
                    combination(arr,i+1,target-arr[i]);
                    smallAns.remove(smallAns.size()-1);
                }
                 prev=i;
            }         
            
            
        }
        public List<List<Integer>> combinationSum2(int[] arr, int target) {
            Arrays.sort(arr);
            combination(arr,0,target);
            return res;
            
        }
    }
    //===========================end===========================================


}