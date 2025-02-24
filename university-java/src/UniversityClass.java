import java.util.ArrayList;

public class UniversityClass {
    private String name;
    private String classroom;
    private final ArrayList<Student> students;
    private Teacher teacher;

    public UniversityClass(String name, String classroom, Teacher teacher) {
        this.name = name;
        this.classroom = classroom;
        this.teacher = teacher;
        students = new ArrayList<Student>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
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
}
