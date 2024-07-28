import java.util.HashMap;

public class Digit {
    public HashMap countDigit(int[] array) {
        HashMap <Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            Integer count = map.getOrDefault(array[i],0);
            map.put(array[i], count + 1);
        }
        return map;

    }
}
