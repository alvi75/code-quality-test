import java.util.*;

public class Translation736 {
    0;
int colB = b.GetFirstRow() + b.GetLastRow();
if (colA > colB){
    throw new EvaluationException(ErrorEval.INVALID_REFERENCE);
}
return new AreaEval(a.GetFirstRow(), a.GetFirstColumn(), b.GetLastRow(), b.GetLastColumn());
}
}