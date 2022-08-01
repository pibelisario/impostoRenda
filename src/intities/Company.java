package intities;

public class Company extends General{

    private Integer employeNumber;

    public Company() {
    }

    public Company(String name, double annualIncome, Integer employeNumber) {
        super(name, annualIncome);
        this.employeNumber = employeNumber;
    }

    public double getEmployeNumber() {
        return employeNumber;
    }

    public void setEmployeNumber(Integer employeNumber) {
        this.employeNumber = employeNumber;
    }

    @Override
    public double tax() {
        if (employeNumber > 10){
            return super.getAnnualIncome() * 0.14;
        } else {
            return super.getAnnualIncome() * 0.16;
        }
    }
}
