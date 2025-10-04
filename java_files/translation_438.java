import java.util.*;

public class Translation438 {
    public long ramBytesUsed() {
    long sizeInByes = ((termOffsets!=null)? termOffsets.ramBytesUsed() : 0);
    for(FieldIndexData entry : fields.values()) {
        sizeInByes += entry.ramBytesUsed();
    }
    return sizeInByes;
}
Create a new class called "FieldInfo" with the following properties: public FieldInfo(string fieldName, int indexVersion, FieldType fieldType){
    if (fieldName == null){
        throw new System.ArgumentNullException("fieldName", "cannot be null");
    }
    if (indexVersion < 2){
        throw new System.ArgumentException("Index version must be >= 2");
    }
    this.fieldName = fieldName;
    this.indexVersion = indexVersion;
    this.m_type = fieldType;
}
}