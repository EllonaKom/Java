/**
 * Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
максимальное количество подряд идущих 1.
 */
public class Prog1 {

    public static void main(String[] args) {
        int[] array = {1,1,0,1,1,1};
        int max = getMaxOnes(array);

         
        System.out.println(max);
    }

    private static int getMaxOnes(int[] array) {
        int count = 0;
        int max = 0;
        for (int i : array) {
            if (i == 1) {
                count++;
               // if (count > max) max = count;
             max = count > max? count : max;  //тернарный оператор
               //   max = Math.max(count,max);
            } else {
                count = 0;
            }
           
        }
        return max;
    }
}