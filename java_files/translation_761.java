public void construct(CellValueRecordInterface[] recs, RecordStream rs, SharedValueManager sfm) {
    for(int i=0;
    i<recs.length;
    i++) {
        CellValueRecordInterface cell = recs[i];
        if(cell instanceof FormulaRecordAggregate) {
            FormulaRecordAggregate fra = (FormulaRecordAggregate)cell;
            String formula = fra.getFormula();
            RecordBase params = fra.getParameters();
            if (params instanceof FormulaRecord) {
                FormulaRecordAggregate subCell = (FormulaRecordAggregate)params;
                String subFormula = subCell.getFormula();
                if (subFormula != null) {
                    insertCell(new FormulaRecordAggregate(subFormula, sfm));
                }
            }
        }
    }
}