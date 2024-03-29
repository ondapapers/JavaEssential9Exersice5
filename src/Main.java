public class MyClass<T> {


    public static <T> T factoryMethod(Class<T> clazz) throws IllegalAccessException, InstantiationException {
        return clazz.newInstance();
    }


    public static void main(String[] args) {
        try {

            String str = MyClass.factoryMethod(String.class);
            System.out.println("Створений екземпляр типу String: " + str);


            Integer integer = MyClass.factoryMethod(Integer.class);
            System.out.println("Створений екземпляр типу Integer: " + integer);
        } catch (IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}
