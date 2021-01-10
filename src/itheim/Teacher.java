package itheim;

public class Teacher extends User {
    private String zhiwei;

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
