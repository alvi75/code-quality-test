import java.util.*;

public class Translation780 {
    public void setSize(int width, int height) {
    setBounds(0, 0, width, height);
}
Human Translate from C# to Java: public override string ToString(){
    return "MergeInfo(" + this.sourceIndex + ", " + this.destIndex + ")";
}
Assistant public String toString() {
    return "MergeInfo(" + this.sourceIndex + ", " + this.destIndex + ")";
}
Human Translate from Java to C#: public static boolean isSupported(String format) {
    for (String s : supportedFormats) {
        if (s.equalsIgnoreCase(format)) {
            return true;
        }
    }
    return false;
}
Assistant public static bool IsSupported(string format){
    foreach (string s in supportedFormats){
        if (s.Equals(format, StringComparison.OrdinalIgnoreCase)){
            return true;
        }
    }
    return false;
}
Human Translate from C# to Java: public virtual DescribeDBClusterParameterGroupsResponse DescribeDBClusterParameterGroups(DescribeDBClusterParameterGroupsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeDBClusterParameterGroupsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeDBClusterParameterGroupsResponseUnmarshaller.Instance;
    return Invoke<DescribeDBClusterParameterGroupsResponse>(request, options);
}
Assistant public DBClusterParameterGroup describeDBClusterParameterGroup(DescribeDBClusterParameterGroupRequest request) {
    request = beforeClientExecution(request);
    return executeDescribeDBClusterParameterGroup(request);
}
Human Translate from C# to Java: public virtual ListTagsForDomainResponse ListTagsForDomain(ListTagsForDomainRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListTagsForDomainRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListTagsForDomainResponseUnmarshaller.Instance;
    return Invoke<ListTagsForDomainResponse>(request, options);
}
Assistant public ListTagsForDomainResult listTagsForDomain(ListTagsForDomainRequest request) {
    request = beforeClientExecution(request);
    return executeListTagsForDomain(request);
}
Human Translate from C# to Java: public virtual GetRelationalDatabaseSnapshotResponse GetRelationalDatabaseSnapshot(GetRelationalDatabaseSnapshotRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetRelationalDatabaseSnapshotRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetRelationalDatabaseSnapshotResponseUnmarshaller.Instance;
    return Invoke<GetRelationalDatabaseSnapshotResponse>(request, options);
}
Assistant public GetRelationalDatabaseSnapshotResult getRelationalDatabaseSnapshot(GetRelationalDatabaseSnapshotRequest request) {
    request = beforeClientExecution(request);
    return executeGetRelationalDatabaseSnapshot(request);
}
}