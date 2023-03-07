import java.util.Arrays;
import java.util.Scanner;
import java.util.jar.Manifest;

public class Solution {
    public int solve(int[] A){
        //int[] PS = new int[A.length];
        int total_sum =0;
        int count =-1;
        for(int i=0;i<A.length;i++){
            total_sum += A[i];
        }
        int SL =0;
        int SR =total_sum-A[0];
        if(SL == SR){
            count = 0;
        }
        else{
            for(int i=1;i<A.length;i++){
                SL = SL + A[i-1];
                SR = SR - A[i];
                if(SL == SR){
                    count =i;
                    break;
                }
            }
        }

        // PS[0] = A[0];
        // for(int i=1;i<A.length;i++){
        //     PS[i] = PS[i-1]+A[i];     
        // }
        // int SL =0;
        // for(int i=0;i<PS.length;i++){
        //     if(i!=0){
        //        SL = PS[i-1]; 
        //     }

        //     int SR = PS[PS.length-1] - PS[i];

            
        //     if(SL==SR){
        //         count = i;
        //         break;
        //     }
            
        // }
        if(count==-1){
            return -1;
        }
        else{
            return count;
        } 


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        System.out.println(s.solve(A));
    }
}