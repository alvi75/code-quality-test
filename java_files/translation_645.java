ublic override int Stem(char[] s, int len){
    int numVowels_Renamed = NumVowels(s, len);
    for (int i = 0;
    i < affixes.Length;
    i++){
        Affix affix = affixes[i];
        if (numVowels_Renamed > affix.vc && len >= affix.affix.Length + 3 && StemmerUtil.EndsWith(s, len, affix.affix)){
            len -= affix.affix.Length;
            return affix.palatalizes ? Unpalatalize(s, len) : len;
        }
    }
    return len;
}