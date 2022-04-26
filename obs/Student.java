package obs;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;
    double gradeAvarage;
    double noteAvarage;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.gradeAvarage=gradeAvarage;
        this.isPass = false;


    }


    public void addBulkExamNote(int mat, int fizik, int kimya,int gradeMat,int gradeFizik,int gradeKimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
        this.mat.stGrade=gradeMat;
        this.fizik.stGrade=gradeFizik;
        this.kimya.stGrade=gradeKimya;

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemis");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sinifi Gecti. ");
            } else {
                System.out.println("Sinifta Kaldi.");
            }
        }
    }

    public void calcAvarage() {
        this.noteAvarage=(this.fizik.note*0.80)+(this.kimya.note*0.80) + (this.mat.note)*0.80;

        this.gradeAvarage=(this.fizik.stGrade*this.fizik.grade)+(this.mat.stGrade*this.mat.grade)+(this.kimya.stGrade+this.kimya.grade);
        this.avarage = (this.noteAvarage+this.gradeAvarage ) / 3.0;

    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){

        System.out.println("Ögrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Fizik Sözlü Notu:"+this.fizik.stGrade);
        System.out.println("Matematik Sözlü Notu:"+this.mat.stGrade);
        System.out.println("Kimya Sözlü Notu:"+this.kimya.stGrade);


    }
}
