import java.util.Scanner;
public class TipCalculatorRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator! ");
        System.out.println("How many people are in your group: ");
        int numOfPeople= scan.nextInt();
        System.out.println("What's the tip percentage? (0-100, Whole Number):");
        int tipPercentage = scan.nextInt();
        TipCalculator calc = new TipCalculator(numOfPeople , tipPercentage);
        double cost = 0.0;
        while (cost != -1.0) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 or -1.0 to end): ");
            cost = scan.nextDouble();
            if (cost == -1.0) {
                break;
            }
            calc.addMeal(cost);
        }
        System.out.println("-------------------------------- ");
        System.out.println("Total bill before tip: $" + calc.getTotalBillBeforeTip());
        System.out.println("Total percentage: " + calc.getTipPercentage() + "%");
        System.out.println("Total tip: $" + calc.tipAmount());
        System.out.println("Total bill with tip: $" + calc.totalBill());
        System.out.println("Per person cost before tip: $" + calc.perPersonCostBeforeTip());
        System.out.println("Tip per person: $" + calc.perPersonTipAmount());
        System.out.println("Total cost per person: $" + calc.perPersonTotalCost());
        System.out.println("-------------------------------- ");
    }
}
