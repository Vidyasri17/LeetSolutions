class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long currMass = mass;
        for(int i: asteroids){
            if(i <= currMass) currMass += i;
            else return false;
        } 
        return true;
    }
}