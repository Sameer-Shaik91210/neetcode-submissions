class Solution {
    public int[] sortArray(int[] nums) {
        if(nums.length==1){
            return nums;
        }
        int mid=nums.length/2;
        int[] left=sortArray(Arrays.copyOfRange(nums,0,mid));
        int[] right=sortArray(Arrays.copyOfRange(nums,mid,nums.length));
        return merge(left,right);
    }
    public int[] merge(int[] left,int[] right){
        int[] result=new int[left.length+right.length];
        int l=0,r=0,k=0;
        while(l<left.length && r<right.length){
            if(left[l]<right[r]){
                result[k]=left[l];
                l++;
                k++;
            }else{
                result[k]=right[r];
                r++;
                k++;
            }
        }

        while(l<left.length){
            result[k++]=left[l];
            l++;
        }
        while(r<right.length){
            result[k++]=right[r];
            r++;
        }

        return result;
    }
}