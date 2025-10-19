import java.util.*;

public class Generated_636767041a6d9265ec017911 {
    static void register(Object value){
		if(value!=null) {
			synchronized (REGISTRY_LOCK) {
				@SuppressWarnings("unchecked")
				Class<? extends Object> clazz = (Class<? extends Object>)value.getClass();
				if(!REGISTRY.containsKey(clazz)) {
					//noinspection unchecked
					Map<Object, Object> map = new HashMap<>();
					map.put(value, value);
					REGISTRY.put(clazz, map);
				} else {
					@SuppressWarnings("unchecked")
					Map<Object, Object> map = REGISTRY.get(clazz);
					Object existingValue = map.get(value);
					if(existingValue==null) {
						map.put(value, value);
					}
				}
			}
		}
	}
}