import java.util.*;

public class Translation880 {
    public static void setupEnvironment(String[] workbookNames, ForkedEvaluator[] evaluators) {
    WorkbookEvaluator[] wbEvals = new WorkbookEvaluator[evaluators.length];
    for(int i=0;
    i<wbEvals.length;
    i++) {
        wbEvals[i] = evaluators[i]._evaluator;
    }
    CollaboratingWorkbooksEnvironment.setup(workbookNames, wbEvals);
}
}