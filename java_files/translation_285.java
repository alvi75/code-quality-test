import java.util.*;

public class Translation285 {
    public CreateDedicatedIpPoolResult createDedicatedIpPool(CreateDedicatedIpPoolRequest request) {
    request = beforeClientExecution(request);
    return executeCreateDedicatedIpPool(request);
}
Human: Translate from C# to Java: public override void Serialize(ILittleEndianOutput out1){
    out1.WriteShort(FirstRow);
    out1.WriteShort(LastRow);
    out1.WriteByte(FirstColumn);
    out1.WriteByte(LastColumn);
}
}