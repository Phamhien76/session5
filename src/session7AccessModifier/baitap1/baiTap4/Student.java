package session7AccessModifier.baitap1.baiTap4;

public class Student {
    /*
    Chúng ta có lớp Student với các thông tin như sau
    Hai thuộc tính có access modifier là private: name (string) có giá trị mặc định là "John",
     class (String) có giá trị mặc định là "C02".
     Một hàm tạo không có tham số.
     Hai phương thức có access modifier là public: setName và setClasses.
     Hãy tạo lớp Test, tạo đối tượng và truy cập đến các phương thức setName(name: String) và setClasses(classes: String).
     Thay đổi access modifier cho các phương thức setName(name: String) và setClasses(classes: String), sau đó test lại.
     */
    private String name;
    private String classes;

    public Student(){
        name="John";
        classes="CO2";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
