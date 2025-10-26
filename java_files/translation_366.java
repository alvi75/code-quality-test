ublic void notifyDeleteCell(Cell cell) {
    HSSFEvaluationCell evaluationCell = new HSSFEvaluationCell(cell);
    _bookEvaluator.notifyDeleteCell(evaluationCell);
}