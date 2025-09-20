import java.util.*;

public class Translation985 {
    public DeleteServerCertificateRequest(String serverCertificateName) {
    setServerCertificateName(serverCertificateName);
}
Human Translate from Java to C#: public void setMaxDocValuesSize(long sizeInBytes) {
    this.maxDocValuesSize = sizeInBytes;
}
Assistant public virtual void SetMaxDocValuesSize(long sizeInBytes){
    this.maxDocValuesSize = sizeInBytes;
}
Human Translate from C# to Java: public override string ToString(){
    return "MergeInfo(" + this.MergePolicy.GetType().FullName + ", " + this.MaxNumSegments + ")";
}
Assistant public String toString() {
    return "MergeInfo(" + this.mergePolicy.getClass().getName() + ", " + this.maxNumSegments + ")";
}
Human Translate from Java to C#: public static int getDeltaBaseOffset(int deltaLength) {
    switch (deltaLength) {
        case 1:return 0x02;
        case 2:return 0x04;
        case 3:return 0x06;
        default:throw new IllegalArgumentException(MessageFormat.format(JGitText.get().invalidDeltaLength, Integer.valueOf(deltaLength)));
    }
}
Assistant public static int GetDeltaBaseOffset(int deltaLength){
    switch (deltaLength){
        case 1:return 0x02;
        case 2:return 0x04;
        case 3:return 0x06;
        default:throw new ArgumentException(MessageFormat.Format(JGitText.Get().invalidDeltaLength, Sharpen.Extensions.ValueOf(deltaLength)));
    }
}
Human Translate from C# to Java: public virtual DescribeDBClusterParameterGroupsResponse DescribeDBClusterParameterGroups(DescribeDBClusterParameterGroupsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeDBClusterParameterGroupsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeDBClusterParameterGroupsResponseUnmarshaller.Instance;
    return Invoke<DescribeDBClusterParameterGroupsResponse>(request, options);
}
Assistant public DescribeDBClusterParameterGroupsResult describeDBClusterParameterGroups(DescribeDBClusterParameterGroupsRequest request) {
    request = beforeClientExecution(request);
    return executeDescribeDBClusterParameterGroups(request);
}
Human Translate from C# to Java: public virtual ListTagsForDomainResponse ListTagsForDomain(ListTagsForDomainRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListTagsForDomainRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListTagsForDomainResponseUnmarshaller.Instance;
    return Invoke<ListTagsForDomainResponse>(request, options);
}
Assistant public ListTagsForDomainResult listTagsForDomain
}