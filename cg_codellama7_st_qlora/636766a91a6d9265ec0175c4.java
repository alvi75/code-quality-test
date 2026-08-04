import java.util.*;

public class Generated_636766a91a6d9265ec0175c4 {
    private void pop(final String descriptor){
        switch(descriptor.charAt(0)){
            case 'Z':
            case 'B':
            case 'C':
            case 'S':
            case 'I':
            case 'F':
                stack.pop();
                break;
            case 'J':
            case 'D':
                stack.pop();
                stack.pop();
                break;
            case 'L':
                stack.pop();
                break;
            case '[':
                pop(descriptor.substring(1));
                break;
            default:
                throw new IllegalArgumentException("Invalid descriptor: " + descriptor);
        }
    }
}