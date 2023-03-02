import java.util.Arrays;
import java.util.Scanner;
import java.util.jar.Manifest;

public class Solution {
    public int solve(int[] A){
        int[] PS = new int[A.length];
        int count =0;
        PS[0] = A[0];
        for(int i=1;i<A.length;i++){
            PS[i] = PS[i-1]+A[i];     
        }
        int SL =0;
        for(int i=0;i<PS.length;i++){
            if(i!=0){
               SL = PS[i-1]; 
            }

            int SR = PS[PS.length-1] - PS[i];

            
            if(SL==SR){
                count = i;
                break;
            }
            
        }
        if(count==0){
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