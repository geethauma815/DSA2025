public class Solution {
    public static int searchInsert(int [] arr, int m){
        int low=0;
        int n=arr.length;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+low)/2;
            if(arr[mid]>=m){
                ans=mid;
                high=mid-1;
            }
                
            
            else{
                low=mid+1;
                
            }
        }
        return ans;
        
    }
}
