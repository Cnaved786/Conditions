import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mark of the user: ");
        int mark= sc.nextInt();
        if(mark>=90 && mark <=100){
            System.out.println("Your grade is A+");
        } else if (mark>=80 && mark <=90) {
            System.out.println("Your grade is A");
        }
        else if (mark>=70 && mark <=80) {
            System.out.println("Your grade is B+");
        }
        else if (mark>=60 && mark <=70) {
            System.out.println("Your grade is B");
        }
        else if (mark>=50 && mark <=60) {
            System.out.println("Your grade is C");
        }
        else if (mark>=40 && mark <=50) {
            System.out.println("Your grade is D");
        }
        else if (mark>=30 && mark <=40) {
            System.out.println("Your grade is E");
        }
        else if (mark>=0 && mark <=30) {
            System.out.println("Your grade is F");
        }
    }
}
