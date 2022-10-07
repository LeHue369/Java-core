package synchronize_asynchronize.ex3;

public class B {
    private OnGeekEventListener mListener;

    public void registerOnGeekEventListener(OnGeekEventListener mListener){
        this.mListener = mListener;
    }

    public void doGeekStuff(){
        //An Async task always executes in new thread
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Performing operation in Asynchronous task");
                if(mListener != null){
                    mListener.onGeekEvent();
                }
            }
        }).start();
    }
}
