import java.util.*;

public class Generated_636766ff1a6d9265ec017851 {
    protected int findByte(byte value,int pos){
		int i;
		
		for(i=0;i<length();i++){
			if(buffer[i]==value)break;
		}
		
		return (i==length())?-1:i;
	}
}