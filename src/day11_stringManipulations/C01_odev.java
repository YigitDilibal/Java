package day11_stringManipulations;

public class C01_odev {
    public static class C10_Odev {

        public static void main(String[] args) {

            /*


            2- kullanıcıdan aldiğimiz bir metinde
            3 veya daha fazla "e" olup olmadiğini yazdirin...

            3- kullanıcıdan bir cümle ve aranan bir metin parçası isteyin.
             kullanıcının verdiği metinlere göre asagidaki 3 cümleden birini yazdirin.

             -cumle aranan metni içermiyor
             -cumle aranan metni sadece 1 adet içeriyor
             -cumle aranan metni 1 den fazla içeriyor.
             */

            String metin = "Ali topu at, at ali at.";

//            1- kullanicidan aldigimiz metinde 3'den fazla a harfi oldugunu biliyorsak
//            3. a 'nın indexini yazdirin.

            int birinciIndex = metin.indexOf('a'); //9
            int ikinciIndex = metin.indexOf("a", birinciIndex + 1); // 13
            int ucuncuIndex = metin.indexOf("a", ikinciIndex + 1);

            System.out.println("3. a'nin indexi : " + ucuncuIndex);

            metin = "evde oyun oynarken, evi cok dagittik.";

            birinciIndex = metin.indexOf('e');
            ikinciIndex = metin.indexOf("e", birinciIndex + 1);
            ucuncuIndex = metin.indexOf("e", ikinciIndex + 1);

            if (birinciIndex >= 0 && ikinciIndex > 0 && ucuncuIndex > 0) {
                System.out.println("Metinde 3 veya daha fazla e var");
            } else {
                System.out.println("Metinde 3 veya daha fazla e yok.");
            }


//            3- kullanıcıdan bir cümle ve aranan bir metin parçası isteyin.
//            kullanıcının verdiği metinlere göre asagidaki 3 cümleden birini yazdirin.
//
//                    -cumle aranan metni içermiyor
//                    -cumle aranan metni sadece 1 adet içeriyor
//            -cumle aranan metni 1 den fazla içeriyor.
//


            String cumle = "Java sen mi buyuksun, ben mi ? Elbette sen buyuksun..";
            String arananMetin = "ben";

            birinciIndex = cumle.indexOf(arananMetin);
            ikinciIndex = cumle.indexOf(arananMetin, birinciIndex + 1);
            
            if (birinciIndex == -1){
                System.out.println("Cumle aranan metni icermiyor");
            } else if (ikinciIndex == -1) {
                System.out.println("Cumle aranan metni sadece 1 adet iceriyor.");
            }else {
                System.out.println("cumle aranan metni 1 den fazla içeriyor.");
            }


        }

    }
}
