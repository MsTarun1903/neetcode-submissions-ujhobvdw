class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //1. Build a frequency map.
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        //2. Build an entry list to compare the top frequency elements.
        List<Map.Entry<Integer,Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((a,b)-> b.getValue() - a.getValue());

        int res[] = new int [k];
        for(int i = 0;i<k;i++) {
            res[i] = entryList.get(i).getKey();
        }
        return res;
    }
}
