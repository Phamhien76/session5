package session6Oop.baiTap2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
Bước 4: Viết chương trình thực thi như sau:

Nhập vào 3 giá trị cho a, b, c và hiển thị kết quả dựa trên việc tính delta. Nếu delta >= 0, hiển thị 2 nghiệm.
Nếu delta bằng 0, hiển thị một nghiệm (do 2 nghiệm bằng nhau). Còn lại hiển thị chuỗi “The equation has no roots”
 */
        //nhập vào giá trị a,b,c
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập giá trị a: ");
        double a=Double.parseDouble(scanner.nextLine());
        System.out.println("nhập giá trị b: ");
        double b=Double.parseDouble(scanner.nextLine());
        System.out.println("nhập giá trị c: ");
        double c=Double.parseDouble(scanner.nextLine());
        LopQuadraticEquation lopQuadraticEquation=new LopQuadraticEquation(a,b,c);

        if(lopQuadraticEquation.getDiscriminant()>0){
            System.out.println(lopQuadraticEquation.getRoot1());
            System.out.println(lopQuadraticEquation.getRoot2());

        } else if (lopQuadraticEquation.getDiscriminant()==0) {
            System.out.println(lopQuadraticEquation.getRoot2());

        } else  {
            System.out.println("Phương trình không có nghiệm");
        }
    }

}
