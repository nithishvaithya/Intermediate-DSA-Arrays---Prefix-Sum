import java.util.Scanner;

public class PickbothSides {
    public int solve(int[] A, int B) {
        int n = A.length;
        int sum =0;
        for(int i=0;i<B;i++){
            sum += A[i];
        }
        int max = sum, j = n-1;
        for(int i = B-1;i>=0;i--){
            sum = sum-A[i]+A[j];
            j--;
            if(sum>max){
                max = sum;
            }
            
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PickbothSides s = new PickbothSides();
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        System.out.println(s.solve(A,B));
    }
}
