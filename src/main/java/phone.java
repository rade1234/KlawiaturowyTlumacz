import java.util.HashMap;
import java.util.Map;

public class phone {

    public static void init(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Proper usage:");
            System.out.println("java phone number");
        } else {
            String arg0 = args[0].toUpperCase();

            TelephoneKeyboard telephoneKeyboard = new TelephoneKeyboard();
            telephoneKeyboard.createMapping();
            System.out.println(telephoneKeyboard.parseNumber(arg0, telephoneKeyboard));
        }
    }

    public static void main(String[] args) throws Exception {
        init(args);
    }
}