package samplearrays;

import java.util.Arrays;
import java.util.Comparator;

public class ManageStudent {

    // 2) Find the Oldest Student
    public static Student findOldest(Student[] students) {
        Student oldest=students[0];
        int max_age=oldest.getAge();

        for (int i = 1; i < students.length; i++) {
            if (students[i].getAge() >= max_age) {
                max_age=students[i].getAge();
                oldest=students[i];
            }
        }
        return oldest;
    }

    // 3) Count Adult Students (age >= 18)
    public static int countAdults(Student[] students) {
        int count=0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getAge() >= 18) {
                count++;
            }
        }
        return count;
    }

    // 4) Average Grade (returns NaN if no students or grades)
    public static double averageGrade(Student[] students) {
        double sum=0;
//        if (students.length==0){return double.Nan;}


        for (int i = 0; i < students.length; i++) {
//            if (students[i].getGrade()) {}
            sum+=(double)students[i].getGrade();
        }
        return sum/students.length;
    }

    // 5) Search by Name (case-sensitive; change to equalsIgnoreCase if desired)
    public static Student findStudentByName(Student[] students, String name) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().equals(name)) {
                return students[i];
            }
        }
        return null;
    }

    // 6) Sort Students by Grade (descending)
    public static void sortByGradeDesc(Student[] students) {
        Arrays.sort(students, (s1, s2) -> Integer.compare(s1.getGrade(), s2.getGrade()));

    }

    // 7) Print High Achievers (grade >= 15)
    public static void printHighAchievers(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGrade()>=15) {
                System.out.println(students[i].getName());
            }
        }
    }

    // 8) Update Student Grade by id
    public static boolean updateGrade(Student[] students, int id, int newGrade) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId() == id) {
                students[i].setGrade(newGrade);
                return true;
            }
        }
        return false;
    }

    // 9) Find Duplicate Names
    public static boolean hasDuplicateNames(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].getName().equals(students[j].getName())) {
                    System.out.println("Duplicate found");
                    return true;
                }
            }
        }
        return false;

    }

    // 10) Expandable Array: return a new array with one more slot and append student
    public static Student[] appendStudent(Student[] students, Student newStudent) {
        Student[] newStudents=new Student[students.length+1];
        for (int i = 0; i < students.length; i++) {
            newStudents[i]=students[i];
        }
        newStudents[students.length] = newStudent;
        return newStudents;

    }

    // 1) Create an Array of Students + demos for all tasks
    public static void main(String[] args) {
        // Create & initialize array of 5 students
        Student[] students=new Student[5];
        students[0]=new Student(1,"Ayoub",19,12);
        students[1]=new Student(2,"Walid",20,17);
        students[2]=new Student(3,"Yahya",21,14);
        students[3]=new Student(4,"Omar",33,13);
        students[4]=new Student(5,"Tarik",23,16);

        // Print all
        System.out.println("== All Students ==");
        for (Student s : students) System.out.println(s);
        System.out.println("Total created: " + Student.getNumStudent());

        // 2) Oldest
        System.out.println(findOldest(students));

        // 3) Count adults
        System.out.println(countAdults(students));


        // 4) Average grade
        System.out.println(averageGrade(students));

        // 5) Find by name
        System.out.println(findStudentByName(students,"Tarik"));

        // 6) Sort by grade desc
        // sort function
        sortByGradeDesc(students);
        System.out.println("\n== Sorted by grade (desc) ==");
        for (Student s : students) System.out.println(s);

        // 7) High achievers >= 15
        System.out.println("\nHigh achievers:");
        printHighAchievers(students);

        // 8) Update grade by id
        // function
        updateGrade(students, 1, 10);
        System.out.println("\nUpdated id=4? " + students[4].getId());
        System.out.println(findStudentByName(students, "Dina"));

        // 9) Duplicate names
        hasDuplicateNames(students);

        // 10) Append new student
        students=appendStudent(students, new Student(10,"Nabil",19,17));
        System.out.println("== All Students ==");
        for (Student s : students) System.out.println(s);

        // 11) School representation
        Student[][] school = new Student[2][3];
        school[0][0]=new Student(1,"Ayoub",19,12);
        school[0][1]=new Student(2,"Walid",19,20);
        school[0][2]=new Student(3,"Yahya",19,19);
        school[1][0]=new Student(4,"Omar",19,16);
        school[1][1]=new Student(5,"Zineb",19,13);
        school[1][2]=new Student(6,"Salma",19,20);
        System.out.println("== School ===");
        System.out.println("Classroom 1:");
        for (Student s : school[0]){
            System.out.println(s.getName());
        }
        System.out.println("Classroom 2:");
        for (Student s : school[1]){
            System.out.println(s.getName());
        }

    }
}

