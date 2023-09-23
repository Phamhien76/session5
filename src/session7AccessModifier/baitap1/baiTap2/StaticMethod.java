package session7AccessModifier.baitap1.baiTap2;

public class StaticMethod {
    /*
    Xây dựng các phương thức tĩnh
    Trong bài này, chúng ta sẽ xây dựng 1 class tên là StaticMethod có 1 thuộc tính static là PI với giá trị = 3.14,
     các phương thức static như:
     calCircleArea(double R) để tính diện tích hình tròn.
     calRectangleArea(double width,double height) để tính diện tích hình chữ nhật.
     calTriangleArea(double a, double b, double c) để tính diện tích của tam giác
     */
    //Bước 1 : Tạo class StaticMethod với các phương thức và thuộc tính trong mô tả
    public static double PI=3.14;
    //diện tích hình tròn
    public static double  calCircleArea(double R){
        return PI*R*R;
    }
    public  static double calRectangleArea(double width, double height){
        return width*height;
    }
    public static double calTriangleArea(double a, double b, double c){
        double s=(a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}
