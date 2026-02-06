public class Armstrong {
    public static void main(String[]args) {
        int num = 153;
        int temp = num, sum = 0;

        while(temp>0){
            sum += (temp%10)*(temp%10)*(temp%10);
            temp /= 10;
        }

        if(num==sum)
            System.out.println(num+" is an Armstrong.");
        else
            System.out.println(num+" is not an Armstrong.");
    }
} 

