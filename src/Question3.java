import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price of the article:");
        double cp=sc.nextDouble();
        System.out.println("Enter the selling price of the article:");
        double sp= sc.nextDouble();
        double amount;
        if(cp<sp){
            amount=sp-cp;
            System.out.println("The profit is: "+ amount);
        }
        else if(cp>sp) {
            amount =cp-sp;
            System.out.println("The Loss is:" +amount);

        }
        else {
            System.out.println("NO profit and no loss");
        }

    }
}
