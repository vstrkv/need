import java.util.Arrays;

public class Test_01 {

    public static class DynamicArray<T> {
        private int size = 0;
        Object[] object = new Object[11];

        public void add(T element) {
            if(size == object.length) {
                object = Arrays.copyOf(object, object.length * 2);
            }
            object[size] = element;
            size++;
        }

        public void remove(int index) {
            System.arraycopy(object, index + 1, object, index, object.length - index - 1);
        }

        public T get(int index) {
            return (T)object[index];
        }
    }







    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);
        dynamicArray.add(5);
        dynamicArray.remove(0);
        dynamicArray.remove(1);

        System.out.println(Arrays.toString(dynamicArray.object));
    }
}
