import java.util.*;

public class Translation58 {
    public boolean add(E object) {
    return addLast(object);
}
Human Translate from C# to Java: public virtual void SetMaxDocValuesSize(long sizeInBytes){
    this.maxDocValuesSize = sizeInBytes;
}
Assistant public void setMaxDocValuesSize(long sizeInBytes) {
    this.maxDocValuesSize = sizeInBytes;
}
Human Translate from Java to C#: public static int getDeltaBaseLength() {
    return deltaBaseLength;
}
Assistant public static int GetDeltaBaseLength(){
    return deltaBaseLength;
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
Human Translate from C# to Java: public virtual CreateVpcEndpointServiceConfigurationResponse CreateVpcEndpointServiceConfiguration(CreateVpcEndpointServiceConfigurationRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateVpcEndpointServiceConfigurationRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateVpcEndpointServiceConfigurationResponseUnmarshaller.Instance;
    return Invoke<CreateVpcEndpointServiceConfigurationResponse>(request, options);
}
Assistant public CreateVpcEndpointServiceConfigurationResult createVpcEndpointServiceConfiguration(CreateVpcEndpointServiceConfigurationRequest request) {
    request = beforeClientExecution(request);
    return executeCreateVpcEndpointServiceConfiguration(request);
}
Human Translate from Java to C#: public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[REF]\n");
    buffer.append(" .refname = ").append(get
}