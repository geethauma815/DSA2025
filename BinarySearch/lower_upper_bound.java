public class Solution {
    public static int lowerBound(int []arr, int n, int x) {
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
        int mid=(low+high)/2;
        if(arr[mid]>=x){   //remove '=' then it can be used for upper bound  
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
