import java.util.HashSet;
import java.util.Set;

public class findDuplicate {

    public static int findDup(int num[]) {
        Set<Integer> repeat = new HashSet<Integer>();
        for (int n : num) {
            if (repeat.contains(n))
                return n;
            repeat.add(n);
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 34, 4, 4, 5, 6, 7, 8, 8, 8, 12, 12 };
        findDup(arr);
        
    }
}