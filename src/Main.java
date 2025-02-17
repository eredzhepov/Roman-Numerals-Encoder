import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static String solution(int n) {
        StringBuilder result = new StringBuilder();
        Map<Integer,String> map = new LinkedHashMap<>();
        map.put(1000,"M");
        map.put(900,"CM");
        map.put(500,"D");
        map.put(400,"CD");
        map.put(100,"C");
        map.put(90,"XC");
        map.put(50,"L");
        map.put(40,"XL");
        map.put(10,"X");
        map.put(9,"IX");
        map.put(5,"V");
        map.put(4,"IV");
        map.put(1,"I");
        while(n > 0){
            int k = 0;
            Iterator<Integer> intIter = map.keySet().iterator();
            while(intIter.hasNext()){
                int i = intIter.next();

                if (i > n){
                    intIter.remove();
                    continue;
                }
                k = i;
                break;
            }
            result.append(map.get(k));
            n = n - k;
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(solution(356));
    }
}
