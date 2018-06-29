package quanlysinhviencourse;

public class MainCousre {
    public static void displayCourse(Cousre course) {
        System.out.println("Course \"" + course.getName()
                + "\" has " + course.getStudentsCount()
                + " student(s): {");
        String[] students = course.getStudents();
        for (int i = 0; i < course.getStudentsCount(); i++) {
            System.out.println("\t\"" + students[i] + "\",");
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        Cousre course = new Cousre("javer");
        displayCourse(course);
        String andy = "andy";
        course.addStudent(andy);
        displayCourse(course);
        String booby = "booby";
        course.addStudent(booby);
        displayCourse(course);
        String samy = "samy";
        course.addStudent(samy);
        displayCourse(course);
        course.removeStudent(andy);
        displayCourse(course);
    }

}
