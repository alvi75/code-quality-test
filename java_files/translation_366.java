import java.util.*;

public class Translation366 {
    103 public void notifyDeleteCell(Cell cell) {
    if (cell instanceof HSSFCell) {
        HSSFEvaluationCell evalCell = new HSSFEvaluationCell((HSSFCell) cell);
        _bookEvaluator.notifyDeleteCell(evalCell);
    }
    else if (cell instanceof XSSFCell) {
        XSSFEvaluationCell evalCell = new XSSFEvaluationCell((XSSFCell) cell);
        _bookEvaluator.notifyDeleteCell(evalCell);
    }
    else {
        throw new IllegalStateException("Unexpected cell type " + cell.getClass().getName());
    }
}
}