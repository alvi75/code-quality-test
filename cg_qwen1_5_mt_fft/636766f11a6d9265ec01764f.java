import java.util.*;

public class Generated_636766f11a6d9265ec01764f {
    public Collection<Object> values(){
		return new AbstractCollection<Object>() {
			public Iterator<Object> iterator() {
				return new Iterator<Object>() {

					private final Iterator<Entry<String, Method>> it = map.entrySet().iterator();

					public boolean hasNext() {
						return it.hasNext();
					}

					public Object next() {
						return it.next().getValue().invoke(bean);
					}

					public void remove() {
						throw new UnsupportedOperationException("remove not supported");
					}
				};
			}
			
			public int size() {
				return map.size();
			}
		};
	}
}