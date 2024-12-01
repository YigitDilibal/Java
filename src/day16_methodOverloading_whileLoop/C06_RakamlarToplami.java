package day16_methodOverloading_whileLoop;

public class C06_RakamlarToplami {

    public static void main(String[] args) {

        // verilen pozitif bir tamsayinin
        // rakamlar toplamini donduren bir method olusturun

        System.out.println(rakamlarToplaminiDondur(584));


    }

    public static int rakamlarToplaminiDondur(int sayi){ // 218

        int rakamlarToplami= 0 ;

        while ( sayi > 0){
            rakamlarToplami += sayi%10;
            sayi/=10;
        }





        return rakamlarToplami;

    }

}
