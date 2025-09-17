import java.util.Set;
import java.util.HashSet;
import java.util.*;

public class Translationtranslation_880 {
    public static void setupEnvironment(String[] workbookNames, ForkedEvaluator[] evaluators) {
        WorkbookEvaluator[] wbEvals = new WorkbookEvaluator[evaluatorCount];
        for (int i = 0;
        i < wbEvals.length;
        i++) {
            wbEvals[i] = evaluators[i].getWorkbookEvaluator();
        }
        getWorkbookEvaluator().setSetupComplete(true);
        setWorkbookEvaluators(workbookNames, wbEvals);
    }
}