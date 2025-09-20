using System;
using System.Collections.Generic;

public class Translation759
{
    public override void Close(){
    if (outerInstance.read(p, 0, Constants.OBJECT_ID_LENGTH) != -1 || @in.GetFilePointer() != @in.GetSize()){
        throw new CorruptObjectException(MessageFormat.Format(JGitText.Get().packfileCorruptionDetected, JGitText.Get().wrongDecompressedLength));
    }
    int used2;
    if (outerInstance.sizeIncludesHeaderSize){
        used2 = p + Constants.OBJECT_ID_LENGTH;
    }
    else{
        used2 = p + Constants.OBJECT_ID_LENGTH + @in.GetFilePointer();
    }
    outerInstance.Use(p, used2);
}
}
}