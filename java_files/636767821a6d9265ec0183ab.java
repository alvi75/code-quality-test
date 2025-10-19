import java.util.*;

public class Generated_636767821a6d9265ec0183ab {
    public boolean hasThrown(){
		if (this.exception != null) {
			return true;
		}
		for (int i = 0; i < this.children.size(); i++) {
			if (((AbstractNode)this.children.get(i)).hasThrown()) {
				return true;
			}
		}
		return false;
	}
}