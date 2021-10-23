public class Teacher {
    private String name;
    private String mpno;
    private String branch;

    public Teacher(){
    }
    public Teacher(String name, String mpno, String branch){
        this.name=name;
        this.mpno=mpno;
        this.branch=branch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMpno() {
        return mpno;
    }

    public void setMpno(String mpno) {
        this.mpno = mpno;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", mpno='" + mpno + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
}
