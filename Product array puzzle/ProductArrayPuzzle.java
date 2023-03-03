import java.util.Arrays;
import java.util.Scanner;

public class ProductArrayPuzzle {
    public int[] solve(int[] A) {
        int product =1;
        int[] res_arr = new int[A.length];
        for(int i=0;i<A.length;i++){
            product *= A[i];
        }
        for(int i=0;i<A.length;i++){
            res_arr[i] = product/A[i];
        }
        System.out.println(Arrays.toString(res_arr));
        return res_arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductArrayPuzzle te = new ProductArrayPuzzle();
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        System.out.println(te.solve(A));
    }
}
