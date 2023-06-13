package examen2pp;
import java.util.*;
import java.io.*;

public class Main {

    static void reverseArray(int[] arr, int endIndex) {
        int startIndex = 0;
        while(startIndex < endIndex) {
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }

    static int findMaxIndex(int[] arr, int size) {
        int maxIndex = 0;
        for(int i = 0; i < size; i++) {
            if(arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while((line = br.readLine()) != null) {
            String[] splitLine = line.split(" ");
            int[] arr = new int[splitLine.length];
            int[] originalArray = new int[splitLine.length];
            List<Integer> numList = new ArrayList<>();

            for(int i = 0; i < splitLine.length; i++) {
                arr[i] = Integer.parseInt(splitLine[i]);
                originalArray[i] = arr[i];
            }

            int size = arr.length;
            while(size > 1) {
                int maxIndex = findMaxIndex(arr, size);
                if(maxIndex != size - 1) {
                    reverseArray(arr, maxIndex);
                    reverseArray(arr, size - 1);
                    if(maxIndex != 0) {
                        numList.add(arr.length - maxIndex);
                    }
                    numList.add(arr.length - size + 1);
                }
                size--;
            }

            numList.add(0);

            for(int i = 0; i < originalArray.length; i++) {
                if(i == originalArray.length - 1) {
                    System.out.print(originalArray[i]);
                } else {
                    System.out.print(originalArray[i] + " ");
                }
            }
            System.out.println();
            for(int i = 0; i < numList.size(); i++) {
                if(i == numList.size() - 1) {
                    System.out.print(numList.get(i));
                } else {
                    System.out.print(numList.get(i) + " ");
                }
            }
            System.out.println();
        }
    }
}