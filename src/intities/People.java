package intities;

public class People extends General {


    private double healthSpending;

    public People() {
    }

    public People(String name, double annualIncome, double healthSpending) {
        super(name, annualIncome);
        this.healthSpending = healthSpending;
    }

    public double getHealthSpending() {
        return healthSpending;
    }

    public void setHealthSpending(double healthSpending) {
        this.healthSpending = healthSpending;
    }

    @Override
    public double tax() {
        double tax = getHealthSpending() * (getAnnualIncome() < 20000 ? 0.15 : 0.25);

        /*if (super.getAnnualIncome() < 20000.0){
            tax =  (super.getAnnualIncome() * 0.15) - healthSpending * 0.50;
        } else {
            tax =  (super.getAnnualIncome() * 0.25) - healthSpending * 0.50;
        }*/

        if (tax < 0){
            return 0.0;
        }

        return tax - healthSpending * 0.50;
    }

}
