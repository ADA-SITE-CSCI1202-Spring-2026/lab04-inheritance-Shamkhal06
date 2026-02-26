package week06;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Shamkhal", "Khalfayev", "Male");
        System.out.println(p1);

        Person p2 = new Person("Shamkhal", "Khalfayev", "Male");
        System.out.println("Person equal? " + p1.equals(p2));


        Teacher t1 = new Teacher("Leyla", "Alili", "Female",
                "Computer Science", "OOP");
        System.out.println(t1);

        Teacher t2 = new Teacher("Leyla", "Alili", "Female",
        "Computer Science", "OOP");
        System.out.println("Teacher equal? " + t1.equals(t2));

        Student s1 = new Student("Rashad", "Karimov", "Male", 101);
        System.out.println(s1);

        Student s2 = new Student("Rashad", "Karimov", "Male", 101);
        System.out.println("Student equal? " + s1.equals(s2));
    }
}



class Person {

    private String firstName;
    private String lastName;
    private String gender;

    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    @Override
    public String toString() {
        return "Person: " + firstName + " " + lastName +
                ", Gender: " + gender;
    }

    public boolean equals(Person p) {
        return this.firstName.equals(p.firstName)
                && this.lastName.equals(p.lastName)
                && this.gender.equals(p.gender);
    }
}



class Teacher extends Person {

    private String department;
    private String courses;

    public Teacher(String firstName, String lastName, String gender,
                   String department, String courses) {
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getCourses() { return courses; }
    public void setCourses(String courses) { this.courses = courses; }

    @Override
    public String toString() {
        return super.toString() +
                ", Department: " + department +
                ", Courses: " + courses;
    }

    public boolean equals(Teacher t) {
        return super.equals(t)
                && this.department.equals(t.department)
                && this.courses.equals(t.courses);
    }
}



class Student extends Person {

    private int studentId;

    public Student(String firstName, String lastName,
                   String gender, int studentId) {
        super(firstName, lastName, gender);
        this.studentId = studentId;
    }

    public int getStudentId() { return studentId; }
    public void setStudentId(int studentId) { this.studentId = studentId; }

    @Override
    public String toString() {
        return super.toString() +
                ", Student ID: " + studentId;
    }

    public boolean equals(Student s) {
        return super.equals(s)
                && this.studentId == s.studentId;
    }
}