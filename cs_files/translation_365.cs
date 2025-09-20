using System;
using System.Collections.Generic;

public class Translation365
{
    public override string OutputToString(IObject output){
    if (!(output is IList)){
        return outputs.OutputToString((T)output);
    }
    else{
        IList<T> outputList = (IList<T>)output;
        StringBuilder b = new StringBuilder();
        b.Append('[');
        int size = outputList.Count;
        for (int i = 0;
        i < size;
        i++){
            if (i > 0){
                b.Append(", ");
            }
            b.Append(outputs.OutputToString(outputList[i]));
        }
        b.Append(']');
        return b.ToString();
    }
}
}