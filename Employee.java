abstract class Employee {
    private String name;
    public Employee() {
        this.name = "none";
    }
    public Employee(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    //returns the employees gross pay, their pay before taxes.
    abstract double getGrossPay();

    //calculates and returns the federal tax.
    abstract double getFedWithholding();

    //calculates and returns the state tax.
    abstract double getStateWithholding();

    //calculates and returns the employees pay after taxes are taken out.
    abstract double getNetPay();
}


