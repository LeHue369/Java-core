package synchronize_asynchronize.ex3;

public class A implements OnGeekEventListener{
    public void onGeekEvent(){
        System.out.println("Performing callback after Asynchronous Task");
    }
}
