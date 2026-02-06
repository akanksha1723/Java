import java.util.Scanner;
public class Upperlower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.println("Character is in Uppercase");
        }else if(ch>='a' && ch<='z'){
            System.out.println("Character is in Lowercase");
        }else{
            System.out.println("This is a special character");
        }
        sc.close();
    }
}
