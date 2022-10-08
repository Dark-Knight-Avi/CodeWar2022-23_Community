
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char c[] = s.toCharArray();
        if(s.length()<2)
        {
            return false;
        }
        for(int i=0;i<c.length;i++)
        {
            if(c[i]=='(' || c[i]=='[' || c[i]=='{')
            {
                stack.push(c[i]);
            }
            else 
            {
                if(stack.size()==0)
                {
                    return false;
                }
                else
                {
                    if(c[i]==')' && stack.pop()!='(')
                    {
                        return false;
                    }
                    if(c[i]==']' && stack.pop()!='[')
                    {
                        return false;
                    }
                    if(c[i]=='}' && stack.pop()!='{')
                    {
                        return false;
                    }
                }
            }
        }
        if(stack.size()==0)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}
