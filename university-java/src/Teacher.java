public class Teacher{
    private double salary;
    private String name;

    public Teacher(String name) {
        this.name = name;
        salary = 0;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return ("Teacher: " + this.getName() + " - Salary: " + this.getSalary());
    }
}
