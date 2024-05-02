package utils;

import java.util.Random;

public class ArrayGenerator {
    Random random = new Random();
    int arraySize;

    public ArrayGenerator(int size) {
        this.arraySize = size;
    }

    public int[] generateRandomIntArray(){
        int[] arr = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            arr[i] = random.nextInt(10);
        }

        return arr;
    }

    public int[][] generateTwoDimensionalArray(){
        int[][] arr = new int[arraySize][arraySize];

        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                arr[i][j] = random.nextInt(10);
            }
        }

        return arr;
    }

}
