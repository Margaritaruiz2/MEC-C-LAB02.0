package Ejercicio3;
import java.util.Arrays;

public class EjerciciosPunto3 {
    public static void main(String args[]) {
        int opcion = 0;
        

       
        do{
            System.out.println("");
            System.out.println("""
                               ---Menu---
                                1. M\u00e9todo burbuja
                                2. M\u00e9todo inserci\u00f3n
                                3. M\u00e9todo selecci\u00f3n
                                4. M\u00e9todo mergesort
                                5. Salir""");
            System.out.println("Por favor digite la opción: ");
            

        int[] sizes = {100, 500, 1000, 5000, 10000};
        for (int size : sizes) {
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * 1000);
            }
            long startTime, endTime;
            if (opcion == 1){
                startTime = System.nanoTime();
                bubbleSort(arr.clone());
                endTime = System.nanoTime();
                System.out.printf("Método burbuja con %d números al azar, tiene un tiempo de: %.4f ms\n", size, (endTime - startTime) / 1000000.0);
                System.out.println("");
            }
            else{
                if (opcion == 2){
                    startTime = System.nanoTime();
                    insertionSort(arr.clone());
                    endTime = System.nanoTime();
                    System.out.printf("Método inserción con %d números al azar, tiene un tiempo de: %.4f ms\n", size, (endTime - startTime) / 1000000.0);
                    System.out.println("");
            }
                else{
                    if(opcion == 3){
                        startTime = System.nanoTime();
                        selectionSort(arr.clone());
                        endTime = System.nanoTime();
                        System.out.printf("Método selección con %d números al azar, tiene un tiempo de: %.4f ms\n", size, (endTime - startTime) / 1000000.0);
                        System.out.println("");
                    }
                    else{
                        if(opcion == 4){
                        startTime = System.nanoTime();
                        mergesort(arr.clone());
                        endTime = System.nanoTime();
                        System.out.printf("Método mergesort con %d números al azar, tiene un tiempo de: %.4f ms\n", size, (endTime - startTime) / 1000000.0);
                        System.out.println("");
                }
                
                
                        }
                        }
            
                
            }

        }
        }while (opcion!=5);
        System.out.println("EL PROGRAMA HA FINALIZADO");
    }
        

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void mergesort(int[] arr) {
        if (arr.length > 1) {
            int mid = arr.length / 2;
            int[] left = Arrays.copyOfRange(arr, 0, mid);
            int[] right = Arrays.copyOfRange(arr, mid, arr.length);
            mergesort(left);
            mergesort(right);
                    int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
        }
    }
}