import java.util.*;

public class Main {
    public static String solution(int n) {
        StringBuilder result = new StringBuilder();
        List<Integer> numbers = new ArrayList<>();
        List<String> roman = new ArrayList<>();
        numbers.add(1000);
        numbers.add(900);
        numbers.add(500);
        numbers.add(400);
        numbers.add(100);
        numbers.add(90);
        numbers.add(50);
        numbers.add(40);
        numbers.add(10);
        numbers.add(9);
        numbers.add(5);
        numbers.add(4);
        numbers.add(1);
        roman.add("M");
        roman.add("CM");
        roman.add("D");
        roman.add("CD");
        roman.add("C");
        roman.add("XC");
        roman.add("L");
        roman.add("XL");
        roman.add("X");
        roman.add("IX");
        roman.add("V");
        roman.add("IV");
        roman.add("I");
        while(n > 0){
            for(int i = 0; i < numbers.size(); i++){
                if (numbers.get(i) > n){
                    continue;
                }
                result.append(roman.get(i));
                n = n - numbers.get(i);
                break;
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(solution(2340));
    }
}
