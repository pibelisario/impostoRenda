package intities;

public abstract class General {

    private String name;
    private Double annualIncome;


    public General(){}

    public General(String name, double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public abstract double tax();

    @Override
    public  String toString() {
        return null;
    }
}
