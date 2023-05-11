
// Пусть дан произвольный список целых чисел. Удалить из него чётные числа.
// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class urok_2_hw_2 {

    public static void remove_number(List<Integer> int_List) {
        if (int_List == null) {
            return;
        }

        for (int i = 0; i < int_List.size(); i++) {
            if (int_List.get(i)%2 == 0) {
                int_List.remove(int_List.get(i));
            }

        }

    }

    public static void main(String[] args) {
        
        List<Integer> user_List = new ArrayList<>( Arrays.asList(22,2,5,6,9,9,7,5,2));

        remove_number(user_List);
        System.out.println(user_List);

    }
    
}
