class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1; // Minimum possible speed
        int right = getMax(piles); // Maximum possible speed

        while (left <= right) {
            int mid = left + (right - left) / 2; // Try middle speed
            long hoursNeeded = getTotalHours(piles, mid);

            if (hoursNeeded <= h) {
                // Can finish in time or earlier -> try slower speed
                right = mid - 1;
            } else {
                // Not enough time -> need to eat faster
                left = mid + 1;
            }
        }

        return left; // Minimum speed that works
    }

    // Calculating total hours needed at a given speed
    static long getTotalHours(int[] piles, int speed) {
        long totalHours = 0;
        for (int i=0;i<piles.length;i++) {
            // Use ceiling: (bananas + speed - 1) / speed
             totalHours += Math.ceil((double) piles[i] / speed);
        }
        return totalHours;
    }

    
    static int getMax(int[] piles) {
        int max = piles[0];
        for (int i = 1; i < piles.length; i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }
        return max;
    }
}
