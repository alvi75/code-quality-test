import java.util.*;

public class Generated_636767561a6d9265ec017f63 {
    @Override
	public boolean hasNext()
	{
		if (this.visited == null)
			return this.graph.size() > 0;
		
		for(int i = 0; i < this.graph.size(); ++i){
			if(this.visited[i] == false) 
				return true;
		}
		
		return false;
	}
}