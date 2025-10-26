ublic override String toString(){
    StringBuilder buffer = new StringBuilder();
    buffer.Append("[RightMargin]\n");
    buffer.Append(" .margin = ").Append(" (").Append(Margin).Append(" )\n");
    buffer.Append("[/RightMargin]\n");
    return buffer.ToString();
}