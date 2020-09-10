package by.belhard.j24.lessons.lesson05.inheritanceExample;

public class InheritanceExample {

    public static void main(String[] args) {

        Worker worker = new Worker("Vasily", 55, "pick-axe");

        Manager manager = new Manager("Svetlana", 22, 123456);

        System.out.println(worker.getName() + " "
                + worker.getAge() + " "
                + worker.hashCode() + " " + worker.getWorkingTool());

        System.out.println(manager.getName() + " "
                + manager.getAge() + " "
                + manager.hashCode() + " " + manager.getPhoneNumber());

        System.out.println(worker.toString());

        Employee employee = new Worker("Igor", 25, "screw-driver");
//        employee = manager; // ClassCastException!

        System.out.println();
        System.out.println(((Worker) employee).getWorkingTool());

        Object o = new Worker("Nikolay", 25, "screw-driver");
        Employee[] employees = new Employee[5];
        employees[0] = worker;
        employees[1] = employee;
        employees[2] = manager;
        employees[3] = new Manager("Katya", 46, 123458);
        employees[4] = (Worker) o;

        for (Employee e : employees) {
            e.setAge(e.getAge() + 1);
        }
    }
}
