import java.util.*;

public class Translation880 {
    public static void setupEnvironment(String[] workbookNames, ForkedEvaluator[] evaluators) {
    if (workbookNames == null || evaluators == null || workbookNames.length != evaluators.length) {
        throw new IllegalArgumentException("Invalid input: workbookNames and evaluators must be non-null and of the same length.");
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