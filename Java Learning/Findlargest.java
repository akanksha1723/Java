import java.util.Scanner;
public class Findlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a > b && a > c){
            System.out.println("a is largest and largest no. is: " + a);
        }else if(b > a && b > c){
            System.out.println("b is largest and largest no. is: " + b);
        }else{
            System.out.println("c is largest and largest no. is: " + c);
        }
        sc.close();
    }
}
