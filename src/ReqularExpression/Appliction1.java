package ReqularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Appliction1 {
    public static void main(String[] args) {
        //1
        Pattern p = Pattern.compile(".s");
        Matcher m = p.matcher("as");
        boolean b1 = m.matches();
        System.out.println(b1);
        //2
        boolean b2 = Pattern.compile(".s").matcher("as").matches();
        System.out.println(b2);
        //3
        boolean b3 = Pattern.matches(".s", "as");

        System.out.println(b3);
        System.out.println(Pattern.matches(".s","as"));
        System.out.println(Pattern.matches(".s", "mk"));
        System.out.println(Pattern.matches(".s","mst"));
        System.out.println(Pattern.matches(".s","amms"));
        System.out.println(Pattern.matches("..s","mas"));
        // Character Class
        System.out.println("--------------");
        System.out.println(Pattern.matches("[amn]","abcd"));
        System.out.println(Pattern.matches("[amn]","a"));
        System.out.println(Pattern.matches("[amn]","amn"));

        // Regex Quantifiers
        System.out.println("------------");
        System.out.println(Pattern.matches("[amn]?","a"));
        System.out.println(Pattern.matches("[amn]?","amn"));
        System.out.println(Pattern.matches("[amn]?","aa"));
        System.out.println("------------");
        System.out.println(Pattern.matches("[amn]+","a"));
        System.out.println(Pattern.matches("[amn]+","amn"));
        System.out.println(Pattern.matches("[amn]+","aammnn"));
        System.out.println("------------");
        System.out.println(Pattern.matches("[amn]*",""));
        System.out.println(Pattern.matches("[amn]*","a"));
        System.out.println(Pattern.matches("[amn]*","aammnn"));
        // MetaCharacter
        System.out.println("------------");
        System.out.println(Pattern.matches("\\d","1"));
        System.out.println(Pattern.matches("\\d*","123"));
        System.out.println(Pattern.matches("\\d","123abc"));
        System.out.println(Pattern.matches("\\d","abc"));
        System.out.println("------------");
        System.out.println(Pattern.matches("\\D","d"));
        System.out.println(Pattern.matches("\\D","123"));
        System.out.println(Pattern.matches("\\D","DM"));
        System.out.println(Pattern.matches("\\D","1"));
        System.out.println(Pattern.matches("\\D*","abc"));
        System.out.println("by character classes and quantifiers....");
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","arun45"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","arunkkk45"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","JAVA45"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","arun$45"));
        System.out.println("----------");
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}","9954321643"));
        System.out.println(Pattern.matches("[789][0-9]{9}","9954675321"));
        System.out.println(Pattern.matches("[789][0-9]{9}","99546753231"));
        System.out.println(Pattern.matches("[789][0-9]{9}","6954675321"));
        System.out.println(Pattern.matches("[789][0-9]{9}","8954675321"));
        System.out.println("by metacharacter....");
        System.out.println(Pattern.matches("[789]{1}\\d{9}","8789543784"));
        System.out.println(Pattern.matches("[789]{1}\\d{9}","3987443627"));






    }
}
