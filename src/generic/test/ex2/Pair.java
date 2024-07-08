package generic.test.ex2;

import java.nio.file.FileStore;

public class Pair<T, T1> {

    private T First;
    private T1 Second;
    public void setFirst(T First) {
        this.First = First;
    }

    public void setSecond(T1 Second) {
        this.Second = Second;
    }

    public T getFirst() {
        return First;
    }

    public T1 getSecond() {
        return Second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "First=" + First +
                ", Second=" + Second +
                '}';
    }
}
