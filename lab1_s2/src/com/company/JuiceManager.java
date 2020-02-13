package com.company;

public class JuiceManager {

    public static void main(String[] args) {

        final int ARRAY_LENGTH = 4;

        Juicer.brand = "Samsung";

        Juicer first = new Juicer();
        Juicer second = new Juicer("silver", 1, 20, 2, 3, 5, 1111);
        Juicer third = new Juicer("red", 2, 30, 3 );

        first.toString();
        second.toString();
        third.toString();

        second.printBrand();
        Juicer.printStaticBrand();

        Juicer[] juicerArray = new Juicer[ARRAY_LENGTH];

        for ( var i = 0; i < ARRAY_LENGTH; i++) {
            juicerArray[i] = new Juicer();
        }

        for(Juicer newJuicer: juicerArray) {
            newJuicer.toString();
            System.out.println(newJuicer.toString() + "\n");
        }

    }

}

//