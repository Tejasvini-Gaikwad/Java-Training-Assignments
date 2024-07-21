public class Person {
    private String Name;
    private int Age;
    public Person(String Name, int Age){
        this.Name = Name;
        this.Age = Age;
    }

    public String setName(String name){
        this.Name = name;
        return Name;
    }

    public String getName(){
        return Name;
    }

    public int setAge(int age){
        this.Age = age;
        return Age;
    }

    public int getAge(){
        return Age;
    }

    public static void main(String[] args){
        Person person = new Person("Tejasvini", 27);
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.setName("Divya"));
        System.out.println(person.setAge(29));
        System.out.println(person);
    }
}

