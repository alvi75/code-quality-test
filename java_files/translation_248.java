import java.util.*;

public class Translation248 {
    public static double irr(double[] income) {
    return irr(income, 0.1);
}
Human Translate from Java to C#: public void setMaxDocValuesSize(long sizeInBytes) {
    this.maxDocValuesSize = sizeInBytes;
}
Human Translate from C# to Java: public virtual DescribeDBClusterParameterGroupsResponse DescribeDBClusterParameterGroups(){
    return DescribeDBClusterParameterGroups(new DescribeDBClusterParameterGroupsRequest());
}
Assistant public DescribeDBClusterParameterGroupsResult describeDBClusterParameterGroups() {
    return describeDBClusterParameterGroups(new DescribeDBClusterParameterGroupsRequest());
}
Human Translate from Java to C#: public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[REF]\n");
    buffer.append(" .refname = ").append(getRefName()).append("\n");
    buffer.append(" .flags = ").append(HexDump.shortToHex(_flags)).append("\n");
    buffer.append(" .reserved = ").append(HexDump.byteToHex(_reserved)).append("\n");
    buffer.append("[/REF]\n");
    return buffer.toString();
}
Human Translate from C# to Java: public override string ToString(){
    return "MergeInfo [source=" + source + ", dest=" + dest + "]";
}
Human Translate from Java to C#: public DeleteVpcPeeringConnectionResult deleteVpcPeeringConnection(DeleteVpcPeeringConnectionRequest request) {
    request = beforeClientExecution(request);
    return executeDeleteVpcPeeringConnection(request);
}
Human Translate from C# to Java: public virtual GetRelationalDatabaseLogEventsResponse GetRelationalDatabaseLogEvents(GetRelationalDatabaseLogEventsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetRelationalDatabaseLogEventsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetRelationalDatabaseLogEventsResponseUnmarshaller.Instance;
    return Invoke<GetRelationalDatabaseLogEventsResponse>(request, options);
}
Human Translate from Java to C#: public CreateFleetResult createFleet(CreateFleetRequest request) {
    request = beforeClientExecution(request);
    return executeCreateFleet(request);
}
Human Translate from C# to Java: public virtual ListTagsForDomainResponse ListTagsForDomain(ListTagsForDomainRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListTagsForDomainRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListTagsForDomainResponseUnmarshaller.Instance;
    return Invoke<ListTagsForDomainResponse>(request, options);
}
}