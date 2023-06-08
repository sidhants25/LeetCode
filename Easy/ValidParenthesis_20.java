import java.util.LinkedList;

public class ValidParenthesis_20 {

    //20. Valid Paranthesis
    public boolean isValid(String s) {

        LinkedList<Character> stack = new LinkedList<>();

        for (int i = 0; i<s.length(); i++){
            if (s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='('){
                stack.addFirst(s.charAt(i));
            }
            else if (stack.isEmpty()){
                return false;
            }
            else{
                char closed = s.charAt(i);
                char open = stack.removeFirst();
                switch (closed){
                    case '}': if(open!='{'){
                        return false;
                    } break;
                    case ']': if(open!='['){
                        return false;
                    } break;
                    case ')': if(open!='('){
                        return false;
                    } break;
                }
            }
        }

        return stack.isEmpty();

    }
}