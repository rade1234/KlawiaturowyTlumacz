import java.util.HashMap;
import java.util.Map;

public class TelephoneKeyboard {

    private final Map<Character, Character> mapping;

    public TelephoneKeyboard() {
        mapping = new HashMap<Character, Character>();
    }

    public TelephoneKeyboard addKeys(Character v, String s) {
        for (Character c : s.toCharArray()) {
            mapping.put(c, v);
        }
        return this;
    }

    public final Map<Character, Character> createMapping() {
        this.addKeys('1', "1");
        this.addKeys('2', "2ABC");
        this.addKeys('3', "3DEF");
        this.addKeys('4', "4GHI");
        this.addKeys('5', "5JKL");
        this.addKeys('6', "6MNO");
        this.addKeys('7', "7PQRS");
        this.addKeys('8', "8TUV");
        this.addKeys('9', "9WXYZ");
        this.addKeys('0', "0");
        this.addKeys('*', "*");
        this.addKeys('#', "#");
        this.addKeys('-', "-");
        return this.mapping;
    }

    public char getKey(char ch) throws Exception {
        try {
            return mapping.get(ch);
        } catch (NullPointerException e) {
            String str = " ";
            return str.charAt(0);
        }
    }

    public String parseNumber(String s, TelephoneKeyboard telephoneKeyboard) throws Exception {
        String number = "";
        for (int i = 0; i < s.length(); i++) {
            number += telephoneKeyboard.getKey(s.charAt(i));
        }
        return number;
    }
}