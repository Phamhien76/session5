package session6Oop.baitap1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

//tạo đối tượng hình tròn 1 và
        LopHinhTron hinhTron1=new LopHinhTron(3,"yealo");
        //tạo đối tượng hình tròn 2
        LopHinhTron hinhTron2=new LopHinhTron(2.0, "Green");
        LopHinhTron hinhTron3=new LopHinhTron(2);

       hinhTron1.displayData();

        System.out.println("Nhập thông tin cho hinh tròn 1: ");
        hinhTron1.inputData(scanner);

        System.out.println("hinhTron 1");
        hinhTron1.displayData();
        System.out.println("Chu vi hình tròn 1: " +  hinhTron1.chuVi());
        System.out.println("Dien tích hình tròn 1: " +hinhTron1.dienTich());


        System.out.println("\nhinhTron 2");
        hinhTron2.displayData();
        System.out.println("Chu vi hình tròn 2: " + hinhTron2.chuVi());
        System.out.println("Diện tích hình tròn 2: " + hinhTron2.dienTich());


    }
}