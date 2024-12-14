package day44_mapsUpdate_entrySet;

public class C09_NestedMapTopluBolumUpdate extends NestedMapDepo{

    public static void main(String[] args) {

        // tum ogrencileri gozden gecirip eski bolumu verilen ogrencilerin bolumunu
        // verilen yeni bolum ile update edin


        String eskiBolum = "MF";
        String yeniBolum = "Sayisal";

        for (Integer each : ogrenciNestedMap.keySet()) {

            if (ogrenciNestedMap.get(each).get("bolum").equals("MF")) {
                ogrenciNestedMap.get(each).replace("bolum", "Sayisal");
            }
        }

    }
}
