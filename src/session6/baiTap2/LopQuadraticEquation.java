package session6Oop.baiTap2;

public class LopQuadraticEquation {
    /*Xây dựng lớp QuadraticEquation (Phương trình bậc hai)
Bước 1: Tạo lớp QuadraticEquation , khai báo các thuộc tính (properties), định nghĩa các phương thức khởi tạo (contructors).

Bước 2: Định nghĩa phương thức gettter cho a, b và c.

Bước 3: Định nghĩa phương thức getDiscriminant() trả về delta theo công thức delta = b2 - 4ac.



     */
    private double a;
    private double b;
    private double c;

    public LopQuadraticEquation() {
    }

    public LopQuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant(){
                return ((this.b*this.b)-(4*this.a*this.c));
    }

    public double  getRoot1(){
        return ((-this.b+Math.sqrt(getDiscriminant())/2*this.a));

    }
    public  double getRoot2(){
        return ((-this.b-Math.sqrt(getDiscriminant())/2*this.a));

    }

}
