package by.belhard.j24.lessons.lesson05.inheritanceExample;

public class Worker extends Employee {

    private String workingTool;

    public Worker(String name, int age, String workingTool) {
        super(name, age);
        this.workingTool = workingTool;
    }

    @Override
    public String toString() {

        return "Worker{" + super.toString() +
                ", workingTool='" + workingTool + '\'' +
                '}';
    }

    @Override
    public String getName() {
        return super.getName() + "-san";
    }

    public String getWorkingTool() {
        return workingTool;
    }

    public void setWorkingTool(String workingTool) {
        this.workingTool = workingTool;
    }
}
