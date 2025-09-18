public static PredictionContext fromRuleContext(RuleContext _atnRuleContext, ATNState _state,PredictionContext _parent){
    if (_parent == null){
        _parent = PredictionContext.EMPTY;
    }
    return new SingletonPredictionContext(_state, _parent);
}