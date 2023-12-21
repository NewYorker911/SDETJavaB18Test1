package class20;

public abstract class Computer {

    public static String type;
    public String name;
    protected int memory;
    String color;



    Computer(String name, int memory, String color){
        this.name=name;
        this.memory=memory;
        this.color=color;
    }
    public static void playMusic(){
        System.out.println("I can play music on my "+type);
    }

    protected void printInfo(){
        System.out.println("I have "+name+" computer, with "+memory+" memory");
    }

    abstract void executeCode();

    abstract void readEmails();
}

class Apple extends Computer{

    public Apple(String name, int memory, String color){
        super(name, memory, color);
    }

    @Override
    void executeCode() {
        System.out.println("Code will be executed on "+type+" "+name);
    }

    @Override
    void readEmails() {
        System.out.println("Emails will be read on "+type+" "+name);
    }
}
