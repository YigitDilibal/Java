package day21_multiDimensionalArrays;

public class C06_InnerArraySonElementlerinToplami {

    public static void main(String[] args) {

        // Verilen 2 katli bir array’de her bir inner array’in son elementlerinin toplaminini yazdiran bir method olusturun.

        int [][] arr = {{3,5,6,7} , {2,3,4,5,6,7,8} , {8,8,8,99,9,54} , {3,5,2,1}};

        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = arr[i].length-1; j < arr[i].length ; j++) {

                sayac+=arr[i][j];
            }
        }

        System.out.println("son elementlerin toplami: " + sayac);

    }
}
