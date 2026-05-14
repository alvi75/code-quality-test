import java.util.*;

public class Generated_6367674f1a6d9265ec017e74 {
    /**Convert a value in a vs array to a string**/
	public String toString(){
		if (this.isString())
			return this.stringValue;
		else if (this.isNumber())
			return ""+this.numberValue;
		else if (this.isBoolean())
			return ""+this.booleanValue;
		else if (this.isArray())
			return "["+this.arrayValue.toString()+"]";
		else if (this.isObject())
			return "{"+this.objectValue.toString()+"}";
		else
			return "null";
	}
}