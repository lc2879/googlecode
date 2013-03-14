Map<String, String> memoized;

String SegmentString(String input, Set<String> dict) {
  if (dict.contains(input)) return input;
  if (memoized.containsKey(input) {
    return memoized.get(input);
  }
  int len = input.length();
  for (int i = 1; i < len; i++) {
    String prefix = input.substring(0, i);
    if (dict.contains(prefix)) {
      String suffix = input.substring(i, len);
      String segSuffix = SegmentString(suffix, dict);
      if (segSuffix != null) {
        memoized.put(input, prefix + " " + segSuffix);
        return prefix + " " + segSuffix;
