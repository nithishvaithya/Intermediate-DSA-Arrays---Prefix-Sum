import java.util.Scanner;
import java.util.TreeSet;

public class Subarrays {
    public int solve(String A) {
        TreeSet<Character> se = new TreeSet<>();
        se.add('a'); se.add('e'); se.add('i'); se.add('o'); se.add('u');
        se.add('A'); se.add('E'); se.add('I'); se.add('O'); se.add('U');
        
        int n = A.length();
        long ans = 0;
        for(int i = 0; i < n; i++){
            if(se.contains(A.charAt(i))){
                ans += (n - i);
            }
        }
        return (int)(ans%10003);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Subarrays s = new Subarrays();
        String A = sc.nextLine();
        System.out.println(s.solve(A));
    }
}
