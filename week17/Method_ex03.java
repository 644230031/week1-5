package week17;

public class Method_ex03 {
    // method แบบที่ 3 มีการรับค่าที่ส่งมาจาก main program เเต่ลูกส่งค่าออกคืนเเม่
    public static void main(String[] args) {
        int phone = getPhoneNumber();
        System.out.println(getPhoneNumber());
        int lucky = 999;
        int newphone = phone+lucky;
        System.out.println(newphone);
        
    }

    static int getPhoneNumber(){
        return 955396885;

    }
    
}
