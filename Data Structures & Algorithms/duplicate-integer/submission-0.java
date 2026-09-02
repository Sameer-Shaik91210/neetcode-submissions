class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet hashSet=Arrays.stream(nums)
                               .boxed()
                               .collect(Collectors.toCollection(HashSet::new));
                               return hashSet.size()<nums.length;
    }
}