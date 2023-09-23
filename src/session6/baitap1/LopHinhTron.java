package session6Oop.baitap1;

import java.util.Scanner;

public class LopHinhTron {
    /*
    Xây dựng lớp Hình tròn
    Xây dựng lớp Circle gồm các thuộc tính : Bán kính và Màu sắc. các phương thức khởi tạo (constructor)
     0 tham số và có tham số, các phương thức getter và setter, phương thức chuVi() trả về chu vi của hình tròn
      , phương thức dienTich() trả về diện tích hình tròn ,phương thức inputData() cho phép người dùng nhập vào toàn
       bộ thông tin của đối tượng, phương thức displayData() cho phép hiển thị toàn bộ thông tin các thuộc tính.
       Yêu cầu vẽ biểu đồ lớp Circle trước khi triển khai.
      //Luyện tập định nghĩa lớp, tạo đối tượng và sử dụng các phương thức của đối tượng kết hợp kiến thức về mảng.
      Bước 1: Tạo lớp Circle, khai báo các thuộc tính (properties), định nghĩa các phương thức khởi tạo (constructors).
      Bước 2: Tạo lớp session6.baitap1.Main chưa phương thức main() để chạy chương trình.
      Bước 3: Trong lớp session6.baitap1.Main , khởi tạo các đối tượng hình tròn với bán kính khác nhau, tính chu vi và diện tích của các hình đó.
      Bước 4: Chạy chương trình và quan sát kết quả.

     */

    //Cú pháp: Access Modifier(private) + Datatype + attributeName;
    private double banKinh;
    private String mauSac;

    public LopHinhTron() {

    }

    public LopHinhTron(double banKinh, String mauSac) {
        this.banKinh = banKinh;
        this.mauSac = mauSac;
    }

    public LopHinhTron(int i) {
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        banKinh = banKinh;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        mauSac = mauSac;
    }

    public double chuVi() {
        return 2 * Math.PI * banKinh;
    }

    public double dienTich() {
        return Math.PI * banKinh * banKinh;
    }

    //Input để nhập
    public void inputData(Scanner scanner) {
        System.out.println("Hãy nhập bán kính");
        banKinh = Double.parseDouble(scanner.nextLine());
        System.out.println("Hãy nhập màu sắc");
        mauSac = scanner.nextLine();
    }

    //Pương thức displayData() cho phép hiển thị toàn bộ thông tin các thuộc tính
    public void displayData() {
        System.out.println("bán kính "+ banKinh);
        System.out.println("màu sắc "+ mauSac);
    }
}
