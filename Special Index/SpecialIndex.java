import java.util.Arrays;
import java.util.Scanner;

public class SpecialIndex {
    public int solve(int[] A){
        int N=A.length;
        int PSE[]=new int[N];
        int PSO[]=new int[N];

        PSE[0]=A[0];                        
        for(int i=1; i<N; i++)
        {
            if(i%2==0)
            {
                PSE[i]=PSE[i-1]+A[i];
            }
            else{
                PSE[i]=PSE[i-1];
            }
           
        }
       
        PSO[0]=0;
        for(int i=1; i<N; i++)
        {
            if(i%2!=0)
            {
                 PSO[i]=PSO[i-1]+A[i];
            }
            else{              
                PSO[i]=PSO[i-1];
            }
        }

        int count=0;
        for(int i=0; i<N; i++)
        {
            int Se=0;
            int So=0;
            if(i!=0)
            {
                Se=PSE[i-1] + PSO[N-1] - PSO[i];
                So=PSO[i-1] + PSE[N-1] - PSE[i];
            }
            else{
                Se=PSO[N-1] ;
                So=PSE[N-1] ;
            }
           
            if(Se==So)
            {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SpecialIndex s = new SpecialIndex();
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        System.out.println(s.solve(A));
    }

}
