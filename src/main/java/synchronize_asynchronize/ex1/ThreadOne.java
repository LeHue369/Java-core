package synchronize_asynchronize.ex1;

import synchronize_asynchronize.ex1.NonSynchronizedMethod;

public class ThreadOne extends Thread{
    NonSynchronizedMethod nonSynchronizedMethod;
    public ThreadOne(NonSynchronizedMethod nonSynchronizedMethod){
        this.nonSynchronizedMethod = nonSynchronizedMethod;
    }

    @Override
    public void run() {
        nonSynchronizedMethod.printNumbers();
    }
}
