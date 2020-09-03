package by.belhard.j24.lessons.lesson04.static_example;

public class StaticExample {

    public static void main(String[] args) {

        /*taticUnit unit1 = new StaticUnit();

        unit1.setCounter(5);
        System.out.println(unit1.getCounter());

        StaticUnit unit2 = new StaticUnit();

        unit2.setCounter(10);
        System.out.println(unit1.getCounter());
        System.out.println(unit2.getCounter());
*/

        StaticUnit.setCounter(10);
        System.out.println(StaticUnit.getCounter());
        StaticUnit.setCounter(15);
        System.out.println(StaticUnit.getCounter());
        StaticUnit u1 = new StaticUnit();
    }
}
