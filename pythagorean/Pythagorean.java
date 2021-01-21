import java.lang.Math;


public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        // the hypotenuse is the side across from the right angle. 
        double A =  legA * legA;
        double B = legB * legB;
        double legC = Math.sqrt(A+B);
        return legC;
    }
    }



