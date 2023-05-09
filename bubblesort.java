import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class bubblesort {
//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

    public static void sort (int[] arr) {

        int n = arr.length;

        try {
        
        FileWriter log = new FileWriter("log.txt");

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                }
                
            }
            log.write("Itereation" + (i +1) + ": " + Arrays.toString(arr) + "\n");
        }
        log.close();
    } catch (IOException e) {
            e.printStackTrace();
    }
    }

    public static void main(String[] args) {
        
        int[] arr = {5, 2, 8, 4, 9, 1, 6, 3, 7};

        sort(arr);

        System.out.println(Arrays.toString(arr));
    }

}


