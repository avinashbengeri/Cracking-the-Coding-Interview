/*
 * URLify: Write a method to replace all spaces in a string with '%20'. 
 * You may assume that the string has sufficient space at the end to hold the additional characters, 
 * and that you are given the "true" length of the string. 
 * (Note: if implementing in Java, please use a character array so that you can perform this operation in place.) 
 * EXAMPLE Input: "Mr John Smith ", 13 
 * Output: "Mr%20John%20Smith"
 */
package ArraysAndStrings;

/**
 *
 * @author AVINASH
 */
public class URLify {
    public static void main(String[] args){
        String url = "Mr John Smith             ";
        url=url.trim();
        System.out.println(replaceSpaces(url));
    }
    static String replaceSpaces(String s){
        char[] carr=s.toCharArray();
        int numSpaces=0;
        for(int i=0;i<s.length();i++){
            if(carr[i]==' '){
                numSpaces++;
            }
        }
        char[] newcarr = new char[(s.length()-numSpaces)+numSpaces*3];
        int newcarrIndex=0;
        for(int i=0;i<carr.length;i++){
            if(carr[i]==' '){
                newcarr[newcarrIndex]='%';
                newcarr[newcarrIndex+1]='2';
                newcarr[newcarrIndex+2]='0';
                newcarrIndex+=3;
            }else{
                newcarr[newcarrIndex]=carr[i];
                newcarrIndex++;
            }
        }
        return new String(newcarr);
    }
}
