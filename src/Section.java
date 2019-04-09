import java.util.Arrays;

public class Section {

    private Teacher teacher;
    private Student[] students = new Student[50];
    private String name;
    private int currentSize;

    public Section (String name){
        this.name = name;
        this.currentSize = 0;
    }

    public Teacher getTeacher(){
        return this.teacher;
    }

    public void setTeacher(Teacher t){
        this.teacher = t;
    }

    public Student[] getStudents(){
        return this.students;
    }

    public void addStudent(Student s){
        this.students[currentSize] = s;
        currentSize++;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString() {
        String studentList = "";
        for (int a = 0; a <= currentSize - 2; a++){
            studentList += this.students[a].getName() + ", ";
        }
        studentList += this.students[currentSize - 1].getName();
        return "This " + this.name + " class is taught by " + teacher.getName() + " and has " + currentSize + " students: " + studentList;
    }
}
