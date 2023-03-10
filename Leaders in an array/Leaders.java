import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Leaders {
    public int[] solve(int[] A) {
        int N = A.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int max = A[N-1];
        ans.add(max);
        for(int i=N-2;i>=0;i--){
            if(A[i]>max){
                max = A[i];
                ans.add(max);
            }
        }
        int[] arr = ans.stream().mapToInt(i -> i).toArray();
        return arr;

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Leaders cm = new Leaders();
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        System.out.println(cm.solve(A));
    }
}
