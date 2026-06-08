class Solution {
    public int maxArea(int[] heights) {
        int m=0;
        int a=0,b=heights.length-1;
        while(a<b){
            int w=b-a;
            int h=Math.min(heights[b],heights[a]);
            int ar=w*h;
            m=Math.max(m,ar);
            if(heights[a]<heights[b]){
                a++;
            }
            else{
                b--;
            }
        }
        return m;
    }
}
