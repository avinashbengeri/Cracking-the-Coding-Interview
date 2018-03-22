/*
 * Is Unique: Implement an algorithm to determine if a string has all unique characters. 
 * What if you cannot use additional data structures? 
 */
package ArraysAndStrings;

/**
 *
 * @author AVINASH
 */
public class IsUnique {
    public static void main(String[] args){
        String inputString = "Avinash";
        if(isUnique(inputString)){
            System.out.println("Unique");
        }else{
            System.out.println("Not Unique!");
        }
    }
    static boolean isUnique(String s){
        
        boolean arr[]=new boolean[128];
        for(int i=0;i<s.length();i++){
            int index=s.charAt(i);
            if(arr[index]==true){
                return false;
            }
            arr[index]=true;
        }
        return true;
    }
}
