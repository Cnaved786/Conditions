import java.sql.SQLOutput;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Squre");
        int l= sc.nextInt();
        System.out.println("Enter the breath of the square");
        int b = sc.nextInt();
        if (l==b){
            System.out.println("Is a Square :");
        }else {
            System.out.println("Not a Square:");
        }

    }
}
