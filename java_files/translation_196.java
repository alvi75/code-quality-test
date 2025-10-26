ublic void setMultiValued(String dimName, boolean v) {
    synchronized(this) {
        if (!fieldTypes.containsKey(dimName)) {
            fieldTypes.put(dimName, new DimConfig());
        }
        fieldTypes.get(dimName).isMultiValued = v;
    }
}