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
            if(i >= 0 && i < classes.size()) {
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
            if(i >= 0 && i < classes.size()) {
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

    public void addStudentToClass(Student student, int i){
        if(!classes.isEmpty()){
            if(i >= 0 && i < classes.size()) {
                classes.get(i-1).addStudent(student);
            }else {
                System.out.println("There is no class associated to this index");
            }
        }else {
            System.out.println("There are currently no classes");
        }
    }

    public void printStudents(){
        if(!students.isEmpty()){
            for(int i = 0; i < students.size(); i++){
                System.out.println((i+1) + ". " + students.get(i).getName());
            }
        }else {
            System.out.println("There are currently no students");
        }
    }

    public void printTeachers(){
        if(!teachers.isEmpty()){
            for(int i = 0; i < teachers.size(); i++){
                System.out.println((i+1) + ". " + teachers.get(i).getName());
            }
        }else {
            System.out.println("There are currently no teachers");
        }
    }

    public void studentClasses(int i){
        if(!classes.isEmpty()){
            if(!students.isEmpty()){
                if(i >= 0 && i < students.size()){
                    Student student = students.get(i);
                    System.out.println("The student is in the following classes:");
                    for(UniversityClass c : classes){
                        for(Student s : c.getStudents()){
                            if(s.getId() == student.getId()){
                                System.out.println("- Class: " + c.getName());
                            }
                        }
                    }
                }else {
                    System.out.println("There is no student associated to this index");
                }
            }else {
                System.out.println("There are currently no students");
            }
        }else {
            System.out.println("There are currently no classes");
        }
    }

    public Teacher searchTeacher(int i) {
        if (i >= 0 && i < teachers.size()) {
            return teachers.get(i);
        } else {
            System.out.println("There is no teacher associated to this index");
            return null;
        }
    }

    public UniversityClass searchClass(int i) {
        if (i >= 0 && i < classes.size()) {
            return classes.get(i);
        } else {
            System.out.println("There is no class associated to this index");
            return null;
        }
    }

    public Student searchStudent(int i) {
        if (i >= 0 && i < students.size()) {
            return students.get(i);
        } else {
            System.out.println("There is no student associated to this index");
            return null;
        }
    }
}
