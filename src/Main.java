public class Main {
    public static void main(String[] args) {
        // Creating a Student object
        Student student = new Student("Alice", 20, 101, "Computer Science", "Engineering");
        System.out.println(student.getName());
        System.out.println(student.getCourse());

        // Creating a Teacher object
        Teacher teacher = new Teacher("Bob", 45, "Computer Science", "Artificial Intelligence");
        System.out.println(teacher.getName());
        System.out.println(teacher.getDepartment());
        System.out.println(teacher.getSpecialization());
    }
}