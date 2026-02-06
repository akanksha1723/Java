import java.util.Scanner;
public class Sumofno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int i,sum=0;
        for(i=1;i<n;i++){
            sum = sum + i;
        }
        System.out.printf("Sum of n numbers: %d",sum);
        sc.close();
    }   
}
