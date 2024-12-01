package day21_multiDimensionalArrays;

public class C02_TumElementlereUlasma {

    public static void main(String[] args) {

        int [] sayilar = {3,8,0,2,6,1};

        // sayilar array'indeki tum elementlerin toplamini yazdirin

        int toplam = 0;

        for (int i = 0; i < sayilar.length ; i++) {

            toplam+= sayilar[i];

        }

        System.out.println("Sayilar arrayindeki elementlerin toplami: " + toplam);

        int[][] arr = { {2,3} , {3,6,9} , {1,4,9,5} , {1}};

        // arrdeki tum elementlerin toplamini yazdirin.

        toplam = 0;

        for (int i = 0; i < arr.length ; i++) { // outer array'i kontrol eder

            for (int j = 0; j < arr[i].length ; j++) { // inner arrayi kontrol eder

                toplam += arr[i][j];

            }
            
        }

        System.out.println("arr arrayinin toplami: " + toplam);




    }
}
