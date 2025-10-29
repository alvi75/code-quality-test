import java.util.*;

public class Translation455 {
    0;
int srcColumnIndex = 0;
ValueEval ve = args[0];
if (ve is RefEval){
    RefEval re = (RefEval)ve;
    srcRowIndex = re.RowIndex;
    srcColumnIndex = re.ColumnIndex;
    ve = re.Ref;
}
else if (ve is AreaEval){
    AreaEval ae = (AreaEval)ve;
    srcRowIndex = ae.FirstRow;
    srcColumnIndex = ae.FirstColumn;
    ve = ae;
}
else{
    throw new ArgumentException("First argument must be a reference or area.");
}
return Evaluate(srcRowIndex, srcColumnIndex, ve, args[1], args[2]);
}
}