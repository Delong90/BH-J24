package by.belhard.j24.lessons.lesson07.abstractExample;

public class Worker extends Employee {

    private String tool;

    public Worker(String name, int age, String tool) {
        super(name, age);
        this.tool = tool;
    }

    @Override
    public void doWork() {

        System.out.println(getName() + " works hard");
    }

    @Override
    public String toString() {
        return "Worker{" + super.toString() +
                " tool='" + tool + '\'' +
                '}';
    }

    public String getTool() {
        return tool;
    }

    public void setTool(String tool) {
        this.tool = tool;
    }
}
