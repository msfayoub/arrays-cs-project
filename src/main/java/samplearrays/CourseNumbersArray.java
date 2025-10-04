package samplearrays;

public class CourseNumbersArray {
    public static void main(String[] args) {
        int[] registeredCourses = {1010, 1020, 2080, 2140, 2150, 2160};
        registeredCourses = addCourse(registeredCourses, 3000);
        printContent(registeredCourses);
        containsCourse(registeredCourses, 3000);
    }

    public static int[] addCourse(int[] registeredCourses, int course) {
        int n = registeredCourses.length;
        int[] updatedCourses = new int[n + 1];
        for (int i = 0; i < n; i++) {
            updatedCourses[i] = registeredCourses[i];
        }
        updatedCourses[n] = course;
        return updatedCourses;
    }
    public static void printContent(int[] registeredCourses) {
        for (int i = 0; i < registeredCourses.length; i++) {
            System.out.print(registeredCourses[i] + " ");
        }
    }
    public static boolean containsCourse(int[] registeredCourses, int course) {
        for (int i = 0; i < registeredCourses.length; i++) {
            if (registeredCourses[i] == course) {
                return true;
            }
        }
        return false;
    }
}
