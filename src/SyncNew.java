class Sync {
    synchronized void printNumbers(int n){
        for (int i = n; i <= n+5; i++){
            System.out.println(i);
        }
    }

    class Thread1 extends Thread{
        Sync s;
        public Thread1(Sync s){
            this.s = s;
        }
        public void run(){
            s.printNumbers(1);
        }
    }

    class Thread2 extends Thread{
        Sync s;
        public Thread2(Sync s){
            this.s = s;
        }
        public void run(){
            s.printNumbers(5);
        }
    }
}

public class SyncNew{
    public static void main(String[] args) {
        Sync s = new Sync();
        Sync.Thread1 t1 = s.new Thread1(s);
        Sync.Thread2 t2 = s.new Thread2(s);
        System.out.println(t1);
        t1.start();
        t2.start();
    }
}