import java.util.List;

public class ArrayOps {
    public static void main(String[] args) {
    } 
    public static int findMissingInt (int [] array) {
        int n = array.length + 1;
        int sumtotal = 0;
        int MissingNumber = 0;
        for (int i = 0; i < n; i++) {
            sumtotal  += i;
            }
        MissingNumber = sumtotal - sumArry(array);
        return MissingNumber;
        }
                
    public static int secondMaxValue(int [] array) {
        int maxIndex = 0;
        int maxValue = array[0]; // Initialize max with the first element of the array
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i]; // Update maxValue if current element is greater
                maxIndex = i;
            }
        }
        int maxsecond = array[0];
        for (int j = 0; j < array.length; j++) {
            if( array[j] > maxsecond && j != maxIndex)
                maxsecond = array[j];
            }
            return maxsecond;
        }
        

    

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
        return false;
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        return false;
    }
    public static int sumArry(int[] array){
        int sum = 0 ;
        for (int i = 0; i < array.length; i++) {
        sum += array[i];
        }
        return sum ;
    }

    public static int maxvalue(int[] array){
        int maxIndex = 0;
        int maxValue = array[0]; // Initialize max with the first element of the array
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i]; // Update maxValue if current element is greater
                maxIndex = i;
            }
        }
        return maxValue;
    }
    
}