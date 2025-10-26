import java.util.*;

public class Translation970 {
    ublic override String ToString(){
    StringBuilder sb = new StringBuilder();
    sb.Append("[SXPI]\n");
    for (int i = 0;
    i < _fieldInfos.Length;
    i++){
        sb.Append(" item[").Append(i).Append("]=");
        _fieldInfos[i].ToString(sb);
        sb.Append('\n');
    }
    sb.Append("[/SXPI]\n");
    return sb.ToString();
}
}