import java.util.*;

public class Translation420 {
    public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[FEATURE HEADER]\n");
    buffer.append(" .feature_id = ").append(Integer.toHexString(getFeatureID())).append("\n");
    buffer.append(" .feature_name = ").append(getFeatureName()).append("\n");
    buffer.append(" .feature_type = ").append(Integer.toHexString(getFeatureType())).append("\n");
    buffer.append(" .feature_flags = ").append(Integer.toHexString(getFeatureFlags())).append("\n");
    buffer.append(" .feature_size = ").append(Integer.toHexString(getFeatureSize())).append("\n");
    buffer.append(" .feature_offset = ").append(Integer.toHexString(getFeatureOffset())).append("\n");
    buffer.append("[/FEATURE HEADER]\n");
    return buffer.toString();
}
}