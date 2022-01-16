package week05;
import java.util.Scanner;
public class inputDataFromKeyboard {
    public static void main(String[] args) {
        // nextByte
        // nextShort
        // nextInt
        // nextFloat
        // nextDouble
            Scanner kb = new Scanner(System.in);
           System.out.print("กรุณาป้อนรหัสนักศึกษา :");
            String id = kb.nextLine();
            System.out.print("ชื่อ-นามสกุล :");
            String name =kb.nextLine();
            System.out.print("กรุณาป้อนปีเกิด : ");
            short year = kb.nextShort();
            System.out.print("ผลเกรดเฉลี่ยสะสมของนิสิต :");
            float GPA = kb.nextFloat();
            int age = 2564-year;
    
            System.out.println("รหัสที่ประจำตัว : "+id);
            System.out.println("ชื่อ :"+name);
            System.out.println("ปีเกิดที่ป้อน : "+year);
            System.out.println("ผลเกรดเฉลี่ย :"+GPA);
            System.out.println("อายุ :"+age);
            kb.close();

        }
    }