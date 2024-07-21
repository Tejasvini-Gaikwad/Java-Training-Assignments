public class Talk {
    public void talk() {
        System.out.println("Hello");
    }

    public void talk(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        Talk greeter = new Talk();
        greeter.talk();
        greeter.talk("Tejasvini");
    }
}
