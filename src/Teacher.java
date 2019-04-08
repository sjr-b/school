public class Teacher{

    private Section[] sections;
    private String subject;
    private int sectionCount;

    public Teacher(String subject, int count){
        this.sections = new Section[10];
        this.subject = subject;
        this.sectionCount = count;
    }

    public String getSubject(){
        return this.subject;
    }

    public void setSubject(String n){
        this.subject = n;
    }

    public Section[] getSections() {
        return sections;
    }

    public void addSection(Section s){
        this.sections[sectionCount] = s;
        sectionCount++;
    }

}
