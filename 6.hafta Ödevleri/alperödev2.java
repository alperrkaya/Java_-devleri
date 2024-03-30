import java.util.Arrays;
import java.util.Random;

public class alperödev2 {
    public static void main(String[] args) {
        int totalMultiplication = 0;
        int totalSum = 0; 

        Random rand = new Random();
        for (int i = 0; i < 4; i++) { 
            int[] array = new int[4]; 
            for (int j = 0; j < 4; j++) { 
                array[j] = rand.nextInt(4) + 5; 
            }
            Arrays.sort(array); // Dizi sıralanıyor
            System.out.println((i + 1) + ". dizi (sıralı): " + Arrays.toString(array));

            for (int k = i + 1; k < 4; k++) { 
                totalMultiplication += multiplyArrays(array, Arrays.copyOf(array, array.length));
                totalSum += sumArrays(array, Arrays.copyOf(array, array.length));
            }
        }

        System.out.println("Dizilerin çarpımı: " + totalMultiplication);
        System.out.println("Dizilerin toplamı: " + totalSum);
    }

   
    public static int multiplyArrays(int[] arr1, int[] arr2) {
        int result = 0;
        int minLength = Math.min(arr1.length, arr2.length);
        for (int i = 0; i < minLength; i++) {
            result += arr1[i] * arr2[i];
        }
        return result;
    }

    
    public static int sumArrays(int[] arr1, int[] arr2) {
        int result = 0;
        int maxLength = Math.max(arr1.length, arr2.length);
        for (int i = 0; i < maxLength; i++) {
            if (i < arr1.length) {
                result += arr1[i];
            }
            if (i < arr2.length) {
                result += arr2[i];
            }
        }
        return result;
    }
}
