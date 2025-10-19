import java.util.*;

public class Generated_636766a91a6d9265ec0175c4 {
    private void pop(final String descriptor){
        switch (descriptor.charAt(0)){
            case 'I':
                stack.popInt();
                break;
            case 'B':
                stack.popByte();
                break;
            case 'C':
                stack.popChar();
                break;
            case 'S':
                stack.popShort();
                break;
            case 'F':
                stack.popFloat();
                break;
            case 'J':
                stack.popLong();
                break;
            case 'D':
                stack.popDouble();
                break;
            case '[':
                stack.popArray();
                break;
            default:
                stack.popRef();
                break;
        }
    }
}