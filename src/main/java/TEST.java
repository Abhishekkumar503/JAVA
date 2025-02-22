class Human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }

    public void setName(String n) {
        name = n;
    }
}

public class TEST {
    public static void main(String[] args) {
        Human h = new Human();
        h.setAge(25);
        h.setName("Abhishek");
        System.out.println(h.getName() + " : " + h.getAge());

        System.out.println("Till here, it works.");
    }
}
