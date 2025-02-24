import java.util.ArrayList;

public class University {
    private final ArrayList<Student> students;
    private final ArrayList<Teacher> teachers;
    private final ArrayList<UniversityClass> classes;

    public University() {
        students = new ArrayList<Student>();
        teachers = new ArrayList<Teacher>();
        classes = new ArrayList<UniversityClass>();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public ArrayList<UniversityClass> getClasses() {
        return classes;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(String name){
        boolean found = false;
        if(!students.isEmpty()) {
            for (int i = 0; i < students.size(); i++) {
                if(name.equals(students.get(i).getName())){
                    found = true;
                    students.remove(i);
                    System.out.println("Student removed successfully");
                    break;
                }
            }
            if(!found){
                System.out.println("Student not found");
            }
        }else{
            System.out.println("There are currently no students");
        }
    }

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public void removeTeacher(String name){
        boolean found = false;
        if(!teachers.isEmpty()) {
            for (int i = 0; i < teachers.size(); i++) {
                if(name.equals(teachers.get(i).getName())){
                    found = true;
                    teachers.remove(i);
                    System.out.println("Teacher removed successfully");
                    break;
                }
            }
            if(!found){
                System.out.println("Teacher not found");
            }
        }else{
            System.out.println("There are currently no teachers");
        }
    }

    public void addClass(UniversityClass uClass){
        classes.add(uClass);
    }

    public void removeClass(String name){
        boolean found = false;
        if(!classes.isEmpty()) {
            for (int i = 0; i < classes.size(); i++) {
                if(name.equals(classes.get(i).getName())){
                    found = true;
                    classes.remove(i);
                    System.out.println("Class removed successfully");
                    break;
                }
            }
            if(!found){
                System.out.println("Class not found");
            }
        }else{
            System.out.println("There are currently no classes");
        }
    }

    public void printTeachers(){
        if(!teachers.isEmpty()){
            for (Teacher t : teachers) {
                if (t instanceof FullTimeTeacher) {
                    System.out.println("Teacher: " + t.getName() + " - Salary: " + t.getSalary() + " - Experience Years: "
                            + ((FullTimeTeacher) t).getExperienceYears());
                } else if (t instanceof PartTimeTeacher) {
                    System.out.println("Teacher: " + t.getName() + " - " + t.getSalary() + " - Active Hours: "
                            + ((PartTimeTeacher) t).getActiveHours());
                }

            }
        }else {
            System.out.println("There are currently no teachers");
        }
    }

}
