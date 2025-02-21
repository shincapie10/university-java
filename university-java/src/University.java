import java.util.ArrayList;

public abstract class University {
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

    public abstract void addStudent();

    public abstract Student removeStudent();

    public abstract Student searchStudent();

    public abstract void addTeacher();

    public abstract Teacher removeTeacher();

    public abstract Teacher searchTeacher();

    public abstract void addClass();

    public abstract UniversityClass removeClass();

    public abstract UniversityClass searchClass();


}
