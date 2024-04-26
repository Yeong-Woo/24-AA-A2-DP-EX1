package delegationProblem;

public class Manager extends EmployeeType {
    Manager() {

    }

    Manager(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double rate) {
        salary = (salary + 10) * (1.0 + rate / 100);
    }
}
