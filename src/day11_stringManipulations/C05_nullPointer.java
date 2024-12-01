package day11_stringManipulations;

public class C05_nullPointer {

    public static void main(String[] args) {

        String str;
        String ogr8 = "ahmet";

        /*
        bir kod blogunun icinde deger atamadan variable deklare edilebilir
        ancak deger atamadan kullanilamaz.

        peki "" atasak

        "" veya "   " atamak variable i kullanabilmek icin guzel olur
        ancak java bunlari da isim gibi bir deger atanmislar grubuna katar
        yani "Yigit" atamak ile "" atanmis olmasi Java acisindan aynidir.

        Bize eksta  bir cozum lazim

        hem deger atamayacagiz
        hem de java yazdirmamiza engel olmayacak

        null bir deger degil, pointer'dir
        null olarak isaretlenen bir variable'ia
        deger atanmadigini java bilir
        ama yazdirilmasina da engel olmaz

        Biz bir non-primitive variable i null olarak isaretledigimizde
        Java sadece yazdirmak uzere bize izin verir.

        Ama izin disina cikarsaniz
        yazdirmak disinda bir islem yaparsaniz
        NullPointerException hatasi verir.


         */

        String ogr7 = null;
        System.out.println(ogr7);


    }
}
