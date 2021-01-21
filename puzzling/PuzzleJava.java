import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;



public class PuzzleJava {
    
    // Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. 
    // Print the sum of all numbers in the array. Also have the function return 
    // an array that only includes numbers that are greater than 10 
    // (e.g. when you pass the array above, it should return an array with the values of 13,25,32)

    
    public static ArrayList<Integer> sumAndGreaterThan(int [] arr) {
        int sum = 0;
        ArrayList<Integer> newArray = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > 10) {
                newArray.add(arr[i]);
            }
        }
        System.out.println(sum);
        return newArray;
    }

    // Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. 
    // Shuffle the array and print the name of each person. Have the method also return an 
    // array with names that are longer than 5 characters.
    public static ArrayList<String> shuffleNames() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.add("Nancy");
        newArray.add("Jinichi");
        newArray.add("Fujibayashi");
        newArray.add("Momochi");
        newArray.add("Ishikawa");
        // System.out.println(newArray);
        Collections.shuffle(newArray);
        
        // for(int i =0; i < newArray.size(); i++) {
        //     if(newArray.get(i).length() <=5){
        //         newArray.remove(i);
        //     }
        // }
        ArrayList<String> newArray2 = new ArrayList<String>();

        for( String name : newArray) {
            // System.out.println(name);
            // System.out.println(name.length());
            if(name.length()>5) {
                newArray2.add(name);
            }
        }

        System.out.println(newArray2);
        return newArray;
    }

    

    
    // Create an array that contains all 26 letters of the alphabet (this array must have 26 values). 
    // Shuffle the array and, after shuffling, display the last letter from the array. 
    // Have it also display the first letter of the array. 
    // If the first letter in the array is a vowel, have it display a message.


    public static void shuffleAlphabet(){
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for(char i ='a'; i <='z'; i++) {
            alphabet.add(i);
            Collections.shuffle(alphabet);
            System.out.println(alphabet);
            System.out.println(alphabet.get(alphabet.size()-1));
            System.out.println(alphabet.get(0));
            String vowels = "aeiou";
            if(vowels.indexOf(alphabet.get(0)) != -1) {
                System.out.println("First letter is a vowel");
            }
    }
}

    // Generate and return an array with 10 random numbers between 55-100.
    public ArrayList<Integer> tenRandomNumbers() {
        Random random = new Random();
        ArrayList<Integer> returnValue = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
            returnValue.add(random.nextInt(100 - 55) + 55);
        }
        System.out.println(returnValue);
        return returnValue;
    }

    // Create a random string that is 5 characters long.

    public static String randomString() {
        String str ="";
        Random rand = new Random();
        int randomNum;
        ArrayList<Character> alphabet = new ArrayList<Character>();

        for(char i ='a'; i <='z'; i++) {
            alphabet.add(i);
        }
        for(int i = 0; i<5; i++) {
            randomNum = rand.nextInt(26);
            str += alphabet.get(randomNum);
        }

        System.out.println(str);
        return str;

    }
    // Generate an array with 10 random strings that are each 5 characters long
    public static  String[] arrayOfStrings(){
        String[] arr = new String[10];
        for(int i =0; i < arr.length; i++) {
            arr[i] = randomString();
        }
        System.out.println(Arrays.toString(arr));
        // System.out.println(arr);
        return arr;
    }

}