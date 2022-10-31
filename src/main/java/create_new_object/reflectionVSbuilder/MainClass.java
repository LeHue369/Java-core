package create_new_object.reflectionVSbuilder;

class MainClass {
    public static void main(String[] args) {
//        try {
//            Class cls = Class.forName("create_new_object.reflection.CreateObjectClass");
//            CreateObjectClass obj = (CreateObjectClass) cls.newInstance();
//            CreateObjectClass obj1 = (CreateObjectClass) cls.newInstance();
//            System.out.println(obj);
//            System.out.println(obj1);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
//        //------------
        CreateObjectClass createObjectClass = CreateObjectClass.builder()
                .hue("xinh").build();
        System.out.println(createObjectClass.toString());
    }
}