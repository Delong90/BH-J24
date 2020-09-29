package by.belhard.j24.lessons.lesson10.streamApiExample;

import java.util.function.Function;

public class ExampleEntityFunction implements Function<ExampleEntity, InternalEntity> {

    @Override
    public InternalEntity apply(ExampleEntity exampleEntity) {

        return exampleEntity.getInternalEntity();
    }
}
