import java.util.Scanner;
public class Convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number in kg: ");
        double kg = sc.nextDouble();
        double gram = kg * 1000;
        System.out.println("Number in gram:" + gram);
        System.out.println("Enter the number in cm: ");
        double cm = sc.nextDouble();
        double meter = cm / 100;
        System.out.println("Number in meter:" + meter);
        sc.close();
    }  
}
