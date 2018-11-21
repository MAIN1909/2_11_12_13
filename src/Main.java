import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"Alex", "Joe", "Steven"};
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(Arrays.toString(strings));
        System.out.println("==========exceptions=======");
        try {
            double d = 10 / 0;
            int[] arr = {};
            int i = arr[-1];
        } catch (ArithmeticException e) {
            System.out.println("Вы попытались поделить на 0");
//            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Вы попытались взять из массива по неккоректному индексу " + ex.getMessage());
        }
    }
}
