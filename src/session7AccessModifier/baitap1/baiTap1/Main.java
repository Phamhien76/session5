package session7AccessModifier.baitap1.baiTap1;

public class Main {
    public static void main(String[] args){
        //Bước 2 : Tạo lớp Main có phương thức main () , trong phương thức main , hãy xây khởi tạo 1 đối tượng từ lớp
        // MyClass, hiển thị giá trị thuộc tính myString của đối tượng vừa tạo.

        //Bước 3: Thay đổi giá trị thuộc tính myString của đối tượng vừa tạo, sau đó hiển thị lại giá trị mới.

        //Khởi tạo đối tượng từ lớp MyClass
        MyClass myClass=new MyClass();

       //hiển thị giá trị ban đầu của myString
        System.out.println("giá trị ban đầu của myString: "+myClass.getMyString());
        //Thay đổi giá trị thuộc tính myString của đối tượng vừa tạo
        myClass.setMyString("Xin chào, tôi là Hiền");
        //hiển thì gt mơi
        System.out.println("Giá trị mới của myString: "+myClass.getMyString());
    }
}
