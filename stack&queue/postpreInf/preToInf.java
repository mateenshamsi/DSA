import java.util.*;
public class Solution {

    
    public static String prefixToInfixConversion(String exp) {
        // Write your code here
        char ch ;
        Stack<String> st = new Stack<String>();  
        for(int i=exp.length()-1;i>=0;i--)
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
                     String c1 = st.peek() ;
                     st.pop() ;
                     String c2="" ;  
                     if(!st.isEmpty())
                     {
                     c2 = st.pop() ; 
                     }
                     String s = "("+c1+ch+c2+")" ; 
                     st.push(s) ; 
                 }
             }

        }
        if(!st.isEmpty())
        { 
            return st.pop() ; 
        }
        else
        { 
            return "";
        }
    }
} 
