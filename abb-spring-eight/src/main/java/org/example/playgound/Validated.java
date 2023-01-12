package org.example.playgound;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public interface Validated<A> {
    boolean isValid();
    List<String> errors();

    class Valid<A> implements Validated<A> {

        private final A value;

        public Valid(A value) {
            this.value = value;
        }

        @Override
        public boolean isValid() {
            return true;
        }

        @Override
        public List<String> errors() {
            return Collections.emptyList();
        }
    }

    class Invalid implements Validated {
        final String error;

        public Invalid(String error) {
            this.error = error;
        }

        @Override
        public boolean isValid() {
            return false;
        }

        @Override
        public List<String> errors() {
            return Collections.singletonList(error);
        }
    }


    class InvalidList implements Validated {
        final List<String> errors;

        public InvalidList(List<String> errors) {
            this.errors = errors;
        }

        public InvalidList(String... errors) {
            this(Arrays.asList(errors));
        }

        @Override
        public boolean isValid() {
            return false;
        }

        @Override
        public List<String> errors() {
            return errors;
        }
    }

    static <A> Validated<A> valid(A value) {
        return new Valid(value);
    }

    static Validated invalid(String message) {
        return new Invalid(message);
    }

    static Validated invalidList(List<String> message) {
        return new InvalidList(message);
    }



}
