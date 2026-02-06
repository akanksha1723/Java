import java.util.Scanner;
public class Checkarmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int  rem=0, sum=0;
        int temp = num;
        while(num != 0){
            rem = num % 10;
            sum = sum + rem * rem * rem;
            num = num / 10;
        }
        if(temp == sum){
            System.out.println(temp + " is a armstrong number.");
        }else{
            System.out.println(temp + " is not a armstrong number.");
        }
        sc.close();
    }    
}
