import java.util.Scanner;

public class EvenSubarray {
    public String solve(int[] A) {
        String ans ="NO";
        int N = A.length;
        if(N%2 ==0){
            if(A[0]%2==0 && A[A.length-1]%2==0){
                ans ="YES";
            }
        }
        return ans;
      
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EvenSubarray cm = new EvenSubarray();
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        System.out.println(cm.solve(A));
    }
}
