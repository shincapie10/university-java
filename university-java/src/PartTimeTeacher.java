public class PartTimeTeacher extends Teacher {
    private int activeHours;

    public PartTimeTeacher(String name, double salary, int activeHours) {
        super(name);
        this.setSalary(salary*activeHours);
        this.activeHours = activeHours;
    }

    public void calcSalary(){
        this.setSalary(this.getSalary()*activeHours);
    }

    public int getActiveHours() {
        return activeHours;
    }

    public void setActiveHours(int activeHours) {
        this.activeHours = activeHours;
        calcSalary();
    }
}
