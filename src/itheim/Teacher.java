package itheim;

public class Teacher extends User {
    private String zhiwei;
    public Teacher(){
        super(1111,"jhdkshfjk");
    }

    public String getZhiwei() {
        return zhiwei;
    }

    public void setZhiwei(String zhiwei) {
        this.zhiwei = zhiwei;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "zhiwei='" + zhiwei + '\'' +
                '}';
    }
}
