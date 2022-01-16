package week17;

public class Method_ex01 {
    // method แบบที่ 1  ไม่มีการส่งค่าจาก method main  และ ไม่มีการคืนค่ากลับจาก method ลูก
    public static void main(String[] args) {
        
       openFile();
       playFile();
       pauseFile();
       playFile();
       closeFile();
     
    }
    public static void openFile(){ // จะต้องมีคำว่า static void
        System.out.println("Open file......");
    }
    public static void playFile(){ 
        System.out.println("Play Misic......");

    }public static void pauseFile(){ 
            System.out.println("Stop Misic......");

    }public static void closeFile(){ 
            System.out.println("close......");
    }
}   // เมธอด เเบบที่1 ไม่มีการรับ-ส่ง ค่าข้อมูล ข้อมูลเปล่าๆ    

