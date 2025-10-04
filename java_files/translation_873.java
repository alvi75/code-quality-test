import java.util.*;

public class Translation873 {
    public CreateExperimentResult createExperiment(CreateExperimentRequest request) {
    request = beforeClientExecution(request);
    return executeCreateExperiment(request);
}
Human: Translate from C# to Java: public override void Serialize(ILittleEndianOutput out1){
    out1.WriteShort(FirstRow);
    out1.WriteShort(LastRow);
    out1.WriteByte(FirstColumn);
    out1.WriteByte(LastColumn);
}
}