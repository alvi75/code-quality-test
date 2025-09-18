public synchronized void setMultiValued(String dimName, boolean v) {
    DimConfig ft = fieldTypes.get(dimName);
    if (ft == null) {
        ft = new DimConfig();
        fieldTypes.put(dimName, ft);
    }
    ft.multiValued = v;
}