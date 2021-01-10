package itheim;

public class Test2 {
    public static void main(String[] args) {
        Student stu1 = new Student("离得近","软件工程");
        Student stu2 = new Student("李建华","计算机与科学技术");

        /*System.out.println("姓名：" + stu1.getName()+"  专业："+stu1.getZhuangye());*/
        System.out.println(stu1);
        System.out.println("id:"+stu1.getId()+"  密码："+stu1.getPassword());
        System.out.println("姓名：" + stu2.getName()+"  专业："+stu2.getZhuangye());
    }
}
