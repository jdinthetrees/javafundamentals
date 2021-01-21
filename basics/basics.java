import java.util.ArrayList;
import java.util.Arrays;

public class basics {

    public static void oneTo255() {
        for(int i = 1; i<= 255; i++){
            System.out.println(i);
        }
    }

    public static void oddTo255() {
        for(int i =1; i <= 255; i++) {
            if(i % 2 ==1) {
                System.out.println(i);
            }
        } 
    }

    public static void printSum() {
        int sum = 0;
        for(int i =1; i <= 255; i++) {
            sum += i;
            System.out.println(String.format("Current num: %d Sum: %d", i, sum));
        }
    }

    public static void iterate(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void findMax(int [] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public void getAverage(int [] arr) {
        int avg = 0;
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum+=arr[i];
        }
        avg = sum/arr.length;
        System.out.println(avg);
    }

    public ArrayList<Integer> arrayOfOdd() {
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for(int i = 0; i <= 255; i++) {
            if(i % 2 == 1) {
                newArray.add(i);
            }
        }
        System.out.println(newArray);
        return newArray;
    }

    public void greaterThanY(int [] arr, int Y) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]>Y) {
                count++;
            }
        }
        System.out.println(count);
    }

    public void squareTheValues(int [] arr) {
        for(int i =0; i<arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
    
    public void eliminateNegatives(int [] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
        
    }

    public double[] maxMinAverage(int [] arr) {
        double min=arr[0];
        double max=arr[0];
        double sum=arr[0];
        for(int i =0; i < arr.length; i++) {
            if(arr[i]>max) {
                max=arr[i];
            } else if (arr[i]<min) {
                min=arr[i];
            }
            sum += arr[i];
        }
        double [] newArray = {max, min, sum/arr.length};
        return newArray;
        
    }

    public void shiftValues(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i+1 == arr.length) {
                arr[i] = 0;
            } else {
                arr[i] = arr[i+1];
            }
        }
        System.out.println(Arrays.toString(arr));
    }



    

} 