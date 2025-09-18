public boolean isSaturated(FuzzySet bloomFilter, FieldInfo fieldInfo) {
    return bloomFilter.getSaturation() > 0.95;
}