import java.util.*;
public class Solution {
    public static String postfixToPrefix(String exp) {
        // Write your code here
        char ch ;
        Stack<String> st = new Stack<String>() ;  
        for(int i=0;i<exp.length()-1;i++)
        { 
            ch = exp.charAt(i) ; 
            if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
            { 
              st.push(ch+"") ;   
            }
            else
            {
                 if(!st.isEmpty())
                { 
                    String ch1 = st.peek() ; 
                    st.pop() ; 
                    String ch2="" ; 
                    if(!st.isEmpty())
                    { 
                        ch2=st.pop() ; 
                      
                    } 
                    String s1 = ch+ch2+ch1 ; 
                    st.push(s1); 
                } 
            }
        }
            if(!st.isEmpty())
            {
                return st.pop() ; 
            }
            else
            { 
                return "" ; 
            }
        }
    }
 