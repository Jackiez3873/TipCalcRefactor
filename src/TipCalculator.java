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
        return (Math.round(totalBillBeforeTip * tipPercentage * 100.0) / 10000);
    }

    public double totalBill() {
        return (Math.round(((totalBillBeforeTip * tipPercentage / 100.0) + totalBillBeforeTip) * 100) / 100);
    }

    public double perPersonCostBeforeTip() {
        return (Math.round(totalBillBeforeTip / numPeople * 100) / 100);
    }

    public double perPersonTipAmount() {
        return (Math.round((totalBillBeforeTip * tipPercentage / 100.0) / numPeople * 100) / 100);
    }

    public double perPersonTotalCost() {
        return (Math.round(((totalBillBeforeTip * tipPercentage / 100.0) + totalBillBeforeTip) / numPeople * 100) / 100);
    }
}