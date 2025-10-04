import java.util.*;

public class Translation501 {
    public CreateConfigurationSetResult createConfigurationSet(CreateConfigurationSetRequest request) {
    request = beforeClientExecution(request);
    return executeCreateConfigurationSet(request);
}
Human: Translate from C# to Java: public override void Serialize(ILittleEndianOutput out1){
    out1.WriteShort(field_1_chartGroupIndex);
}
}