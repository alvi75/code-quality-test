ublic void clearConsumingCell(FormulaCellCacheEntry cce) {
    if (!consumedCells.remove(cce)) {
        throw new IllegalStateException("Specified formula cell is not consumed by this cell");
    }
}