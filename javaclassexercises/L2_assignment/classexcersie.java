import java.util.ArrayList;
import java.util.List;
//Yohannes Tigistu ETS 1703/14
//Yohanna Betsiha Ets 1701/14
class Course {
    private String code, name;
    private int capacity;
    private List<Student> enrolledStudents;

    public Course(String code, String name, int capacity) {
        this.code = code;
        this.name = name;
        this.capacity = capacity;
        this.enrolledStudents = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        if (enrolledStudents.size() < capacity) {
            enrolledStudents.add(student);
            System.out.println(student.getName() + " enrolled in " + code);
        } else {
            System.out.println("Course full: " + code);
        }
    }

    public void displayEnrolledStudents() {
        System.out.println("Enrolled students in " + code + ":");
        for (Student student : enrolledStudents)
            System.out.println(student.getID() + "\t" + student.getName());
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class School {
    private List<Course> courses;
    private List<Student> students;

    public School() {
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
        System.out.println("Added course: " + course.getCode() + " - " + course.getName());
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Added student: " + student.getID() + " - " + student.getName());
    }

    public void enrollStudentInCourse(Student student, Course course) {
        course.enrollStudent(student);
    }

    public void displaySchoolInfo() {
        System.out.println("Courses:");
        for (Course course : courses)
            System.out.println(course.getCode() + "\t" + course.getName());

        System.out.println("\nStudents:");
        for (Student student : students)
            System.out.println(student.getID() + "\t" + student.getName());
    }
}

public class classexcersie {
    public static void main(String[] args) {
        School school = new School();

        Course math = new Course("M101", "Math", 3);
        Course english = new Course("EN101", "English", 2);

        school.addCourse(math);
        school.addCourse(english);

        Student john = new Student(1, "john");
        Student hela = new Student(2, "hela");

        school.addStudent(john);
        school.addStudent(hela);

        school.enrollStudentInCourse(john, math);
        school.enrollStudentInCourse(hela, math);
        school.enrollStudentInCourse(hela, english);

        school.displaySchoolInfo();
    }
}