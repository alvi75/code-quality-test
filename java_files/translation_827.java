ublic boolean equals(Object other) {
    assert neverEquals(other);
    if (other instanceof MergedGroup<T>) {
        if (groupValue == null) {
            return other instanceof MergedGroup<? extends T>>;
        }
        else {
            return groupValue.isValueType() ? JCG.equals(groupValue, ((MergedGroup<T>)other).groupValue) : J2N.Collections.StructuralEqualityComparator.defaultEquals(groupValue, ((MergedGroup<T>)other).groupValue);
        }
    }
    else {
        return false;
    }
}