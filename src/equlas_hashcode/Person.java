package equlas_hashcode;

import java.util.Objects;

public class Person {
    private PersonId id;

    public Person(PersonId id) {
        this.id = id;
    }

    public static class PersonId {
        private long value;

        public PersonId(long value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof PersonId personId)) return false;
            return value == personId.value;
        }

        @Override
        public int hashCode() {
            return Objects.hash(value);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return Objects.equals(this.id, person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
