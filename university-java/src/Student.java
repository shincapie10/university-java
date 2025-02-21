import java.util.UUID;

public class Student{
    private String name;
    private final int age;
    private final UUID id;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        id = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public UUID getId() {
        return id;
    }
}
