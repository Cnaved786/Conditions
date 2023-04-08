import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operator: (+,-,*,/)");
        char operator= sc.next().charAt(0);
        System.out.println("Enter the first number:");
        int a= sc.nextInt();
        System.out.println("Enter the second number :" );
        int b= sc.nextInt();
        //take 4 variable
        double sum=a+b;
        double sub=a-b;
        double mul=a*b;
        double div=a/b;
        switch (operator){
            case '+' :
                System.out.println("Addtion is"+sum );
                break;
            case '-' :
                System.out.println("Addtion is"+sub );
                break;
            case '*' :
                System.out.println("Addtion is"+mul );
                break;
            case '/' :
                System.out.println("Addtion is"+div );
                break;
            default:
                System.out.println("Enter the valid operator");
                break;
        }

    }
}
