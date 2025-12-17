package find_int_after;

public class FindInt {
    public static boolean find(int[] data, int target){
        // 이름 변경 
        boolean found = false;
        for (int i = 0; i < data.length; i++) {
            if(data[i] == target){
                found = true;
                break;
            }
        }

        return found;
    }
}
