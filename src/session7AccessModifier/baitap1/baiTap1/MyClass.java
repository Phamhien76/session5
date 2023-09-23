package session7AccessModifier.baitap1.baiTap1;

public class MyClass {
    /*
     Truy cập và chỉnh sửa thuộc tính private
     Trong bài này, chúng ta sẽ xây dựng 1 class tên là MyClass có 1 thuộc tính private tên là myString có kiểu dữ
     liệu là String, các constructor ,các phương thức setter và getter cho phép thay đổi và lấy ra giá trị các
     thuộc tính private. Tạo đối tượng và thay đổi giá trị thuộc tính .
     */
    //Bước 1 : Tạo class MyClass với các phương thức và thuộc tính trong mô tả
    private String myString;

    //Constructor mặc định
    public MyClass() {

    }

    public MyClass(String myString) {
        this.myString = myString;
    }


// get
    public String getMyString() {
        return myString;
    }
    //set
    public void setMyString(String myString) {
        this.myString = myString;
    }


}
