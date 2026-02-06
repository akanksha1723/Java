import java.util.Scanner;
public class Checktriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three angles: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Enter the three sides: ");
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        if(a + b + c == 180 && s1 + s2 > s3 || s2 + s3 > s1 || s3 + s1 > s2){
            System.out.println("It is a triangle by angle and side both");
        }else{
            System.out.println("It is not a triangle by angle and side both");
        }
        sc.close();
    }
}
