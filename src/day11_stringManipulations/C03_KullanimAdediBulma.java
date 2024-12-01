package day11_stringManipulations;

import java.util.Scanner;

public class C03_KullanimAdediBulma {

    public static void main(String[] args) {

        //3- Kullanicidan bir cumle ve aranan bir metin parcasi isteyin
//   kullanicinin verdigi metinlere gore asagidaki 3 cumleden birini yazdirin
//     - cumle aranan metni icermiyor
//     - cumle aranan metni sadece 1 adet iceriyor
//     - cumle aranan metni birden fazla iceriyor

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen arama yapacaginiz cumleyi yaziniz..");
        String cumle = scanner.nextLine();
        System.out.println("Lutfen arayacaginiz metni yaziniz..");
        String arananMetin = scanner.nextLine();


        if (cumle.indexOf(arananMetin) == -1){
            System.out.println("Cumle aranan metni icermiyor");
        } else if (cumle.indexOf(arananMetin) == cumle.lastIndexOf(arananMetin)) {
            System.out.println("cumle aranan metni sadece 1 adet iceriyor");
        }else{
            System.out.println("cumle aranan metni birden fazla iceriyor");
        }
    }
}
