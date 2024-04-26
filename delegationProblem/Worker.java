package delegationProblem;

public abstract class Worker {
	EmployeeType employee;

	public abstract void doWork();

	public void setEmployeeType(EmployeeType employee) {
		this.employee = employee;
	}

	public void setSalary(double salary) {
		this.employee.setSalary(salary);
	}

	public double getSalary() {
		return this.employee.getSalary();
	}

	public void increaseSalary(double rate) {
		this.employee.increaseSalary(rate);
	}
}
