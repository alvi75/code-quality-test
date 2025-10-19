import java.util.*;

public class Generated_636766f11a6d9265ec01764f {
    public Collection<Object> values(){
		ArrayList<Object> list = new ArrayList<Object>();
		for(Method method : this.getMethods()){
			list.add(this.invokeGetMethod(method));
		}
		return Collections.unmodifiableList(list);
	}
}