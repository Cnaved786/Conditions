import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user defined number ");
        int num= sc.nextInt();
        if(num<0){
            num =num*(-1);
        }
        System.out.println("Absolute value of the given number is:"+num);

    }
}
