public class binary {
  static int binarySearch(int[] a, int low, int high, int key) {
    if (low > high)
      return -1;
    
    int mid = low + (high - low) / 2;

    if (a[mid] == key)
      return mid;
    else if (a[mid] > key)
      return binarySearch(a, low, mid - 1, key);
    else
      return binarySearch(a, mid + 1, high, key);
  }

  public static void main(String[] args) {
    int[] a = {1, 6, 10, 15, 30}; 
    int res = binarySearch(a, 0, a.length - 1, 10);
    System.out.println(res); 
  }
}

