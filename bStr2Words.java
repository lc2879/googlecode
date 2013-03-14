
// break a string into a couple meaningful words


[1..length(w)] be a table with Boolean entries. S[i] is true if the word w[1..i] can be split. Then set S[1] = isWord(w[1]) and for i=2 to length(w) calculate

S[i] = (isWord[w[1..i] or for any j in {2..i}: S[j-1] and isWord[j..i]).

public static Boolean[] s =new Boolean [sq.length];
public static sq="Iloveyou";
public Boolean split(String sq){
	if (s[sq.length]!=null)
		return s[sq.length];
	for(int i=sq.length-1;i>0;i--)
		if(isWord(sq.subString(i))
		&&split(sq.subString(0,i))
		{
		 s[sq.length]=true;
		return true;
	}
return false;
i


bool isSegmented(string s, unordered_set<string> &dict) {
    int len = s.length();
    if(len < 1) return false;

    bool **seg = new bool*[len];
    for(int i = 0; i < len; ++i) seg[i] = new bool[len-i];

    for(int seg_len = 1; seg_len <= len; ++seg_len) {
        for(int i = 0; i <= len-seg_len; ++i) {
            seg[i][seg_len-1] = false;
            if(dict.find(s.substr(i, seg_len)) != dict.end()) {
                seg[i][seg_len-1] = true;
                continue;
            }
            for(int j = 1; j < seg_len; ++j) {
                if(seg[i][j-1] && seg[i+j][seg_len-j-1]) {
                    seg[i][seg_len-1] = true;
                    break;
                }
            }
        }
    }

    return seg[0][len-1];
}
	
