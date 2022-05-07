import java.util.Scanner;

public class Fibonacy {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number Strting");
       int n1=sc.nextInt();

        int t1=0,t2=1,temp=1,c=0;

        for (int i = 1; i <= n1+5; i++) {
            // System.out.println(t1);
           if(t1>=n1 && c<5){
               System.out.println(t1);
               c++;
           }
            
            temp=t1+t2; 
            t1=t2;
            t2=temp; 
        }

        // for (int i = 0; i < a.length; i++) {
            
        // }

    }
}
