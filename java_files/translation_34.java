ublic static String quote(String str) {
    StringBuilder sb = new StringBuilder();
    sb.append("\\Q");
    int apos = 0;
    int k;
    while ((k = str.indexOf("\\E", apos)) >= 0) {
        sb.append(Sharpen.StringHelper.substring(str, apos, k + 2)).append("\\\\E\\Q");
        apos = k + 2;
    }
    return sb.append(Sharpen.StringHelper.substring(str, apos)).append("\\E").toString();
}