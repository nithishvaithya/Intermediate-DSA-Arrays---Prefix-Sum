import java.util.Scanner;

public class TimeEquality {
    public int solve(int[] A) {
        int seconds =0;
        int max =0;
        for(int i=0;i<A.length;i++){
            if(A[i]>max){
                max = A[i];
            }
        }
        for(int i=0;i<A.length;i++){
            seconds += max-A[i];
        }
        return seconds;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TimeEquality te = new TimeEquality();
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        System.out.println(te.solve(A));
    }
}
