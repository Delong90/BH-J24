package by.belhard.j24.lessons.lesson07.abstractExample;

public abstract class Employee implements Workable, Comparable<Employee> {

    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    public abstract void doWork();

    // String a = "10000";
    // String b = "2";
    // a.compareTo(b) // -1
    @Override
    public int compareTo(Employee another) {

        int result = name.compareTo(another.name);
        if (result == 0) {
            result = age - another.age;
        }

        return result;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
