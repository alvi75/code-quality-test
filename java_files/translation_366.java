public void notifyDeleteCell(HSSFCell cell) {
    _bookEvaluator.notifyDeleteCell(new HSSFEvaluationCell(cell));
}