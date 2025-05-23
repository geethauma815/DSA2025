import java.util.* ;
import java.io.*; 

public class Solution {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
      int low=0;
      int high=n-1;
      int ans[]=new int[2];
      ans[0]=-1;
      ans[1]=-1;
      while(low<=high){
        int mid=(low+high)/2;
         if(a[mid]<=x){
           ans[0]=a[mid];
           low=mid+1;
         }
         else{
           high=mid-1;
         }
      }
        low=0;
        high=n-1;
        while(low<=high){
          int mid=(low+high)/2;
          if(a[mid]>=x){
            ans[1]=a[mid];
            high=mid-1;
          }
          else{
            low=mid+1;
          }
        }
        return ans;
    }
}
