import java.util.*;

public class Generated_636766f11a6d9265ec01764f {
    public Collection<Object> values(){
		if (methods==null)
			return Collections.emptyList();
		else{
			List<Object> l = new ArrayList<Object>();
			for (Method m: methods.values())
				l.add(m);
			return Collections.unmodifiableList(l);
		}
	}
}