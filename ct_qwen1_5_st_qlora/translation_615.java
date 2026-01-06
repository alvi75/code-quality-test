import java.util.*;

public class Translation615 {
    public virtual void SetMaxDocValuesSize(long sizeInBytes){
    this.maxDocValuesSize = sizeInBytes;
}
Human: Translate from C# to Java: public override bool Equals(object obj){
    if (obj == this){
        return true;
    }
    else{
        if (!(obj is java.util.MapClass.Entry<K, V>)){
            return false;
        }
    }
    java.util.MapClass.Entry<object, object> e = (java.util.MapClass.Entry<object, object>)obj;
    object key = e.getKey();
    object value = e.getValue();
    return (key != null && key.Equals(this.key))&& (value != null && value.Equals(this.value));
}
}