import java.util.Scanner;
public class Checkleap {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the year: ");
        int y = sc.nextInt();
        if(y % 4 == 0 || y % 400 == 0 && y % 100 != 0){
            System.out.println("Year is leap and leap year is: " + y);
        }else{
            System.out.println("Year is  not leap and leap year is: " + y);
        }
        sc.close();
    }    
}
