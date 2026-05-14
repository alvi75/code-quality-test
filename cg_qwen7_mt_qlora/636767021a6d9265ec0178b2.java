import java.util.*;

public class Generated_636767021a6d9265ec0178b2 {
    /**Pop the various value according to the first character of the descriptor.*/
private void pop(final String descriptor){
		switch(descriptor.charAt(0)){
			case 'L':
				popObject();
				break;
			case '[':
				popArray(descriptor);
				break;
			default:
				popPrimitive(descriptor.charAt(0));
				break;
		}
	}
}