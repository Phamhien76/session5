package session7AccessModifier.baitap1.baiTap2;

public class Main {
    public static void main(String[] args) {
       /*
           //Bước 2 : Tạo lớp Main có phương thức main () , trong phương thức main . Trong hàm main(),
    // sử dụng các phương thức static để tính diện tích các hình sau:
    //Hình tròn có bán kính lần lượt là 3.5 và 6.
    //Hình tam giác có các cạnh là (3, 4, 5), (4.5, 7, 6).
    //Hình chữ nhật có kích thước (2.5, 6) và (4, 7).
        */
        //diện tích hình tròn
        double dtHinhTron1=StaticMethod.calCircleArea(3.5);
        double dtHinhTron2=StaticMethod.calCircleArea(6);

        System.out.println("Dt hình tròn 1 là: "+dtHinhTron1);
        System.out.println("Dt hình tron2 là: "+dtHinhTron2);

        //dien tích hình tam giác

        double dtTamGiac1=StaticMethod.calTriangleArea(3,4,5);
        double dtTamGiac2=StaticMethod.calTriangleArea(4.5,7,6);

        System.out.println("dt tam giác 1 là: "+dtTamGiac1);
        System.out.println("dt tam giác 2 là: "+dtTamGiac2);

        //diện tích hình chữ nhật
        double dtChuNhat1=StaticMethod.calRectangleArea(2.5,6);
        double dtChuNhat2=StaticMethod.calRectangleArea(4,7);
        System.out.println("dt chữ nhật 1 là: "+dtChuNhat1);
        System.out.println("dt chữ nhật 2 là: "+dtChuNhat2);
    }
}
