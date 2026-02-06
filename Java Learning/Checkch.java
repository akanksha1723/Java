import java.util.Scanner;
public class Checkch {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the character: ");
        char cha = sc.next().charAt(0);
        if(cha == 'a'||cha == 'e'||cha == 'i'||cha == 'o'||cha == 'u'||cha == 'A'||cha =='E'||cha == 'I'||cha == 'O'||cha == 'U'){
            System.out.println("The character is Vowel");
        }else{
            System.out.println("The character is Consonant");
        }
        sc.close();
    }    
}
