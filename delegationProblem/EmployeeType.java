package delegationProblem;

public abstract class EmployeeType {
    protected double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    };

    public double getSalary() {
        return this.salary;
    }

    public abstract void increaseSalary(double rate);
}
