package create_new_object.class_loader;

public class MainClass {
    public static void main(String[] args) {
        CreateObjectWithClassLoader obj = null;
        try {
            obj = (CreateObjectWithClassLoader) new MainClass().getClass()
                    .getClassLoader().loadClass("create_new_object.class_loader.CreateObjectWithClassLoader").newInstance();
            // Fully qualified classname should be used.
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(obj);
    }
}