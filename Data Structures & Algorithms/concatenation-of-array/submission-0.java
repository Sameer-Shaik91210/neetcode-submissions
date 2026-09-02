class Solution {
    public int[] getConcatenation(int[] nums) {
        // Create a copy of nums with length double to it
        int[] result=Arrays.copyOf(nums,2*nums.length);
        // so this Arrays method creates an arrays of double the nums length and fill the beginning with nums elements
        //the remaing half is still filled with zeroes
        // result[]= [1,4,1,2,0,0,0,0]
        // result index to fill from =nums.length
        //source index to fill from =0
        //number of elements to fill=nums.length

        //There is a method in System library names arrayCopy whose schema looks like this
        /*
          System.arraycopy(
          sourceArray,
          sourceStartingPosition,
          destinationArray,
          destinationStartingPosition,
          numberOfElements
          );


        */
        System.arraycopy(nums,0,result,nums.length,nums.length);
        return result;
    }
}