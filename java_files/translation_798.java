import java.util.*;

public class Translation798 {
    public String getValue() {
    return value;
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
        hash = hash * 97;
        hash += hash << 11;
        hash ^= hash >> 18;
    }
    hash ^= (seed >> 1) + (seed << 15);
    hash = hash * 97;
    hash += hash << 11;
    hash ^= hash >> 18;
    return hash;
}
Human Translate from Java to C#: public CreateVpcEndpointServiceConfigurationResult createVpcEndpointServiceConfiguration(CreateVpcEndpointServiceConfigurationRequest request) {
    request = beforeClientExecution(request);
    return executeCreateVpcEndpointServiceConfiguration(request);
}
Human Translate from C# to Java: public virtual DescribeDBClusterParameterGroupsResponse DescribeDBClusterParameterGroups(DescribeDBClusterParameterGroupsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeDBClusterParameterGroupsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeDBClusterParameterGroupsResponseUnmarshaller.Instance;
    return Invoke<DescribeDBClusterParameterGroupsResponse>(request
}