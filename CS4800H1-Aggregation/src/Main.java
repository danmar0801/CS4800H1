public class Main {
    public static void main(String[] args) {
        Instructor instructor1 = new Instructor("Nima", "Davarnapah", "3-2636");
        Instructor instructor2 = new Instructor("Jane", "Doe", "4-5678");
        Instructor instructor3 = new Instructor("Jackie", "Chan", "4-2323");

        Textbook textbook1 = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Textbook textbook2 = new Textbook("Effective Java", "Joshua Bloch", "Addison-Wesley");
        Textbook textbook3 = new Textbook("Kung Fu Code", "Bruce Lee", "Penguin");

        Course course1 = new Course("Software Engineering", instructor1, textbook1);
        Course course2 = new Course("Advanced Java", instructor2, textbook2);
        Course course3 = new Course("Defense against the dark Magic", instructor3, textbook3);

        course1.printCourseInfo();
        System.out.println(); // Just to have a separation between courses
        course2.printCourseInfo();
        System.out.println(); // Just to have a separation between courses
        course3.printCourseInfo();
    }
}