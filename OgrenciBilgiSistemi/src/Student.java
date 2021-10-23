public class Student {
    private String name,stuNo;
    private int classes;
    private Course mat, fizik, kimya;
    private double average;
    private boolean isPass;

    public Student(){

    }

    public Student(String name,int classes, String stuNo,  Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;

    }

    public void setVerbalNote(Course course,double verbalNote){
        if(verbalNote>=0 && verbalNote<=100){
            course.setVerbalExamNote(verbalNote);
        }else {
            System.out.println("0-100");
        }
    }

    public void setWrittenNote(Course course,double writtenNote){
        if(writtenNote>=0 && writtenNote<=100){
            course.setWrittenExamNote(writtenNote);
        }else {
            System.out.println("0-100");
        }
    }

    public void addBulkExamNote(double mat, double fizik, double kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.setFinalNote(mat);
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.setFinalNote(fizik);
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.setFinalNote(kimya);
        }
    }
    public void isPass() {
        if (this.mat.getFinalNote() == 0 || this.fizik.getFinalNote() == 0 || this.kimya.getFinalNote() == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.printf("Ortalama : %.2f%n" , this.average);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAverage() {
        this.average = (this.fizik.getFinalNote() + this.kimya.getFinalNote() + this.mat.getFinalNote()) / 3.0;
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average >= 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.printf("Matematik Notu : %.2f%n" , this.mat.getFinalNote());
        System.out.printf("Fizik Notu : %.2f%n" , this.fizik.getFinalNote());
        System.out.printf("Kimya Notu : %.2f%n" , this.kimya.getFinalNote());
    }
}
