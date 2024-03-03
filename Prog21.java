// Задание №1
// Дано четное число N (>0) и символы c1 и c2.
// Написать метод, который вернет строку длины N, которая
// состоит из чередующихся символов c1 и c2, начиная с c1.
public class Prog21 {
    public static void main(String[] args) {
        int n = 500000;
        char c1 = 'a';
        char c2 = 'b';

        long start = System.currentTimeMillis();
        String str = alternatingCharsString(n, c1, c2);
        System.out.println(System.currentTimeMillis() - start);

        System.out.println();

        start = System.currentTimeMillis();
        String sb = alternatingCharsSb(n, c1, c2);
        System.out.println(System.currentTimeMillis() - start);
    }

    public static String alternatingCharsString(int lengthStr, char c1, char c2) {
        String str = "";
        for (int i = 0; i < lengthStr / 2; i++) {
            str += Character.toString(c1) + Character.toString(c2);
        }
        return str;
    }

    public static String alternatingCharsSb(int lengthStr, char c1, char c2) {

        StringBuilder sb = new StringBuilder(lengthStr);

        for (int i = 0; i < lengthStr / 2; i++) {
            sb.append(c1).append(c2);
        }
        return sb.toString();
    }

}