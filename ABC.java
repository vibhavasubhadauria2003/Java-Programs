final class FinalClass {
    public void show() {
        System.out.println("This is a final class. No class can extend me!");
    }
}

class ABC extends FinalClass {
    public static void main(String args[]){
        ABC o1=new ABC();
        o1.show();
    }
}