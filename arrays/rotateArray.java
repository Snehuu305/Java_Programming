import java.itil.Scanner;

class Rotate {

    public void rotate(int arr[], int numberOfRotations) {
       int lengthOfArray = arr.length;
       numberOfRotations = numberOfRotations % lengthOfArray;
       int rotatedArr[] = new int[lengthOfArray];     

        for(int i = 0; i < numberOfRotations; i++) {
            rotatedArr[i] = arr[lengthOfArray - numberOfRotations + i];
        }

        for(int i = numberOfRotations; i < lengthOfArray; i++) {
            rotatedArr[i] = arr[i - numberOfRotations];
        }

        for(int i = 0; i < lengthOfArray; i++) {
            System.out.print(rotatedArr[i] + " ");
        }
    }
}
