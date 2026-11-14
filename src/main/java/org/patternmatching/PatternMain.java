package org.patternmatching;

public class PatternMain {
    static void main() {

        // without instanceof pattern matching
         Object obj1 = new TwoWheeler();
         if(obj1 instanceof Vehicle){
             TwoWheeler twoWheeler = (TwoWheeler) obj1;
             twoWheeler.drive();
         } else if (obj1 instanceof FourWheeler) {
             FourWheeler fourWheeler = (FourWheeler) obj1;
             fourWheeler.drive();
         }

         Object obj2 = new TwoWheeler();
         if(obj2 instanceof Vehicle vehicle){
             vehicle.drive();
         }
    }
}
