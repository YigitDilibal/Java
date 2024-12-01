package day26_parametreliConstructorlar_constructorCall;

import day24_constructors.C04_Araba;
import day25_constructors.C02_Car;

public class C01_ArabaRunner {

    public static void main(String[] args) {

        C02_Car araba1 = new C02_Car();

        System.out.println(araba1);

        C02_Car araba2 = new C02_Car("Audi","Q5","Benzin",2010,10000);

        System.out.println(araba2);


    }
}
