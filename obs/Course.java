package obs;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    double grade;
    int stGrade;

    public Course(String name, String code, String prefix,double grade) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.grade=grade;
        this.stGrade=0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("Islem basarili");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamistir.");
        }
    }
}
