package Q4;

public class CourseDriver {
    public static void main(String[] args) {
        // 5. Creat CS5800 Course
        Instructor prof1 = new Instructor("Nima", "Davarpanah", "#3-2636");
        Textbook book1 = new Textbook("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin Series", "Prentice Hall");  
        // Create a course with initial instructors and textbooks
        Course course1 = new Course("CS5800 - Advanced Software Engineering", prof1, book1);
        // Print course information
        course1.printCourseInfo();

        // 6. Create another couse with 2 instructions and 2 textbooks
        Course course2 = new Course("CS5510 - Data Privacy and Security");
        // Add the 2 instructors and 2 textbooks 
        course2.addInstructor(new Instructor("Mingyan", "Xiao", "#8-45"));
        course2.addInstructor(new Instructor("Alice", "Wang", "#UCI-123")); // Assistant Instructor
        course2.addTextbook(new Textbook("Data Privacy: Foundations, New Developments and the Big Data Challenge", "Vicenç Torra", "Springer"));
        course2.addTextbook(new Textbook("Privacy in Context, Technology, Policy, and the Integrity of Social Life", "Helen Nissenbaum", "Stanford University Press"));
        // Print updated course information
        course2.printCourseInfo();
    }
}
