import java.util.*;

public class Translation880 {
    1 public static void setupEnvironment(String[] workbookNames, ForkedEvaluator[] evaluators) {
    2 WorkbookEvaluator[] wbEvals = new WorkbookEvaluator[evaluators.length];
    3 for (int i = 0;
    i < wbEvals.length;
    i++) {
        4 wbEvals[i] = evaluators[i].getEvaluator();
        5 }
        6 CollaboratingWorkbooksEnvironment.setup(workbookNames, wbEvals);
    }
}