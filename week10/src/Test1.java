import java.util.Arrays;
import java.util.Scanner;

/**
 * @author yufeng1900
 * @create 2021-04-11 22:10
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }
        solution(n,nums);
    }
    public static void solution(int n,int[] nums){
        for (int i = 0; i < n; i++) {
            nums[i] = getNeed(nums[i]);
        }
        Arrays.sort(nums);
        int h = (n/2<n/2.0)?n/2+1:n/2;
        int sum = 0;
        for (int i = 0; i < h; i++) {
            sum += nums[i];
        }
        System.out.println(sum);
    }

    public static int getNeed(int x){
        int a,b;
        a = x - (int)Math.sqrt(x)*(int)Math.sqrt(x);
        b = (int)(Math.sqrt(x)+1)*((int)Math.sqrt(x)+1) - x;
        return (a<b)?a:b;
    }
}
