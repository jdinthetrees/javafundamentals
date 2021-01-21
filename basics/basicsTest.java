import java.util.Arrays;

public class basicsTest {
    public static void main(String[] args) {
        basics test = new basics();
        test.oneTo255();
        test.oddTo255();
        test.printSum();
        int [] myArray= {-1,0,5,7,9,13};
        test.iterate(myArray);
        test.findMax(myArray);
        test.getAverage(myArray);
        test.arrayOfOdd();
        test.greaterThanY(myArray, 3); 
        test.squareTheValues(myArray);
        int[] myArray2 = {1,5,10,-2};
        test.eliminateNegatives(myArray2);
        System.out.println(Arrays.toString(test.maxMinAverage(myArray2)));
        test.shiftValues(myArray2);
    }
    
}