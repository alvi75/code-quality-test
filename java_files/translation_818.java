ublic void preSerialize() {
    if (records.getTabpos() > 0) {
        TabIdRecord tir = (TabIdRecord)records.get((records.getTabpos()));
        if (tir._tabids.length < boundsheets.size()) {
            fixTabIdRecord();
        }
    }
}