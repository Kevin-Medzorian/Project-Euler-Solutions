

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Kevin
 */
public class euler024 {
    
    private static List nums = new ArrayList();
    
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5 ,6 ,7, 8, 9};

        Collections.addAll(nums, numbers);

        for (int i = 0; i < 362880-1; i++)
        {
            for (int j = nums.size() - 1; j >= 0; j--)
            {
                if (j != nums.size() - 1 && (Integer) nums.get(j) < (Integer) nums.get(j + 1))
                {
                    Collections.swap(nums, j, j + 1);
                    if (j + 1 != nums.size() - 1) 
                    {
                        reverseAt(nums, j);
                    }

                    break;
                }
            }

        }

        for (int i = 0; i < nums.size(); i++) {
            System.out.print((Integer) nums.get(i));
        }

        System.out.println();

    }

    public static void reverseAt(List<Object> num, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < index; i++) {
            list.add((Integer) num.get(i));
        }

        num.removeAll(list);

        Collections.reverse(num);
        num.addAll(0, list);
    }

}
