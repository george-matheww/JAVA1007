public class fibbo extends Thread {
    int num;

    public fibbo(int n) {
        this.num = n;
    }
    @Override
    public void run() {
        int a = 0, b = 1, c = 0;
        for (int i = 0; i < num; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}