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

class RotateArray {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90}; 
        int numberOfRotations = sc.nextInt();
        Rotate rObj = new Rotate();           
        rObj.rotate(arr, numberOfRotations);
    }
}