package net.cheneystudio.oop;

/**
 * Create on 2019-07-25 10:04
 *
 * @author Cheney Wong
 */
public class OverrideMethodWithoutAnnotation {
    AncestorInterface newInstanceA = new AncestorInterface() {
        public void methodFromInterface() {
        }
    };
    AncestorInterface newInstanceB = new AncestorInterface() {
        @Override
        public void methodFromInterface() {
        }
    };

    interface AncestorInterface {
        void methodFromInterface();
    }

    interface ParentInterface extends AncestorInterface {
        @Override
        void methodFromInterface();
    }

    interface ChildInterface extends ParentInterface {
        void methodFromInterface();
    }

    class AncestorClass implements ChildInterface {
        @Override
        public void methodFromInterface() {
        }

        void methodFromClass() {
        }

        private void privateMethod() {
        }
    }

    class ParentClass extends AncestorClass {
        @Override
        void methodFromClass() {
            super.methodFromClass();
        }

        @Override
        public void methodFromInterface() {
            super.methodFromInterface();
        }

        private void privateMethod() {
        }
    }

    class ChildClass extends ParentClass {
        void methodFromClass() {
            super.methodFromClass();
        }

        public void methodFromInterface() {
            super.methodFromInterface();
        }

        private void privateMethod() {
        }
    }
}
