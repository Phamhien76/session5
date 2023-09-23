package session7AccessModifier.baitap1.baiTap3;

public class Circle {
    /*
    Access modifier
    Chúng ta có lớp Circle như sau:
    Hai thuộc tính có access modifier là private: radius (double) có giá trị khởi tạo là 1.0,
    color (String) có giá trị khởi tạo là "red"
    Hai hàm tạo: một không có tham số và một có tham số là radius.
    ai phương thức có access modifier là public: getRadius và getArea.
    Hãy tạo lớp TestCircle, tạo đối tượng Circle và truy cập đến các phương thức getRadius() và getArea().
    Thay đổi access modifier cho các phương thức getRadius() và getArea(), sau đó test lại.
     */
    // khởi tạo thuộc tính
    private double radius;
    public String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    //get set

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }


}
