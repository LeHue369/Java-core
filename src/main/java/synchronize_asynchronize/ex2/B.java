package synchronize_asynchronize.ex2;

public class B {
    private OnGeekEventListener mListener;

    public void registerOnGeekEventListener(OnGeekEventListener mListener){
        this.mListener = mListener;
    }

    public void doGeekStuff(){
        System.out.println("Performing callback before synchronous task");
        if(this.mListener != null){
            mListener.onGeekEvent();
        }
    }
}
