package session7AccessModifier.baitap1.baiTap3;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1=new Circle();
        Circle circle2=new Circle(2.5);

        System.out.println("Circle1 - Radius: "+circle1.getRadius()+", Area: "+circle1.getArea());
        System.out.println("Circle2 - Radius: "+circle2.getRadius()+", Area: "+circle2.getArea());
    }

}
