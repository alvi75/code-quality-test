import java.util.*;

public class Generated_6367674f1a6d9265ec017e74 {
    public String toString(){
		if (this instanceof String){return this.toString();}
		else if (this instanceof List){
			List l = (List)this;
			StringBuffer sb = new StringBuffer();
			for (int i=0;i<l.size();i++){
				sb.append(l.get(i));
				if (i!=l.size()-1){sb.append(", ");}
			}
			return sb.toString();
		}
		else return super.toString();
	}
}