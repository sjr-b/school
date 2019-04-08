import java.util.Arrays;

public class Section {

    private Teacher teacher;
    private Student[] students;
    private String name;
    private int currentSize;

    public Section (Teacher teacher, String name, int amount){
        this.teacher = teacher;
        this.students = new Student[50];
        this.name = name;
        this.currentSize = amount;
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
        return "Section name : " + this.name + " || teacher: " + this.teacher.getName() + " || students: "
                + Arrays.toString(this.students) + " || current size: " + String.valueOf(this.currentSize);
    }
}
