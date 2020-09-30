package by.belhard.j24.lessons.lesson10.streamApiExample;

import java.util.function.Predicate;

public class InternalEntityPredicate implements Predicate<InternalEntity> {

    @Override
    public boolean test(InternalEntity internalEntity) {

        return internalEntity.getValue() > 50;
    }
}
