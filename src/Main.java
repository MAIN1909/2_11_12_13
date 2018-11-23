import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"Joe", "Steven", "Alex", "Yaroslav", "Alexander", "Loi", "Loiment"};
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.charAt(0) == o2.charAt(0)) {
                    int i = 0;
                    int k = 0;
                    while (o1.charAt(i) == o2.charAt(i)) {
                        if (o1.charAt(i) == 0) {
                            k = -1;
                        } else if (o2.charAt(i) == 0) {
                            k = 1;
                        }
                        i++;
                        return k;
                    }

                    return o1.charAt(i) - o2.charAt(i);
                }
                return o1.charAt(0) - o2.charAt(0);
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
