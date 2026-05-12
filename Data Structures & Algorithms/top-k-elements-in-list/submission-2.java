class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     Map<Integer,Integer> freq = new HashMap<>();
     for(int num:nums) {
        freq.put(num,freq.getOrDefault(num,0)+1);
     }   
    List<Map.Entry<Integer,Integer>> entryList = new ArrayList<>(freq.entrySet());
     entryList.sort((a,b)-> b.getValue() - a.getValue());

     int res[] = new int[k];
     for(int i = 0;i<k;i++) {
        res[i] = entryList.get(i).getKey();
     }
     return res;
    }
}
