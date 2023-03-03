import java.util.Arrays;
import java.util.Scanner;

public class RangeSum {
    public long[] rangeSum(int[] A, int[][] B) {
        long[] result_arr = new long[B.length];
        int N = A.length;
        long[] PS = new long[N];
        PS[0] = A[0];
        for(int i=1;i<N;i++){
            PS[i] = PS[i-1]+A[i];
        }
        for(int i=0;i<B.length;i++){
                long sum =0;
                if(B[i][0] == 0){
                    sum = PS[B[i][1]];
                }
                else{
                    sum = PS[B[i][1]] - PS[B[i][0]-1];
                }
                result_arr[i] =sum;
            
        }
  
        return result_arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RangeSum s = new RangeSum();
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        int[][] B = new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                B[i][j] = sc.nextInt();
            }
        }
        System.out.println(s.rangeSum(A, B));
    }
}
