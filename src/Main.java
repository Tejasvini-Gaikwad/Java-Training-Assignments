class Sender {
    public void send(String message) {
        System.out.println(message);
    }
}

    class ThreadSender extends Thread{
        Sender sender;
        protected String message;
        public ThreadSender(String message, Sender sender){
            this.sender = sender;
            this.message = message;
        }
        public void run(){
            sender.send(message);
        }
    }

    public class Main{
            public static void main(String[] args) {
                Sender sender = new Sender();
                ThreadSender threadSender = new ThreadSender("Hi", sender);
                ThreadSender threadSender2 = new ThreadSender("Bye", sender);
                threadSender.start();
                threadSender2.start();
            }
    }



