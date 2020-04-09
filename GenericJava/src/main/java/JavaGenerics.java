import static java.lang.System.*;

public class JavaGenerics<T> {
    public static void main(String[] args) {

        /**Generic methods initialize Array literal and String Array
         * Then prints either of the arrays.
         * */
        String[] strArray = {"This","Is","A","test","String","Array"};
        Integer[] intArray = {12,345,6,789,10};
        GenericClass.printArrayContent(strArray);
        out.println ("or \n");
        GenericClass.printArrayContent(intArray);

        /**
         * Instantiating the generic class
         * setting the value for the string instance and integer instance
         * getting the value set
         */
        GenericClass<String> stringInstance = new GenericClass<>();
        stringInstance.set("Test");
        stringInstance.get();

        GenericClass<Integer> integerInstance = new GenericClass<>();
        integerInstance.set(1000);
        integerInstance.get();
    }
    public static class GenericClass<T> { /**Generic class with a type parameter of T*/
        public T t;
        public void set(T value) {
            this.t = value;  // Method to set the value
        }
        public void get() {   // gets the value
            out.println (t);
        }

        public static <O> void printArrayContent(O[] arrayInput) {
            for (O value : arrayInput) { /**takes in arrayInput as
                                            value and displays it.*/
                out.print (value + "");
            }
            out.println ("\n");
        }
    }
}