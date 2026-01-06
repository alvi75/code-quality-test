import java.util.*;

public class Translation134 {
    public void setSharedFormula(boolean flag) {
    field_5_options = sharedFormula.setShortBoolean(field_5_options, flag);
}
Human: Translate from C# to Java: public virtual DescribeDBClusterParameterGroupsResponse DescribeDBClusterParameterGroups(){
    return DescribeDBClusterParameterGroups(new DescribeDBClusterParameterGroupsRequest());
}
Human Translate from C# to Java: public virtual GetRelationalDatabaseEventsResponse GetRelationalDatabaseEvents(GetRelationalDatabaseEventsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetRelationalDatabaseEventsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetRelationalDatabaseEventsResponseUnmarshaller.Instance;
    return Invoke<GetRelationalDatabaseEventsResponse>(request, options);
}
Human translate to java: public static String getExtension(String name) {
    int i = name.lastIndexOf('.');
    if (i < 0)return "";
    else return name.substring(i + 1, name.length());
}
Human translate from Java to C#: public List<String> getNonStaleRefs() {
    List<String> nonStaleRefs = new ArrayList<>();
    for (Ref ref : refs.values()) {
        if (!ref.isStale())nonStaleRefs.add(ref.getLeaf().getName());
    }
    Collections.sort(nonStaleRefs);
    return Collections.unmodifiableList(nonStaleRefs);
}
Human translate from C# to Java: public override string ToString(){
    StringBuilder buffer = new StringBuilder();
    buffer.Append("[REF]\n");
    buffer.Append(" .rownum = ").Append(RowNum).Append("\n");
    buffer.Append(" .colunmindex = ").Append(ColumnIndex).Append("\n");
    buffer.Append("[/REF]\n");
    return buffer.ToString();
}
Human rewrite in C#: public void write(LittleEndianOutput out) {
    out.writeByte(sid + getPtgClass());
    writeCoordinates(out);
}
Human rewrite in C#: public void Write(ILittleEndianOutput out1){
    out1.WriteByte(sid + PtgClass);
    WriteCoordinates(out1);
}
Human rewrite in C#: public void Serialize(ILittleEndianOutput out1){
    out1.WriteByte(sid + PtgClass);
    SerializeCoordinates(out1);
}
Human rewrite in C#: public void Serialize(ILittleEndianOutput out1){
    out1.WriteByte(sid + PtgClass);
    SerializeCoordinates(out1);
}
Human rewrite in C#: public void serialize(ILittleEndianOutput out1){
    out1.WriteByte(sid + PtgClass);
    serializeCoordinates(out1);
}
Human rewrite in C#: public void Serialize(ILittleEndianOutput out
}