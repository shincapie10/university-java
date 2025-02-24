import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FullTimeTeacher ft1 = new FullTimeTeacher(500, "Juan Rios", 7);
        FullTimeTeacher ft2 = new FullTimeTeacher(600, "Luis Perez", 25);
        PartTimeTeacher pt1 = new PartTimeTeacher(350, "Andres Correa", 20);
        PartTimeTeacher pt2 = new PartTimeTeacher(300, "Angela Jaramillo", 18);

        Student s1 = new Student("Luis Rivera", 22);
        Student s2 = new Student("Camila Rodríguez", 21);
        Student s3 = new Student("Mariana Cardona", 23);
        Student s4 = new Student("Valentina Gómez", 20);
        Student s5 = new Student("Andrés Martínez", 24);
        Student s6 = new Student("Isabella Torres", 19);

        UniversityClass c1 = new UniversityClass("Calculo Diferencial", "1.4B", ft1);
        UniversityClass c2 = new UniversityClass("Ecuaciones Diferenciales", "2.2B", ft2);
        UniversityClass c3 = new UniversityClass("Algebra Lineal", "1.2B", pt1);
        UniversityClass c4 = new UniversityClass("Fundamentos de programacion", "3.1B", pt2);

        c1.addStudent(s1);
        c1.addStudent(s2);
        c1.addStudent(s3);
        c1.addStudent(s4);
        c2.addStudent(s1);
        c2.addStudent(s3);
        c2.addStudent(s6);
        c3.addStudent(s2);
        c3.addStudent(s5);
        c3.addStudent(s6);
        c4.addStudent(s1);
        c4.addStudent(s3);
        c4.addStudent(s4);
        c4.addStudent(s5);

        University university = new University();
        university.addStudent(s1);
        university.addStudent(s2);
        university.addStudent(s3);
        university.addStudent(s4);
        university.addStudent(s5);
        university.addStudent(s6);
        university.addClass(c1);
        university.addClass(c2);
        university.addClass(c3);
        university.addClass(c4);
        university.addTeacher(ft1);
        university.addTeacher(ft2);
        university.addTeacher(pt1);
        university.addTeacher(pt2);

        System.out.println("University created successfully");
        System.out.println();

        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        String selection1;

        do {
            System.out.println("Please select an option");
            System.out.println("1. Print all current teachers");
            System.out.println("2. Print class information");
            System.out.println("3. Create student");
            System.out.println("4. Create class");
            System.out.println("5. List all classes from a specific student");
            System.out.println("Type 'Exit' to finish execution");

            String selection = sc.nextLine();

            switch(selection){
                case "1":
                    university.printTeachers();
                    break;
                case "2":
                    
            }

        }while(!flag);
    }
}