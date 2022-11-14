public class throwusedcarexception{
    public static void main(String[] args) {
        int vin, year, miles;
        String make;
        double price;
        try {
            usedcar[] cars;
            cars = new usedcar[2];
            cars[0] = new usedcar(1234, "Nippon", 2001, 78340, 5980.90);
            cars[1] = new usedcar(1200, "Ford", 2005, 78370, 5960.90);
        } catch (usedcarexception e) {
            System.out.println(e.getMessage());
        }
    }
}