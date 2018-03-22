/*
 * Check Permutation: Given two strings, write a method to decide if one is a permutation of the other. 
 */
package ArraysAndStrings;

/**
 *
 * @author AVINASH
 */
public class CheckPermutation {
    public static void main(String[] args){
        String s1="  ABCDEFG";
        String s2="CGFADBE          ";
        s1=s1.trim();
        s2=s2.trim();
        if(checkPermutation(s1, s2)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    static boolean checkPermutation(String a, String b){
        if(a.equals(b)){
            return true;
        }
        if(a.length()!=b.length()){
            return false;
        }
        return sort(a).equals(sort(b));
        
    }
    static String sort(String x){
        char c[]=x.toCharArray();
        java.util.Arrays.sort(c);
        return new String(c);
    }
}
