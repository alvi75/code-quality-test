import java.util.*;

public class Translation880 {
    public static void setupEnvironment(String[] workbookNames, ForkedEvaluator[] Evaluators) {
    WorkbookEvaluator[] wbEvals = new WorkbookEvaluator[Evaluators.length];
    for (int i = 0;
    i < wbEvals.length;
    i++) {
        wbEvals[i] = Evaluators[i].getEvaluator();
    }
    CollaboratingWorkbooksEnvironment.setup(workbookNames, wbEvals);
}
}