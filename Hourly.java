public class Hourly extends Employee {
    private double hourlyWage;
    private double hoursWorked;
    public Hourly() {
        this.hourlyWage = 0;
        this.hoursWorked = 0;
    }
    public Hourly(double hourlyWage, double hoursWorked, String name) {
        super(name);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }
    public double getHourlyWage() {
        return hourlyWage;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }

    //returns the employees pay before taxes.
    @Override
    public double getGrossPay() {
        return getHoursWorked() * getHourlyWage();
    }

    //calculates and returns the federal tax.
    @Override
    public double getFedWithholding() {
        return getGrossPay() * 0.15;
    }

    //calculates and returns the state tax.
    @Override
    public double getStateWithholding() {
        return getGrossPay() * 0.07;
    }

    //calculates and returns the employees pay after taxes are taken out.
    @Override
    public double getNetPay() {
        return getGrossPay() - getFedWithholding() - getStateWithholding();
    }
}

