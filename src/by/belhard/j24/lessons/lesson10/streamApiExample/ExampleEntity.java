package by.belhard.j24.lessons.lesson10.streamApiExample;

import java.util.Random;

public class ExampleEntity {

    private String name;
    private InternalEntity internalEntity;

    public ExampleEntity(String name, InternalEntity internalEntity) {
        this.name = name;
        this.internalEntity = internalEntity;
    }

    public ExampleEntity(String name) {
        this.name = name;
        this.internalEntity = new InternalEntity(new Random().nextInt(100));
    }

    @Override
    public String toString() {
        return "ExampleEntity{" +
                "name='" + name + '\'' +
                ", internalEntity=" + internalEntity +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InternalEntity getInternalEntity() {
        return internalEntity;
    }

    public void setInternalEntity(InternalEntity internalEntity) {
        this.internalEntity = internalEntity;
    }
}
