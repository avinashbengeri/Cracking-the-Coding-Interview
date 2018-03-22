/*
 * Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome. 
 * A palindrome is a word or phrase that is the same forwards and backwards. 
 * A permutation is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words. 
 * EXAMPLE 
 * Input: Tact Coa 
 * Output: True (permutations: "taco cat'; "atco eta·; etc.) 
 */
package ArraysAndStrings;
import java.util.HashMap;
/**
 *
 * @author AVINASH
 */
public class PalindromePermutation {
    public static void main(String []args){
        String phrase="Taco Coa";
        phrase=phrase.trim().toLowerCase();
        if(checkPermutationPalindrome(phrase)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    
    static boolean checkPermutationPalindrome(String phrase){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<phrase.length();i++){
            if(phrase.charAt(i)==' '){
            }else if(map.containsKey(phrase.charAt(i))){
                int val=map.get(phrase.charAt(i));
                map.put(phrase.charAt(i),++val);
            }else{
                map.put(phrase.charAt(i), 1);
            }
        }
        boolean flag=true;
        for(Character c:map.keySet()){
            //System.out.println(c+" "+map.get(c));
            if(map.get(c)%2!=0){
                if(flag==false){
                    return false;
                }else{
                    flag=false;
                }
            }
        }
        return true;
    }
    
}
