import java.math.BigDecimal;
import java.util.Scanner;
import java.lang.InterruptedException; // this is like time.sleep(2000) in python


public class Tip {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        Tip tip = new Tip();

        System.out.println("******************************");
        System.out.println("Welcome to the Tip Calculator");
        System.out.println("******************************");
        Thread.sleep(1000);
        System.out.print("Please enter the Bill amount: ");
        String billAmountInput = scanner.nextLine();
        double billAmount = Double.parseDouble(billAmountInput);
        System.out.print("Please rate the experience on a scale of 1-5: ");
        String experienceString = scanner.nextLine();
        int dinningExperience = Integer.parseInt(experienceString);
        System.out.printf("\nThe tip based on the service you received will equal $%.2f\n", tip.dinningExperience(dinningExperience, billAmount));
    }
    public double dinningExperience(int experiance,double billAmount ){
        double tipAmount = 1.0;

        switch (experiance){
            case 1 : tipAmount = billAmount * .15;
            break;
            case 2 : tipAmount = billAmount * .18;
            break;
            case 3 : tipAmount = billAmount * .2;
            break;
            case 4 : tipAmount = billAmount * .23;
            break;
            case 5: tipAmount = billAmount * .25;
            break;
            default:
                System.out.println("Please choose a rating from 1-5");;
        }

        return tipAmount;
    }

}
