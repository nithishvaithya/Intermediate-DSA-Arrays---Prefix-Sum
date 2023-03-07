import java.util.Arrays;
import java.util.Scanner;

public class SpecialSubsequence{
    public int solve(String A){
        String[] arr = new String[A.length()];
        arr = A.split("");
        int countg = 0;
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("G")){
                countg +=1;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("A")){
                ans += countg;
            }
            if(arr[i].equals("G")){
                countg -=1;
            }
        }
        return ans;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SpecialSubsequence s = new SpecialSubsequence();
        String A = sc.nextLine();
        System.out.println(s.solve(A));
    }
}