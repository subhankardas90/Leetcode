package org.example;

//LC 1732. Find the Highest Altitude
public class LC7518 {
    public int largestAltitude(int[] gain) {

        int maxAltitude = 0;
        int currentAltitude = 0;

        for (int i = 0; i < gain.length; i++) {
            currentAltitude += gain[i];
            maxAltitude = Math.max(maxAltitude, currentAltitude);
        }

        return maxAltitude;
    }
}
