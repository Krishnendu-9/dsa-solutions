class Solution {
    public double myPow(double x, int n) {
        long exponent = n;

        if (exponent < 0) {
            x = 1 / x;
            exponent = -exponent;
        }
        
        double finalResult = 1.0,currentBase = x;
        
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                finalResult *= currentBase;
            }
            currentBase *= currentBase;
            exponent /= 2;
        }
        return finalResult;
    }
}
