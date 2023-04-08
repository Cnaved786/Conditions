import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user defined number :");
        int num= sc.nextInt();
        if(num>=0){
            System.out.println("Numer is Positive");
        } else {
            System.out.println("Number is negative and skipped");
        }
    }
}
