package contral;
import com.sun.jdi.LongValue;
import java.util.Scanner;
public class Main {
    public static int convert(Long val) {

        /*if (val >= Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (val <= Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else
        return 0;*/
        return val == null ? 0
                : val >= Integer.MAX_VALUE ? Integer.MAX_VALUE
                : val <= Integer.MAX_VALUE ? Integer.MAX_VALUE
                : val.intValue();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val = scanner.nextLine();
        Long longVal = "null".equals(val) ? null : Long.parseLong(val);
        System.out.println(convert(longVal));
    }
}
