public class Outer_Demo {
    private int num = 175;
    public class Inner_Demo{
        public int getNum(){
            System.out.println("This is the getNum method of the Inner class");
            return num;
        }
    }
}
