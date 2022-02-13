package inheritence.isa;

public class Employee extends User {
    public double salary;

    public int getNoOfLeaves() {
        return 10;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
