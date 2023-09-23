package session6Oop.baiTap4;

public class Main {
    public static void main(String[]args){
        // tạo 2 đối tượng cho fan
        Fanto fan1=new Fanto();
        fan1.setSpeed(fan1.getFAST());
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        Fanto fan2=new Fanto();
        fan2.setSpeed(fan2.getMEDIUM());
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        //hiển thị thông tin toString          Ｂｋｍｌｌヴぉいｔ８７
        System.out.println("Fan 1:\n"+fan1.toString());
        System.out.println("Fan 2:\n"+fan2.toString());
    }
}
