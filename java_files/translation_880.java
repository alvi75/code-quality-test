import java.util.*;

public class Translationtranslation_880 {
    public static void setupEnvironment(String[] workbookNames, ForkedEvaluator[] evaluators) {
        if (workbookNames == null && evaluators == null) {
            throw new IllegalArgumentException("Arguments cannot be both null.");
        }
        else if (workbookNames == null || evaluators == null) {
            throw new IllegalArgumentException("Arguments cannot be both non-null.");
        }
        WorkbookEvaluator[] wbEvals = new WorkbookEvaluator[evaluators.length];
        for (int i = 0;
        i < wbEvals.length;
        i++) {
            wbEvals[i] = evaluators[i].getEvaluator();
        }
        CollaboratingWorkbook.setWorkbookAndEvaluator(workbookNames, wbEvals);
    }
}