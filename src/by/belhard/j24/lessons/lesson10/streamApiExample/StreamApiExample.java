package by.belhard.j24.lessons.lesson10.streamApiExample;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamApiExample {

    public static void main(String[] args) {

        List<ExampleEntity> list = Arrays.asList(
                new ExampleEntity("1"),
                new ExampleEntity("2"),
                new ExampleEntity("3"),
                new ExampleEntity("4"),
                new ExampleEntity("5"),
                new ExampleEntity("6"),
                new ExampleEntity("7"),
                new ExampleEntity("8")
        );

        System.out.println(list);

        /*List<InternalEntity> collect = list.stream()
                .map(new ExampleEntityFunction())
                .filter(new InternalEntityPredicate())
                .collect(Collectors.toList());*/

        List<InternalEntity> collect = list.stream()
                .map(new Function<ExampleEntity, InternalEntity>() {
                    @Override
                    public InternalEntity apply(ExampleEntity ee) {
                        return ee.getInternalEntity();
                    }
                }).filter(new InternalEntityPredicate())
                .collect(Collectors.toList());

        System.out.println(collect);
        System.out.println("original list size: " + list.size());

        /*list.stream()
                .map((ExampleEntity exampleEntity) -> {
                    System.out.println();
                    return exampleEntity.getInternalEntity();
                });*/

        List<Integer> collect1 = list.stream()
//                .map(ee -> ee.getInternalEntity())
                .map(ExampleEntity::getInternalEntity)
                .filter(ie -> ie.getValue() > 50)
//                .map(ie -> ie.getValue())
                .map(InternalEntity::getValue)
                .collect(Collectors.toList());

        System.out.println(collect1);

    }
}





















