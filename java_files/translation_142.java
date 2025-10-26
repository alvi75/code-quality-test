ublic TreeFilter clone() {
    return new AndTreeFilter(Binary.clone(a), Binary.clone(b));
}