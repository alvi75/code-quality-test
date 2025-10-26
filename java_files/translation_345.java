ublic int[] toArray(int[] a) {
    int[] rval;
    if (a.length == limit) {
        System.Array.Copy(array, 0, a, 0, limit);
        rval = a;
    }
    else {
        rval = toArray();
    }
    return rval;
}