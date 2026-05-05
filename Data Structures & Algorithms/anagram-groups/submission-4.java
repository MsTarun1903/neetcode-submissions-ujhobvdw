class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(int i = 0;i<strs.length;i++) {
            char words[] = strs[i].toCharArray();
            Arrays.sort(words);
            String sorted = new String(words); 
            if(!map.containsKey(sorted)) {
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
