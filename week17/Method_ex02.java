package week17;

public class Method_ex02 {
    // method แบบที่ 2  มีการรับค่าที่ส่งมาจาก main program เเต่ไม่มีการส่งค่าออก
    public static void main(String[] args) {
        display("ดีใจจังเลย");
        plus(54,24);
        fullname("Tungmay",21);
        

    }
    static void plus(int num1, int num2){
        int result = num1+num2;
        System.out.println("ผลลัพธ์การบวก เท่ากับ " + result);

    }  
    static void display (String x){
        System.out.println(x);

    }
    static void fullname (String Fname, int age){
        System.out.println(Fname + " " + age);
    }



}
