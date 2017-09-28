package setting;

import java.util.Random;

/**
 *
 * @author kam123ua
 */
public class TextGenerator {
    
    final private static String stringSymbolsEnglish = "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    final private static String stringSymbolsUkrainian = "йцукенгшщзхїфівапролджєячсмитьбю0123456789ЙЦУКЕНГШЩЗХЇФІВАПРОЛДЖЄЯЧСМИТЬБЮ";
    final private static String stringSymbolsRussian = "ёйцукенгшщзхъфывапролджэячсмитьбю0123456789ЁЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЯЧСМИТЬБЮ";
    final private static String stringSymbol = "./, ";
    
    public static char generate(String language) {   
        char res = generateRandomWord(language);              
        return res;     
    }    
    
    private static char generateRandomWord(String language) {
        
        final Random random = new Random();
        char symbol;
        String str = "";
        
        if(language.equals("Ukrainian")) {
            str = stringSymbolsUkrainian + stringSymbol;
        } else if(language.equals("Russian")) {
            str = stringSymbolsRussian + stringSymbol;
        } else if(language.equals("multilingual")) {
            str = stringSymbolsEnglish + stringSymbolsUkrainian + stringSymbolsRussian + stringSymbol;
        } else {
            str = stringSymbolsEnglish + stringSymbol;
        }
        
        int n = str.length();
        symbol = str.charAt(random.nextInt(n) % n);
        return symbol;
        
    }  
    
}
