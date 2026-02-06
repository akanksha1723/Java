import java.util.Scanner;
public class Checkchbyswch {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the character: ");
        char cha = sc.next().charAt(0);
        switch(cha){
            case 'a': case 'e' : case 'i' : case 'o' : case 'u' : case 'A' : case 'E' : case 'I' : case 'O' : case 'U' : 
                System.out.println("The character is Vowel"); break;
            default: System.out.println("The character is Consonant"); 
        }
        sc.close();
    }
}
   
