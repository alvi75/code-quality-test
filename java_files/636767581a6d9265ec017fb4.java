import java.util.*;

public class Generated_636767581a6d9265ec017fb4 {
    private List<Integer> computeUpperBounds(List<K> keys){
		List<Integer> result = new ArrayList<>();
		for(K k:keys){
			int minUpperBound = Integer.MAX_VALUE;
			if(k instanceof Integer)
				minUpperBound = (Integer)k;
			else if(k instanceof Long)
				minUpperBound = ((Long)k).intValue();
			else if(k instanceof Double)
				minUpperBound = ((Double)k).intValue();
			else if(k instanceof Float)
				minUpperBound = ((Float)k).intValue();
			else if(k instanceof Short)
				minUpperBound = ((Short)k).intValue();
			else if(k instanceof Byte)
				minUpperBound = ((Byte)k).intValue();
			else if(k instanceof Character)
				minUpperBound = ((Character)k).charValue();
			else if(k instanceof Boolean)
				minUpperBound = ((Boolean)k).booleanValue()?1:0;
			else
				throw new RuntimeException("Unsupported type "+k.getClass().getName());
			
			result.add(minUpperBound);
		}
		
		return result;
	}
}