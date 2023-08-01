package binarysearch;

import java.util.Arrays;
import java.util.Collections;

public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = 1;
        for (int pile : piles) r = Math.max(r, pile);
        while (l < r) {
            int mid = (l + r) / 2;
            int count = 0;
            for (int pile : piles) count += Math.ceil((double) pile / mid);
            if (count <= h) r = mid;
            else l = mid + 1;
        }
        return r;
    }
}
