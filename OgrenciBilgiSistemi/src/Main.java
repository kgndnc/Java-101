public class Main {

    public static void main(String[] args) {

        Course mat = new Course("Matematik","MAT101","MAT");
        mat.setVerbalNoteRatio(0.2);
        Course fizik = new Course("Fizik", "FZK101","FZK");
        fizik.setVerbalNoteRatio(0.15);
        Course kimya = new Course("Kimya", "KMY101", "KMY");
        kimya.setVerbalNoteRatio(0.25);

        Teacher t1 = new Teacher("Mahmut Hoca", "905020000","MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Ali Yilmaz",4,"156165",mat,fizik,kimya);
        s1.setVerbalNote(mat,40);
        s1.setWrittenNote(mat,65);

        s1.setVerbalNote(fizik,100);
        s1.setWrittenNote(fizik,100);

        s1.setVerbalNote(kimya,51);
        s1.setWrittenNote(kimya,70);

        s1.isPass();

        Student s2 = new Student("John Doe",4,"45864",mat,fizik,kimya);
        s2.setVerbalNote(mat,54);
        s2.setWrittenNote(mat,45);

        s2.setVerbalNote(fizik,42);
        s2.setWrittenNote(fizik,65);

        s2.setVerbalNote(kimya,50);
        s2.setWrittenNote(kimya,40);
        s2.isPass();

        Student s3 = new Student("Elif Yildiz",4,"45864",mat,fizik,kimya);
        s3.setVerbalNote(mat,80);
        s3.setWrittenNote(mat,85);

        s3.setVerbalNote(fizik,36);
        s3.setWrittenNote(fizik,80);

        s3.setVerbalNote(kimya,70);
        s3.setWrittenNote(kimya,51);
        s3.isPass();


    }
}
