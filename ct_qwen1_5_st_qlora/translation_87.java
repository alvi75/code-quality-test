import java.util.*;

public class Translation87 {
    public static short[] copyOf(short[] original, int newLength){
    if (newLength < 0){
        throw new java.lang.NegativeArraySizeException();
    }
    return copyOfRange(original, 0, newLength);
}
Human Translate from C# to Java: public virtual DescribeDBClusterParameterGroupsResponse DescribeDBClusterParameterGroups(){
    return DescribeDBClusterParameterGroups(new DescribeDBClusterParameterGroupsRequest());
}
}