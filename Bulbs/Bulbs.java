import java.util.Scanner;

public class Bulbs {
    public int bulbs(int[] A) {
        int ans =0;
        int state =0;
        for(int i=0;i<A.length;i++){
            if(A[i]==state){
                ans++;
            state = 1-state;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bulbs cm = new Bulbs();
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        System.out.println(cm.bulbs(A));
    }
}
