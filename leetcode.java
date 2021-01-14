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

     //question 46============start===============================================
    class Solution {
        List<Integer> smallAns = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        boolean[] vis =new boolean[21];
        public void permutation(int[] arr){
            if(smallAns.size()==arr.length){
                res.add(new ArrayList<>(smallAns));
                return;
            }
            
            for(int i =0 ;i < arr.length;i++){
                if(!vis[i]){
                vis[i]=true;
                smallAns.add(arr[i]);
                permutation(arr);
                smallAns.remove(smallAns.size()-1); 
                vis[i]=false;
            }
            }
            
        }
        public List<List<Integer>> permute(int[] nums) {
            permutation(nums);
            return res;
        }
         //====================End===============================================

         //=======================Start Leetcode 52 ===============================
         class Solution {
            boolean[] rowA;
            boolean[] colA;
            boolean[] diagA;
            boolean[] aDiagA;
           public void toggle(int r ,int c,int n){
               rowA[r]=!rowA[r];
               colA[c]=!colA[c];
               diagA[r-c+(n-1)]=!diagA[r-c+(n-1)];
               aDiagA[r+c]=!aDiagA[r+c];
           }
           public int nQueen(int tnq , int n , int idx ){
               if(tnq==0){
                   return 1;
               }
               int count=0;
               for(int i = idx ;i< n*n ;i++){
                   int r = i/n;
                   int c =i%n;
                   if(!rowA[r] && !colA[c] && !diagA[r-c+(n-1)] && !aDiagA[r+c]){
                       toggle(r,c,n);
                       count+=nQueen(tnq-1,n,i+1);
                       toggle(r,c,n);
                   }
               }
               
              return count; 
           }
           
           
           public int totalNQueens(int n) {
               rowA=new boolean[n];
               colA=new boolean[n];
               diagA=new boolean[n+n-1];
               aDiagA=new boolean[n+n-1];
               int tnq=n;
               int ans = nQueen(tnq,n,0);
               return ans;
               
           }
       }
       //===================END=====================================================
    }
}