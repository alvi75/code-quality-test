public static void setupEnvironment(String[] workbookNames, ForkedEvaluator[] evaluators) {
    WorkbookEvaluator[] wbEvals = new WorkbookEvaluator[evaluatorCount];
    for (int i = 0;
    i < wbEvals.length;
    i++) {
        wbEvals[i] = evaluator(i).evaluator;
    }
    ForkedWorkbookEnvironment.setup(workbookNames, wbEvals);
}