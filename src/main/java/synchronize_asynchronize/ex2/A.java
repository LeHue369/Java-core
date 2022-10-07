package synchronize_asynchronize.ex2;

public class A implements OnGeekEventListener {

    @Override
    public void onGeekEvent(){
        System.out.println("Performing callback after synchronous task");
    }
}
