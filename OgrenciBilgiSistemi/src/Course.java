public class Course {
    private Teacher courseTeacher;
    private String name;
    private String code;
    private String prefix;
    private double writtenExamNote,verbalExamNote,finalNote;
    private double verbalNoteRatio;
    private double writtenNoteRatio;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
    }

    public void addTeacher(Teacher t){
        if(this.prefix.equals(t.getBranch())){
            this.courseTeacher = t;
            System.out.println("Ogretmen ekleme islemi basarili.");
        }
        else{
            System.out.println(t.getName() + " Akademisyeni bu dersi veremez" +
                    "cunku bransi farkli.");
        }
    }

    public void printTeacher(){
        if(courseTeacher != null){
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.getName());
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamistir.");
        }
    }

    public Teacher getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(Teacher courseTeacher) {
        this.courseTeacher = courseTeacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public double getWrittenExamNote() {
        return writtenExamNote;
    }

    public void setWrittenExamNote(double writtenExamNote) {
        if (writtenExamNote >= 0 && writtenExamNote <= 100)
            this.writtenExamNote = writtenExamNote;
        else
            System.out.println("Girilen notlar 0 ile 100 arasinda olmalidir.");
    }
    public void setVerbalNoteRatio(double ratio){
        if (ratio >= 0 && ratio <= 1.0) {
            this.verbalNoteRatio = ratio;
            this.writtenNoteRatio = 1.0 - ratio;
        }
        else
            System.out.println("Girilen oran 0.0 ile 1.0 arasinda olmalidir.");
    }

    public double getVerbalExamNote() {
        return verbalExamNote;
    }

    public void setVerbalExamNote(double verbalExamNote) {
        if (verbalExamNote >= 0 && verbalExamNote <= 100)
            this.verbalExamNote = verbalExamNote;
        else
            System.out.println("Girilen notlar 0 ile 100 arasinda olmalidir.");
    }
    public void calculateFinalNote(){
        if (verbalNoteRatio + writtenNoteRatio == 1.0) {
            this.finalNote = (verbalExamNote * verbalNoteRatio) + (writtenExamNote * writtenNoteRatio);
        }
    }

    public double getFinalNote() {
        calculateFinalNote();
        return finalNote;
    }

    public void setFinalNote(double finalNote) {
        this.finalNote = finalNote;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseTeacher=" + courseTeacher +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", prefix='" + prefix + '\'' +
                ", writtenExamNote=" + writtenExamNote +
                ", verbalExamNote=" + verbalExamNote +
                ", finalNote=" + finalNote +
                '}';
    }
}
