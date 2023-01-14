import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] genArr = generateArray(100);
        printArray(genArr);
        int[] sortedArr = sort(genArr);
        printArray(sortedArr);
        int[] revArr = reverse(sortedArr);
        printArray(revArr);
        System.out.println(equalsReverse(sortedArr, revArr));

    }

    public static int[] generateArray(int n) {
        int[] genArr = new int[n];
        Random randNum = new Random();
        for (int i = 0; i < n; i++) {
            genArr[i] = randNum.nextInt();
        }
        return genArr;
    }

    public static void printArray(int[] genArr) {
        System.out.println(Arrays.toString(genArr));
    }

    public static int[] sort(int[] AArray) {
        int[] sortedArr = AArray;
        for (int i = 0; i < sortedArr.length; i++) {
            for (int j = i + 1; j < sortedArr.length; j++) {
                if (sortedArr[i] > sortedArr[j]) {
                    int temp = 0;
                    temp = sortedArr[i];
                    sortedArr[i] = sortedArr[j];
                    sortedArr[j] = temp;
                }
            }
        }
        return sortedArr;

    }

    public static int[] reverse(int[] BArray) {
        int[] revArr = new int[BArray.length];
        for (int i = 0; i < BArray.length; i++)
            revArr[i] = BArray[BArray.length - i - 1];
        return revArr;

    }

    public static boolean equalsReverse(int[] sortedArr, int[] revArr) {
        if (sortedArr.length != revArr.length)
            return false;
        for (int i=0;i<sortedArr.length;i++)
            if (sortedArr[i] != revArr[sortedArr.length-i-1])
                return false;
        return true;
    }
}

