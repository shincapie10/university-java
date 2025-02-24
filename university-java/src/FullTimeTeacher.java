public class FullTimeTeacher extends Teacher{
    private int experienceYears;

    public FullTimeTeacher(double salary, String name, int experienceYears) {
        super(name);
        this.setSalary(salary*experienceYears*1.1);
        this.experienceYears = experienceYears;
    }

    public void calcSalary(){
        this.setSalary(this.getSalary()*experienceYears*1.1);
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
        calcSalary();
    }

    @Override
    public String toString() {
        return ("Teacher: " + this.getName() + " - Salary: " + this.getSalary() + " - Experience Years: "
                + experienceYears);
    }
}
