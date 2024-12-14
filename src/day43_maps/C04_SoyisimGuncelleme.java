package day43_maps;

public class C04_SoyisimGuncelleme extends MapDepo{

    public static void main(String[] args) {

        // numarasi verilen ogrencinin
        // soyismini verilen yeniSoyisim olarak update edin

        int ogrenciNo = 103;
        String yeniSoyisim = "Yilmaz";

        String eskiValue = ogrenciMap.get(ogrenciNo);

        String[] eskiValuearr = eskiValue.split("-");

        eskiValuearr[1] = yeniSoyisim;

       String yeniValue = String.join("-",eskiValuearr);

//        String yeniValue = "";

//        for (int i = 0; i < eskiValuearr.length; i++) {
//
//            yeniValue+= eskiValuearr[i]+"-";
//
//        }
//
//        int sonindex = yeniValue.lastIndexOf('-');
//        String yeniValueSt = yeniValue.substring(0,sonindex);
//        System.out.println(yeniValueSt);

        ogrenciMap.put(ogrenciNo,yeniValue);









    }
}
