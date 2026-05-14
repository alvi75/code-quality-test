import java.util.*;

public class Generated_636767021a6d9265ec0178b2 {
    private void pop(final String descriptor){
        switch(descriptor.charAt(0)){
            case 'Z':
                stack.pop();
                break;
            case 'B':
                stack.pop();
                break;
            case 'C':
                stack.pop();
                break;
            case 'S':
                stack.pop();
                break;
            case 'I':
                stack.pop();
                break;
            case 'F':
                stack.pop();
                break;
            case 'J':
                stack.pop2();
                break;
            case 'D':
                stack.pop2();
                break;
            case '[':
                stack.pop();
                break;
            default:
                if (descriptor.charAt(0) == 'L'){
                    stack.pop();
                }
        }
    }
}