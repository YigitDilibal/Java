package day10_stringManipulations;

import java.util.Scanner;

public class C08_mailControl {

    public static void main(String[] args) {

//        kullanicidan bir mail alin
//        - mail @ icermiyorsa "gecersiz mail"
//                - mail @gmail.com icermiyorsa, "mail gmail olmali"
//                - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"
//        yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen e-posta adresinizi giriniz..");
        String mail = scanner.nextLine();

        if (!mail.contains("@")){
            System.out.println("Gecersiz mail");
        } else if (!mail.contains("@gmail.com")) {
            System.out.println("mail gmail olmali");
        } else if (!mail.endsWith("@gmail.com")) {
            System.out.println("mailde yazim hatasi var");
        }else {
            System.out.println("bir sorun yok gibi gozukuyor");
        }


    }
}
