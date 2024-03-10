public class Salaried extends Employee {
    private double annualSalary;
    public Salaried() {
        this.annualSalary = 0;
    }
    public Salaried(double annualSalary, String name) {
        super(name);
        this.annualSalary = annualSalary;
    }
    public double getAnnualSalary() {
        return annualSalary;
    }

    //returns the employees gross pay, their pay before taxes.
    @Override
    public double getGrossPay() {
        return getAnnualSalary() / 52;
    }

    //calculates and returns the state tax.
    @Override
    public double getStateWithholding() {
        return getGrossPay() * 0.07;
    }

    //calculates and returns the federal tax.
    @Override
    public double getFedWithholding() {
        return getGrossPay() * 0.15;
    }

    //calculates and returns the employees pay after taxes are taken out.
    @Override
    public double getNetPay() {
        return getGrossPay() - getFedWithholding() - getStateWithholding();
    }
}
