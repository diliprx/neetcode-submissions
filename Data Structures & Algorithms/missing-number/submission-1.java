class Solution {
    public int missingNumber(int[] nums) {
        int a = nums.length;
        int b=-1;
        boolean c=true;
        Arrays.sort(nums);
        for(int i=0;i<a;i++){
            if(i!=nums[i]){
                c=false;
                b=i;
                break;
            }

        }
        if(!c){
            return b;
        }
        else{
            return a;
        }
    }
}
