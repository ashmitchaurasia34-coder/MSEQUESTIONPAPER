import java.util.*;

public class pattern {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter an integer: ");
       int num = sc.nextInt();
       System.out.println("You entered: " + num);
       for(int i=1;i<=num;i++)
       {
        for(int j=1;j<=i;j++)
        System.out.print(j);
        System.out.println();
       }
       sc.close();
    }
}