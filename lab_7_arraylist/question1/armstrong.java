public class armstrong extends Thread {
    int n;
    String s = "";
    public armstrong(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        int g, rem, res = 0;
        g = n;
        while (g != 0) {
            rem = g % 10;
            res += Math.pow(rem, 3);
            g /= 10;
        }
        if (res == n) {
            s = "The number is an Armstrong number";
        } else {
            s = "Number is not an Armstrong number";
        }
    }

    public String getArms() {
        return s;
    }
}