package TotalJava.Recursion;
//size of tile is 2*1 , size of block is 2 * n , find the number of ways we can set the tiles
public class TilingProblem {
    public static void main(String [] args){
        int n = 4 ;
        System.out.println(tilingProblem(n));
    }

    public static int tilingProblem(int n) {
        if(n==0||n==1){
            return 1;
        }

        int nm1 = tilingProblem(n-1);
        int nm2 = tilingProblem(n-2);

        return nm1+nm2;
    }
}
