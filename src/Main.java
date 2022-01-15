import java.util.Scanner;

public class Main {

    public static int[] sortArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                int temp = arr[i];
                if(arr[j] < arr[i]){
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static int[] reverseSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                int temp = arr[i];
                if(arr[j] > arr[i]){
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void toString(int[] arr){
        System.out.print("[ ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("]\n");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin Boyutunu Girin : ");
        int size = scanner.nextInt();
        int[] inputs = new int[size];
        for(int i = 0; i < size; i++){
            System.out.print((i+1) + ". Dizi Elemanını Girin : ");
            inputs[i] = scanner.nextInt();
        }
        toString(inputs);
        System.out.println("**************");
        System.out.println("Sorting Array");
        toString(sortArr(inputs));
        System.out.println("****************");
        System.out.println("Reverse Sorting");
        toString(reverseSort(inputs));
    }
}
