package Logic;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextSystem {

    private static final Pattern bound = Pattern.compile("\\b(\\w)");
    
    public String toUpper(String t) {
        return t.toUpperCase();
    }

    public String toLower(String t) {
        return t.toLowerCase();
    }
    
    public String capitalizeEveryWord(String t) {
        t = t.toLowerCase();
        StringBuffer sb = new StringBuffer(t.length());
        Matcher mat = bound.matcher(t);
        while (mat.find()) {
            mat.appendReplacement(sb, mat.group().toUpperCase());
        }
        mat.appendTail(sb);
        return sb.toString();
    }

    public String toSentenceCase(String t){
        return t.substring(0, 1).toUpperCase() + t.substring(1).toLowerCase();
    }
    
    public String removeBlanks(String t){
        return t.replace(" ","");
    }
    
    public String blankToDash(String t){
        return t.replace(" ","-");
    }
    
    public String blankToUnderscore(String t){
        return t.replace(" ","_");
    }
    
    public String removeMultiSpace(String t){
        return t.trim().replaceAll(" +", " ");
    }

    public String replaceWith(String text, String target, String replacement){
        return text.replace(target,replacement);
    }
    
    public void toClipboard(String t){
        StringSelection stringSelection = new StringSelection(t);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }
    
    
    
    
}
