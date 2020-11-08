package academy.belhard;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Plates plate1 = new Plates(6,2);
        Plates plate2 = new Plates(10,3);
        Plates plate3 = new Plates(3,10);


        Set<Plates> platesHashSet = new HashSet<>();
        platesHashSet.add(plate1);
        platesHashSet.add(plate2);
        platesHashSet.add(plate3);


        System.out.println(plate1.toString());
        System.out.println(plate2.toString());
        System.out.println(plate3.toString());

        System.out.println(plate2.equals(plate3));

        System.out.println(plate2.hashCode());
        System.out.println(plate3.hashCode());
    }
}
