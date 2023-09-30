public class TipCalculator {
    private int numPeople;
    private int tipPercentage;
    private double totalBillBeforeTip;

    public TipCalculator(int x, int y) {
        this.numPeople = x;
        this.tipPercentage = y;
        this.totalBillBeforeTip = 0.0;
    }

    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }

    public int getTipPercentage() {
        return tipPercentage;
    }

    public void addMeal(double cost) {
        totalBillBeforeTip = totalBillBeforeTip + cost;
    }

    public double tipAmount() {
        return (totalBillBeforeTip * tipPercentage / 100.0);
    }

    public double totalBill() {
        return ((totalBillBeforeTip * tipPercentage / 100.0) + totalBillBeforeTip);
    }

    public double perPersonCostBeforeTip() {
        return (totalBillBeforeTip / numPeople);
    }

    public double perPersonTipAmount() {
        return  ((totalBillBeforeTip * tipPercentage / 100.0) / numPeople);
    }

    public double perPersonTotalCost() {
        return (((totalBillBeforeTip * tipPercentage / 100.0) + totalBillBeforeTip) / numPeople);
    }
}