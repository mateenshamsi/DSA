import java.util.*;
public class Solution {
    public static String preToPost(String s) {
        // Write Your Code Here
        char ch ;
        Stack<String> st = new Stack<String>() ; 
        for(int i=s.length()-1;i>=0;i--)
        { 
            ch = s.charAt(i) ; 
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
                        ch2=st.peek() ; 
                        st.pop() ; 
                    } 
                    String s1 = ch1+ch2+ch ; 
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