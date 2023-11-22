import java.util.*;
public class Solution {
    public static String postToInfix(String postfix) {
        // Write your code here.
        Stack<String> st = new Stack<String>() ;
        char ch ;
        String ch2,ch1 ;   
        for(int i=0;i<postfix.length();i++)
        {   ch=postfix.charAt(i) ; 
            if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
            { 
                st.push(ch+"") ; 
            }
            else{ 
                    if(!st.isEmpty())
                    {
                    ch2 = st.peek() ;
                    st.pop() ; 
                    ch1=st.peek() ;
                    st.pop(); 
                    String s1 = "("+ch1+ch+ch2+")" ;  
                    st.push(s1) ; 
                    } 

            }
        }
     return st.peek() ; 
    }
}