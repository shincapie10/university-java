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
                System.out.println(t);
            }
        }else {
            System.out.println("There are currently no teachers");
        }
    }

    public void printClasses(){
        if(!classes.isEmpty()){
            for(int i = 0; i < classes.size(); i++){
                System.out.println((i+1) + ". " + classes.get(i).getName());
            }
        }else {
            System.out.println("There are currently no classes");
        }
    }

    public void printClass(int i){
        if(!classes.isEmpty()){
            if((i-1) < classes.size()) {
                System.out.println(classes.get(i-1));
            }else {
                System.out.println("There is no class associated to the number entered");
            }
        }else {
            System.out.println("There are currently no classes");
        }
    }

    public void printClassStudents(int i){
        if(!classes.isEmpty()){
            if((i-1) < classes.size()) {
                if(!classes.get(i-1).getStudents().isEmpty()) {
                    for (Student s : classes.get(i-1).getStudents()) {
                        System.out.println(s);
                    }
                }else {
                    System.out.println("This class has no students");
                }
            }else {
                System.out.println("There is no class associated to the number entered");
            }
        }else {
            System.out.println("There are currently no classes");
        }
    }

}
