public class School {

    private String name;
    private Section [] sections;
    private int sectionCount;

    public School (String name){
        this.name = name;
        this.sections = new Section[200];
        this.sectionCount = 0;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String n){
        this.name = n;
    }

    public void addSection(Section s){
        this.sections[sectionCount] = s;
        sectionCount++;
    }

    public Section[] getSections(){
        return this.sections;
    }

}
