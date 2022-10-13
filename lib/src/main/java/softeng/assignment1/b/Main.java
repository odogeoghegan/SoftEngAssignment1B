package softeng.assignment1.b;

import softengassignment1.*;
import softengassignment1.Module;

public class Main {
	
	private static CourseProgramme CSIT, Commerce, Science, Arts;
    private static Module CT1, CT2, BS3, BS4, SC5, SC6, AT7, AT8;
    private static Student James, Joseph, Jessica, Julia;
    private static Lecturer Micheal, Mark, Mary, Megan;

	public static void main(String[] args) {
        // Add New Courses, with Start Date and End Date
        newCourses();
        // Add New Modules and Module Code
        newModules();
        // Add Students for Test
        registerStudents();
        // Add Lecturers for Test
        registerLecturers();
        // Add Related Modules to Courses
        addModuleToCourse();

        // Print Courses and Related Modules
        courseAndModules(CSIT);
        courseAndModules(Commerce);
        courseAndModules(Science);
        courseAndModules(Arts);
        

        // Print Student Details, including Username and Registered Course
        studentDetails(James);
        studentDetails(Joseph);
        studentDetails(Jessica);
        studentDetails(Julia);
        
        
        // Print Lecturers Details, including Username and Registered Course
        lecturerDetails(Micheal);
        lecturerDetails(Mark);
        lecturerDetails(Mary);
        lecturerDetails(Megan);
    }

    private static void newCourses() {
    	CSIT = new CourseProgramme("CSIT", 1, 8, 2022, 31, 5, 2026);
        Commerce = new CourseProgramme("Commerce", 1, 8, 2022, 31, 5, 2025);
        Science = new CourseProgramme("Science", 1, 8, 2022, 31, 5, 2026);
        Arts = new CourseProgramme("Arts", 1, 8, 2022, 31, 5, 2025);
        
    }

    private static void newModules() {
        CT1 = new Module("Computers for dummies", "1");
        CT2 = new Module("Advanced computers for dummies", "2");
        BS3 = new Module("Business for dummies", "3");
        BS4 = new Module("Advanced business for dummies", "4");
        SC5 = new Module("Science for dummies", "5");
        SC6 = new Module("Advanced science for dummies", "6");
        AT7 = new Module("Just for dummies", "7");
        AT8 = new Module("Just for dummies extended edition", "8");
    }

    private static void registerStudents() {
    	James = new Student("James Wall", 00001, 7, 6, 1998, CSIT);
        Jessica = new Student("Jessica Pearson", 0003, 21, 5, 2000, Commerce);
        Julia = new Student("Julia Roberts", 00004, 10, 8, 2000, Science);
        Joseph = new Student("Joseph Hynes", 00002, 14, 4, 2001, Arts);
    }
    
    private static void registerLecturers() {
    	Micheal = new Lecturer("Micheal Martin", 90001, 12, 3, 1984, CSIT);
    	Megan = new Lecturer("Megan Markle", 90004, 22, 8, 1988, Commerce);
        Mark = new Lecturer("Mark Smith", 90002, 19, 6, 1972, Science);
        Mary = new Lecturer("Mary McGee", 90003, 1, 1, 1990, Arts);
    }

    private static void addModuleToCourse() {
        CSIT.addModules(CT1);
        CSIT.addModules(CT2);
        Commerce.addModules(BS3);
        Commerce.addModules(BS4);
        Science.addModules(SC5);
        Science.addModules(SC6);
        Arts.addModules(AT7);
        Arts.addModules(AT8);    
     }

    private static void courseAndModules(CourseProgramme course) {
        System.out.println("Course: " + course.getCourseName());
        System.out.println("Registered Modules: ");
        for (Module element : course.getModuleList()) {
            System.out.println(element.getModuleID() + ": " + element.getModuleName());
        }
        System.out.println("\n");
    }

    private static void studentDetails(Student student) {
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Username: " + student.getUsername());
        System.out.println("Course: " + student.getCourse().getCourseName());
        System.out.println("Modules: ");
        for (Module element : student.getModules()) {
            System.out.println(element.getModuleName());
        }
        System.out.println("\n");
    }
    
    private static void lecturerDetails(Lecturer lecturer) {
        System.out.println("Student Name: " + lecturer.getLecturerName());
        System.out.println("Username: " + lecturer.getUsername());
        System.out.println("Course: " + lecturer.getCourse().getCourseName());
        System.out.println("Modules: ");
        for (Module element : lecturer.getModules()) {
            System.out.println(element.getModuleName());
        }
        System.out.println("\n");
    }
}

