package braceChecker;


public class StackImplementation<T> implements Stack<T> {

    private static final int DEFAULT_CAPACITY = 15;
    private static Object[] objects = new Object[DEFAULT_CAPACITY];
    private int size = -1;

    @Override
    public void push(T t) {
        if (objects.length >= size) {
            extendArray();
        }
        objects[++size] = t;
    }

    @Override
    public Object pop() {
        if (size < 0) {
            return 0;
        }
        return objects[size--];
    }


    private void extendArray() {
        Object[] tempArray = new Object[objects.length + objects.length / 3];
        System.arraycopy(objects, 0, tempArray, 0, objects.length);
        tempArray = objects;
    }
}
