// 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет
// “перевернутый” список.


    import java.util.ArrayDeque;

    public class Dom41 {
    
        public static ArrayDeque<Integer> getReversDeque(int count) {
            ArrayDeque<Integer> deque = new ArrayDeque<>();
            ArrayDeque<Integer> reverseDeque = new ArrayDeque<>();
    
            for (int i = 0; i < count; i++) {
                int rand = (int) (Math.random() * (100 - 1));
                deque.addFirst(rand);
            }
            System.out.println(deque);
    
            for (int i = 0; i < count; i++) {
                reverseDeque.addFirst(deque.getFirst());
                deque.removeFirst();
            }
            return reverseDeque;
        }
    
        public static void main(String[] args) {
    
            System.out.println(getReversDeque(10));
    
        }
    
    }
