package Q4;
import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private final List<Instructor> instructors = new ArrayList<>();
    private final List<Textbook> textbooks = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    // Constructor with initial instructors and textbooks
    public Course(String courseName, Instructor instructors, Textbook textbooks) {
        this.courseName = courseName;
        this.instructors.add(instructors);
        this.textbooks.add(textbooks);
    }

    // Accessors / Mutators
    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Instructor> getInstructors() { return instructors; }
    public List<Textbook> getTextbooks() { return textbooks; }

    // Helper methods to add instructors and textbooks
    public void addInstructor(Instructor instructor) {
        instructors.add(instructor);
    }

    public void addTextbook(Textbook textbook) {
        textbooks.add(textbook);
    }

    public void printCourseInfo() {
        System.out.println("--------------------------------------------------");
        System.out.println("Course: " + courseName);
        System.out.println("Instructors:");
        if (instructors.isEmpty()) {
            System.out.println(" None instructors assigned");
        } else {
            for (Instructor instructor : instructors) {
                System.out.println(" - " + instructor);
            }
        }
        System.out.println("Textbooks:");
        if (textbooks.isEmpty()) {
            System.out.println(" None textbooks assigned");
        } else {
            for (Textbook textbook : textbooks) {
                System.out.println(" - " + textbook);
            }
        }

    }
}
