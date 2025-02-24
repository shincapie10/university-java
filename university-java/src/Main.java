public class Main {
    public static void main(String[] args) {
        FullTimeTeacher ft1 = new FullTimeTeacher(500, "Juan Rios", 7);
        FullTimeTeacher ft2 = new FullTimeTeacher(600, "Luis Perez", 25);
        PartTimeTeacher pt1 = new PartTimeTeacher(350, "Andres Correa", 20);
        PartTimeTeacher pt2 = new PartTimeTeacher(300, "Angela Jaramillo", 18);

        Student s1 = new Student("Luis Rivera", 22);
        Student s2 = new Student("Camila Rodríguez", 21);
        Student s3 = new Student("Santiago Pérez", 23);
        Student s4 = new Student("Valentina Gómez", 20);
        Student s5 = new Student("Andrés Martínez", 24);
        Student s6 = new Student("Isabella Torres", 19);
    }
}