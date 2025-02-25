import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FullTimeTeacher ft1 = new FullTimeTeacher(500, "Juan Rios", 8);
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
        int sel;

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
                    if(!university.getTeachers().isEmpty()){
                        for (Teacher t : university.getTeachers()) {
                            System.out.println(t);
                        }
                    }else {
                        System.out.println("There are currently no teachers");
                    }
                    System.out.println();
                    break;
                case "2":
                    university.printClasses();
                    System.out.println("Select a class to see its information");
                    sel = sc.nextInt();
                    sc.nextLine();
                    if(sel <= 0 || sel > university.getClasses().size()){
                        System.out.println("Bad index. Returning to main menu");
                        System.out.println();
                        break;
                    }
                    university.printClass(sel);
                    System.out.println("Print student information? (Type 'Yes' to print, anything else to exit)");
                    if("Yes".equals(sc.nextLine())){
                        university.printClassStudents(sel);
                    }else {
                        System.out.println();
                        break;
                    }
                    System.out.println();
                    break;
                case "3":
                    System.out.println("Enter the name of the student");
                    String sName = sc.nextLine();
                    System.out.println("Enter the age of the student");
                    int sAge = sc.nextInt();
                    System.out.println("Select a class to which the student will be added");
                    university.printClasses();
                    sel = sc.nextInt();
                    sc.nextLine();
                    if(sel <= 0 || sel > university.getClasses().size()){
                        System.out.println("Bad index. Returning to main menu");
                        System.out.println();
                        break;
                    }
                    Student s = new Student(sName, sAge);
                    university.addStudent(s);
                    university.addStudentToClass(s, sel);
                    System.out.println();
                    break;
                case "4":
                    System.out.println("Enter the name of the class");
                    String cName = sc.nextLine();
                    System.out.println("Enter the classroom that will be assigned to the class");
                    String cClassroom = sc.nextLine();
                    System.out.println("Select a teacher for the class");
                    university.printTeachers();
                    sel = sc.nextInt();
                    sc.nextLine();
                    Teacher t = university.searchTeacher(sel);
                    UniversityClass c = new UniversityClass(cName, cClassroom, t);
                    boolean flag2 = false;
                    do {
                        System.out.println();
                        System.out.println("Add students to the class");
                        university.printStudents();
                        System.out.println("Type '0' to go back to the main menu");
                        int index = sc.nextInt();
                        sc.nextLine();
                        if(index == 0){
                            flag2 = true;
                        }else {
                            Student s20 = university.searchStudent(index);
                            c.addStudent(s20);
                        }
                    }while(!flag2);
                    university.addClass(c);
                    System.out.println();
                    break;
                case "5":
                    System.out.println("Select a student to show their classes");
                    university.printStudents();
                    sel = sc.nextInt();
                    sc.nextLine();
                    university.studentClasses(sel);
                    System.out.println();
                    break;
                case "Exit":
                    flag = true;
                    break;
                default:
                    System.out.println("Please select a correct option");
                    System.out.println();
            }

        }while(!flag);
    }
}