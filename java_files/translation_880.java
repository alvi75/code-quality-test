import java.util.*;

public class Translation880 {
    public static void setupEnvironment(String[] workbookNames, ForkedEvaluator[] evaluators) {
    if (workbookNames == null || workbookNames.length == 0) {
        throw new IllegalArgumentException("workbookNames must not be null or empty");
    }
    if (evaluators == null || evaluators.length == 0) {
        throw new IllegalArgumentException("evaluators must not be null or empty");
    }
    if (evaluators.length != workbookNames.length) {
        throw new IllegalArgumentException("Number of evaluators must match number of workbook names");
    }
    WorkbookEvaluator[] wbEvals = new WorkbookEvaluator[evaluators.length];
    for (int i = 0;
    i < wbEvals.length;
    i++) {
        wbEvals[i] = evaluators[i].getEvaluator();
    }
    CollaboratingWorkbooksEnvironment.setup(workbookNames, wbEvals);
}
}