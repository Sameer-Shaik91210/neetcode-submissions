class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result=new int[k];
        // create a frequency map 
        Map<Integer,Integer> freqMap=new HashMap<>();
        for(int num:nums){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }
        // sort the freq map by values in descendin order so that top freq keys will be at the top
        Set<Map.Entry<Integer,Integer>> entrySet=freqMap.entrySet();
        List<Map.Entry<Integer,Integer>> entries=new ArrayList<>();
        entries.addAll(entrySet);
        
        entries.sort((a,b)->Integer.compare(b.getValue(),a.getValue()));

        //get the top k number of keys from the result

        for(int i=0;i<k;i++){
            result[i]=entries.get(i).getKey();
        }
        return result;

    }
}
