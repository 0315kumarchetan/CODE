import java.util.Scanner;
public class PrintMazePathWithMultipleJumpWithDirArray {

    public static Scanner scn = new Scanner(System.in);
    public static int PrintMazePathWithMultiJumpWithDirArrayFun(int sr,int sc,int dr,int dc,int[][]dir,String[]dirS,boolean[][] vis,String psf){
        if(sc==dc && sr==dr){
            System.out.println(psf);
            return 1;
        }
        int count=0;
        int n=vis.length;
        int m = vis[0].length;
        vis[sr][sc]=true;
        for(int d = 0;d<dir.length;d++){
            for(int j =1;j<=Math.max(m,n);j++){
            int r = sr+j*dir[d][0];
            int c = sc+j*dir[d][1];
                if( r>=0 && c>= 0 && r<n && c<m && vis[r][c]==false) 
                count+=PrintMazePathWithMultiJumpWithDirArrayFun(r, c, dr, dc, dir, dirS, vis, psf+dirS[d]+j);
            
               
            }
        }
        
        vis[sr][sc]=false;
        return count;
    }
    public static void main(String[] args) {
        int row =scn.nextInt();
        int col = scn.nextInt();
        int[][] dir = {{1,0},{-1,0},{1,1},{-1,-1},{0,1},{0,-1},{-1,1},{1,-1}};
        String[] dirS ={"D","U","S","N","R","L","E","W"};
        boolean [][]vis = new boolean[row][col];
        int count=PrintMazePathWithMultiJumpWithDirArrayFun(0,0,row-1,col-1,dir,dirS,vis,"");  
        System.out.println(count);
    }
    
}