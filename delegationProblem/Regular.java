package delegationProblem;

public class Regular extends EmployeeType {
    Regular() {

    }

    Regular(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double rate) {
        salary = salary * (1.0 + rate / 100);
    }
}
