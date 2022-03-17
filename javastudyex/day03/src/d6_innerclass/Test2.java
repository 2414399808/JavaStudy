package d6_innerclass;

public class Test2 {
    public static void main(String[] args) {
        People people=new People();
        People.Heart heart=people.new Heart();
        heart.show();
    }
}
class People{
    private int heartbeat =150;
    public class Heart{
        private int heartbeat=110;
        public void show(){
            int heartbeat=78;
            System.out.println(heartbeat);
            System.out.println(this.heartbeat);
            System.out.println(People.this.heartbeat);
        }
    }
}
