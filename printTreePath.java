import java.util.*;
class printTreePath {


    public static int printPath(int n){
        if(n==1 || n==0){
            System.out.println("base : "+n);
            return n ;
        }
        int ans = 0;
        System.out.println("pre : "+ n );

        ans+= printPath(n-1);
        System.out.println("In : " + n);
        ans+=printPath(n-2);
        System.out.println("Post : " + n );

        return ans;
    }
    public static void main(String[] args){
         Scanner scn = new Scanner(System.in);
         int n = scn.nextInt();
        int ans =  printPath(n);
        System.out.println(ans);


    }
    
}
