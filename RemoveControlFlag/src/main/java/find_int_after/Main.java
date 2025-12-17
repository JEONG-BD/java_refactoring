package find_int_after;


public class Main {
    public static void main(String[] args) {
        int[] data ={
            1, 9, 0, 2, 8, 5, 6, 3, 7,
        };

        if(FindInt.find(data, 5)){
            System.out.println("Found!");
        }else {
            System.out.println("Not found...");
        }
    }
}
