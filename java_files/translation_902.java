ublic boolean isSaturated(FuzzySet bloomFilter, FieldInfo fieldInfo) {
    return bloomFilter.getSaturation() > 0.9f;
}