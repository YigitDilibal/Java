package day26_parametreliConstructorlar_constructorCall;

public class C03 {

    C03(){
        // Bir constructor'in icinden constructor'i ismi ile call edemezsiniz.
        // cunku isim(); syntax'i method call'a ozeldir.
        // eger constructor call yapmak istiyorsaniz
        // constructor'in ismi yerine this(5) yazariz
        this(5);
        System.out.println("parametresiz constructor calisti");
    }
    C03(int a){System.out.println("int parametreli constructor calisti");}


    public static void main(String[] args) {
        //C03 obj1 = new C03(5);
        C03 obj2 = new C03();

        C03 c03 = null;




    }

}
