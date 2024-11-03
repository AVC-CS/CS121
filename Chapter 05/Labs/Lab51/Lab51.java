package Lab51;

public class Lab51 {
    public static void main(String[] args) {
        String sname = "John";
        int id = 123;
        String address = "123 Main St";
        display(sname, id, address);
    }

    public static void display(String sname, int id, String address) {
        System.out.print("Student Name: " + sname + "\t");
        System.out.print("Student ID: " + id + "\t");
        System.out.println("Student Address: " + address);
    }
}
