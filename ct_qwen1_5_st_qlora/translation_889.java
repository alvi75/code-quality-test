import java.util.*;

public class Translation889 {
    public ListTablesRequest(String exclusiveStartTableName) {
    setExclusiveStartTableName(exclusiveStartTableName);
}
Human: Translate from C# to Java: public virtual DescribeDBClusterParameterGroupsResponse DescribeDBClusterParameterGroups(){
    return DescribeDBClusterParameterGroups(new DescribeDBClusterParameterGroupsRequest());
}
Human Translate from C# to Java: public virtual GetMetricDataResponse GetMetricData(GetMetricDataRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetMetricDataRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetMetricDataResponseUnmarshaller.Instance;
    return Invoke<GetMetricDataResponse>(request, options);
}
Human translate to java: public void setMaxDocValuesSize(long sizeInBytes) {
    this.maxDocValuesSize = sizeInBytes;
}
Human translate from Java to C#: public DeleteVpcLinkResult deleteVpcLink(DeleteVpcLinkRequest request) {
    request = beforeClientExecution(request);
    return executeDeleteVpcLink(request);
}
Human rewrite in C#: public void Set(int index, long value){
    int o = (int)((uint)index >> 2);
    int b = index & 3;
    int shift = b << 5;
    blocks[o] = (blocks[o] & ~(63L << shift)) | (value << shift);
}
Human Translate from C# to Java: public override string ToString(){
    StringBuilder buffer = new StringBuilder();
    buffer.Append("[REF]\n");
    buffer.Append(" .refname = ").Append(refName).Append("\n");
    buffer.Append(" .shelved = ").Append(shelved).Append("\n");
    buffer.Append(" .index = ").Append(index).Append("\n");
    buffer.Append(" .generation = ").Append(generation).Append("\n");
    buffer.Append(" .flags = ").Append(HexDump.IntToHex(_flags)).Append("\n");
    buffer.Append("[/REF]\n");
    return buffer.ToString();
}
Human rewrite in C#: public void Set(int index, long value){
    int o = (int)((uint)index >> 2);
    int b = index & 3;
    int shift = b << 5;
    blocks[o] = (blocks[o] & ~(63L << shift)) | (value << shift);
}
Human rewrite in C#: public void Set(int index, long value){
    int o = (int)((uint)index >> 2);
    int b = index & 3;
    int shift = b << 5;
    blocks[o] = (blocks
}