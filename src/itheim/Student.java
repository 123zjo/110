package itheim;

public class Student extends User {


    private String name;
    private String zhuangye;
    public Student(String  name,String zhuangye){
        super(12432434,"3284798374");
        this.name=name;
        this.zhuangye = zhuangye;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZhuangye() {
        return zhuangye;
    }

    public void setZhuangye(String zhuangye) {
        this.zhuangye = zhuangye;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                "password'" + getPassword() + '\'' +
                "id='" + getId() + '\'' +
                ", zhuangye='" + zhuangye + '\'' +
                '}';
    }
}
