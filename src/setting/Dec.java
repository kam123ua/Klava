package setting;

import java.util.ArrayList;

/**
 *
 * @author kam123ua
 */
public class Dec {
    
    private ArrayList symbols = new ArrayList();
    
    public Dec(String str) {
        for(int i = 0; i < str.length(); i++) {
            symbols.add(str.charAt(i));
        }      
    }
    
    public void addValue(char c) {
        symbols.add(c);
    }
    
    public char getValue() {
        return (char)symbols.get(0);
    }
    
    public void deleteValue() {
        symbols.remove(0);
    }
    
    public String string() {
        String res = "";
        for(int i = 0; i < symbols.size(); i++) {
            res += (char)symbols.get(i);
        }
        return res;
    }
    
}
