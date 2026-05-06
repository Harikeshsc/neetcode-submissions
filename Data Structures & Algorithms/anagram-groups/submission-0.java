class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         if (strs == null || strs.length == 0) return new ArrayList<>();
         Map<String, List<String>> map = new HashMap<>();
         
         for (String str : strs) {
             char[] chars = str.toCharArray();
             Arrays.sort(chars);
             String sortedStr = new String(chars);
             
             // If key not present, create new list, then add original string
             map.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
         }
         
         return new ArrayList<>(map.values());
    }
}
