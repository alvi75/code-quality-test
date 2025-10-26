ublic override String toString(){
    StringBuilder sb = new StringBuilder();
    sb.Append(GetType().Name).Append(" [ARRAY]\n");
    sb.Append(" range=").Append(Range.ToString()).Append("\n");
    sb.Append(" options=").Append(HexDump.ShortToHex(_options)).Append("\n");
    sb.Append(" notUsed=").Append(HexDump.IntToHex(_field3notUsed)).Append("\n");
    sb.Append(" formula:").Append("\n");
    Ptg[] ptgs = _formula.Tokens;
    for (int i = 0;
    i < ptgs.Length;
    i++){
        Ptg ptg = ptgs[i];
        sb.Append(ptg.ToString()).Append(ptg.RVAType).Append("\n");
    }
    sb.Append("]");
    return sb.ToString();
}