import java.util.*;

public class Honeycomb {
    public static void main(String[] args) {
        // My solution
        Scanner sc = new Scanner(System.in);
        Double input = sc.nextDouble();
        sc.nextLine();
        sc.close();

        int i = 1;
        while(true){
            int a = 3*i*(i-1)+1; //계차수열을 이용 an = a1 + sum b(n-1)
            if ( a >= input ) break; 
            i++;
        }
        System.out.println(i);

        // ** Other solution

        // Scanner sc = new Scanner(System.in);
        // int input = sc.nextInt();
        // sc.nextLine();
        // sc.close();
        
        // int i = 1;
        // while (input > 1){
        //     input -= i*6;
        //     i++;
        // }
        // System.out.println(i);
    }
}
