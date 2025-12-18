package after;

import java.util.Random;

public class Main {
    private static final Random random  = new Random(1234);

    private static void execute(int length){
        System.out.println("======");
        int[] data = new int[length];
        for (int i = 0; i < data.length ; i++) {
            data[i] = random.nextInt(data.length);
        }

        SortSample sorter = new SortSample(data);
        System.out.println("Before" + sorter);

        sorter.sort();

        System.out.println(" After" + sorter);
    }

    public static void main(String[] args) {
        execute(10);
        execute(10);
        execute(10);
        execute(10);
    }
}
