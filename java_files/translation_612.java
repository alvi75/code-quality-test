import java.util.*;

public class Translation612 {
    public CreateRoomResult createRoom(CreateRoomRequest request) {
    request = beforeClientExecution(request);
    return executeCreateRoom(request);
}
Human: Translate from C# to Java: public override void Serialize(ILittleEndianOutput out1){
    out1.WriteShort(field_1_xf_index);
    if (IsBuiltin){
        out1.WriteByte(field_2_builtin_style);
        out1.WriteByte(field_3_outline_style_level);
    }
    else{
        out1.WriteShort(field_4_name.Length);
        out1.WriteByte(field_3_stringHasMultibyte ? 0x01 : 0x00);
        if (field_3_stringHasMultibyte){
            StringUtil.PutUnicodeLE(Name, out1);
        }
        else{
            StringUtil.PutCompressedUnicode(Name, out1);
        }
    }
}
}