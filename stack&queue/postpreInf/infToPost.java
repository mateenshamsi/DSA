import java.util.*; 
public class Solution {
    static int precedence(char ch)
    { 
        switch(ch)
        { 
            case '+' :
            case '-' : 
                    return 1 ; 
            case '*': 
            case '/': 
                    return 2 ; 
            case '^': 
                    return 3 ;      
        }
        return -1 ;
    }
    public static String infixToPostfix(String exp) {
        // Write your code here
        String s ="" ; 
        char ch;
        Stack<Character> st = new Stack<Character>() ; 
        for(int i=exp.length()-1;i>=0;i--)
        { 
            ch = exp.charAt(i) ; 
            if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')||(ch>='1'&&ch<='9'))
            { 
                s=ch+s; 
            }
            else if(ch==')')
            { 
                st.push(ch) ; 
            } 
            else if(ch=='(')
            { 
                while(st.peek()!=')')
                { 
                    s=st.pop()+s ; 
                }
                st.pop();
            }
            else
            {   if(!st.isEmpty())
            {
                while((precedence(ch)<precedence(st.peek()))&&!st.isEmpty())
                { 
                    s=st.pop()+s; 

                }
                st.push(ch) ; 
            }
            }
        }
        while(!st.isEmpty())
        { 
            s=st.pop()+s;
        }
        return s ; 
        
    }
    }
