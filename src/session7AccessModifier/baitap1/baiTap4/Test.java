package session7AccessModifier.baitap1.baiTap4;

public class Test {
    public static void main(String[] args) {
        Student student=new Student();

        System.out.println("Name: "+student.getName()+", Class"+student.getClasses());

        //thay đổi thông tin
        student.setName("Mary");
        student.setClasses("CO3");

        //in thông tin
        System.out.println("Name: "+student.getName()+", Class: "+student.getClasses());
    }
}
