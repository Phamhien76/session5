package session6Oop.baiTap6;

public class Main {
    public static void main(String[] args){

         //Bước 2: Tạo lớp Main chưa phương thức main() để chạy chương trình.
    //Bước 3: .Trong phương thức main() , khởi tạo 5 đối tượng nhân viên từ lớp Employee, tính lương và hiển thị toàn
    // bộ thông tin các nhân viên ra màn hình.

        Employee[] employee=new Employee[5];
        // khởi tạo 5 đối tượng nhân viên từ lớp Employee
        for (int i=0;i<5;i++){
            System.out.println("Nhập thông tin cho nhân viên thứ: "+(i+1)+":");
            employee[i].inputData();
            employee[i].calSalary();
        }
        //hiển thị thông tin nhân viên
        System.out.println("Thông tin của các nhân viên: ");
        for (int i=0; i<5;i++){
            System.out.println("Nhân viên thứ"+(i+1)+": ");
            employee[i].displayData();
            System.out.println();
        }
    }
}
