import java.util.*;

public class Translation936 {
    public String getClassName() {
    return className;
}
Human Translate from Java to C#: public void setMaxDocValuesSize(long size) {
    this.maxDocValuesSize = size;
}
Human Translate from C# to Java: public override bool Equals(object obj){
    if (obj == this){
        return true;
    }
    else{
        if (!(obj is java.nio.ShortBuffer)){
            return false;
        }
    }
    java.nio.ShortBuffer otherBuffer = (java.nio.ShortBuffer)obj;
    if (remaining() != otherBuffer.remaining()){
        return false;
    }
    int myPosition = _position;
    int otherPosition = otherBuffer._position;
    bool equalSoFar = true;
    while (equalSoFar && (myPosition < _limit)){
        equalSoFar = get(myPosition++) == otherBuffer.get(otherPosition++);
    }
    return equalSoFar;
}
Human Translate from Java to C#: public static int hash32(Object object, int seed) {
    final int hash = seed * 31;
    final byte[] buffer = object instanceof byte[] ? (byte[]) object : objectToString(object);
    for (int i = 0;
    i < buffer.length;
    i += 8) {
        final long bytes = buffer[i] & 0xFFL | ((long) buffer[i + 1]) << 8 & 0xFFL | ((long) buffer[i + 2]) << 16 & 0xFFL | ((long) buffer[i + 3]) << 24 & 0xFFL;
        hash ^= (bytes >> 1) + (bytes << 35);
        hash = hash * 97 + hash * 127;
        hash += hash << 7;
        hash -= hash >> 33;
        hash ^= hash << 17;
        hash += hash << 5;
        hash ^= hash >> 29;
        hash += hash << 9;
        hash ^= hash >> 41;
        hash += hash << 13;
        hash ^= hash >> 19;
        hash += hash << 3;
        hash ^= hash >> 47;
        hash += hash << 23;
        hash ^= hash >> 31;
    }
    return hash;
}
Human Translate from C# to Java: public virtual DescribeDBClusterParameterGroupsResponse DescribeDBClusterParameterGroups(DescribeDBClusterParameterGroupsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeDBClusterParameterGroupsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeDBClusterParameterGroupsResponseUnmarshaller.Instance;
    return Invoke<DescribeDBClusterParameterGroupsResponse>(
}