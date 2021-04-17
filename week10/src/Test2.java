import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * @author yufeng1900
 * @create 2021-04-11 22:32
 */
public class Test2 {
    public static void main(String[] args) {
        String str = "0100110001010001";
        Set<String> set = new HashSet<>();
        for(int i = 0;i<str.length();i++){
            for(int j = i + 1;j <= str.length();j++){
                set.add(str.substring(i,j));
            }
        }
        System.out.println(set.size());
    }
}
