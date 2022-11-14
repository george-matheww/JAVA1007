public class random extends Thread {
    int n;
    String ans = "";

    public random(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        if (n % 2 == 0) {
            ans = "Number is an Even Number";
        } else {
            ans = "The Number is an Odd Number";
        }
    }
    public String getAns() {
        return ans;
    }
}