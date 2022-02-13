package javacode;

import java.util.Objects;

public class TestClass {
   int i;

    public TestClass(int i) {
        this.i = i;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestClass testClass = (TestClass) o;
        return i == testClass.i;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i);
    }
}
