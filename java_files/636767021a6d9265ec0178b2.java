import java.util.*;

public class Generated_636767021a6d9265ec0178b2 {
    private void pop(final String descriptor){
		if (descriptor.length() == 0) return;
		
		char c = descriptor.charAt(0);
		switch(c){
			case 'B':
				popByte();
				break;
			case 'C':
				popChar();
				break;
			case 'D':
				popDouble();
				break;
			case 'F':
				popFloat();
				break;
			case 'I':
				popInt();
				break;
			case 'J':
				popLong();
				break;
			case 'S':
				popShort();
				break;
			case 'Z':
				popBoolean();
				break;
			case 'V':
				popVoid();
				break;
			default:
				throw new IllegalArgumentException("Unsupported type: "+c);
		}
	}
}