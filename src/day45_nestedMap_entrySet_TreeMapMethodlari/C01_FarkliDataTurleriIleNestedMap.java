package day45_nestedMap_entrySet_TreeMapMethodlari;

import java.util.HashMap;
import java.util.Map;

public class C01_FarkliDataTurleriIleNestedMap {

    public static void main(String[] args) {

        /*
                asagidaki rezervasyon map'ini olusturun
           {
                "firstname" : "Ahmet",
                "lastname" : "Bulut",
                "totalprice" : 500,
                "depositpaid" : false,
                "bookingdates" : {
                       "checkin" : "2024-07-21",
                       "checkout" : "2024-08-10"
                          },
                "additionalneeds" : "wi-fi" }  */

        /*
            Map olusturmadan once
            1- hangi datalari key, hangilerini value yapacagimiza karar verelim.
            2- key ve value'nun data turune karar verelim
         */

        Map<String,Object> rezervasyonMapi = new HashMap<>();

        rezervasyonMapi.put("firstname","Yigit");
        rezervasyonMapi.put("lastname","Dilibal");
        rezervasyonMapi.put("totalprice",500);
        rezervasyonMapi.put("depositpaid",false);

        Map<String,String> bookingDatesMapi = new HashMap<>();
        bookingDatesMapi.put("checkin","2024-07-21");
        bookingDatesMapi.put("checkout","2024-08-10");

        rezervasyonMapi.put("bookingdates",bookingDatesMapi);
        rezervasyonMapi.put("additionalneeds","wi-fi");

        System.out.println(rezervasyonMapi);

        // rezervasyon map'indeki firstname degerini yazdirin
        System.out.println(rezervasyonMapi.get("firstname")); // Yigit

        // rezervasyon map'indeki depositpaid'in degerini yazdirin
        System.out.println(rezervasyonMapi.get("depositpaid")); // false

        // rezervasyon map'indeki checkin'in degerini yazdirin
        System.out.println(((Map<String,String>)rezervasyonMapi.get("bookingdates")).get("checkin"));

        // rezervasyon map'indeki checkout'in degerini yazdirin
        System.out.println(((Map<?, ?>) rezervasyonMapi.get("bookingdates")).get("checkout"));


    }



}
