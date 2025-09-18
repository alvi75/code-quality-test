public void clearConsumingCell(FormulaCellCacheEntry cce) {
    if (!_consumingCells.remove(cce)) {
        throw new IllegalStateException("Specified formula cell is not consumed by this cell");
    }
}