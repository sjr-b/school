public class Runner {

    public static void main(String[] args){
        School bhs = new School ("Berkeley High");
        Section math = new Section ("Math");
        Section bio = new Section ("Biology");
        Section cs = new Section ("Computer science");
        Teacher albinson = new Teacher("Albinson", 1, "computer science");
        Teacher henri = new Teacher("Henri", 2, "math");
        Teacher mb = new Teacher("Mulholland-Beahrs", 2, "biology");
        Student sophie = new Student ("Sophie", 10, 95);
        Student wendy = new Student ("Wendy", 11, 96);
        Student gabe = new Student ("Gabe", 12, 97);
        Student maya = new Student ("Maya", 13, 98);
        Student eliot = new Student ("Eliot", 14, 99);
        Student ana = new Student ("Ana", 15, 100);

        math.setTeacher(henri);
        math.addStudent(sophie);
        math.addStudent(wendy);
        math.addStudent(gabe);
        math.addStudent(ana);
        bio.setTeacher(mb);
        bio.addStudent(maya);
        cs.setTeacher(albinson);
        cs.addStudent(sophie);
        cs.addStudent(gabe);
        cs.addStudent(eliot);

        System.out.println(math.toString());
        System.out.println(bio.toString());
        System.out.println(cs.toString());
    }

}
