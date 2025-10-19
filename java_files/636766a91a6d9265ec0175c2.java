import java.util.*;

public class Generated_636766a91a6d9265ec0175c2 {
    private int pop(){
		int type = getStackTop();
		if(type < 0) throw new IllegalStateException("pop: no stack top");
		type = getStackTop() - 1;
		return type;
	}
}