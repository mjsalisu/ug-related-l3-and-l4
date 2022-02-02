
/**
 * @author jamil
 */
public class SwitchTest {

    public static void main(String agrs[]) {
        int month = 10;
        String name;
        switch (month) {
            case 1:
                name = "January";
                break;
            case 2:
                name = "February";
                break;
            default:
                name = "Not within range";
                break;
        }
        System.out.println(name);
    }
}
