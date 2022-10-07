package mutable_Immutable_String_StringBuilder_StringBuffer.additionalStuff;

public class StringBuffer_StringBuilder {
    public static void main(String[] args) {
        //non-synchronized(not thread safe)
        //ctrl+click => no synchronized methods
        StringBuilder sb = new StringBuilder();
        long startTime = System.currentTimeMillis();
        //code
        for(int i = 0; i<1000000; i++){
            sb.append("hello");
        }
        long endTime = System.currentTimeMillis();

        long duration = endTime - startTime;
        System.out.println("Builder: " + duration);

        //synchronized(thread safe)
        StringBuffer sbuff = new StringBuffer();
        long startTime2 = System.currentTimeMillis();
        //code
        for(int i = 0; i<1000000; i++){
            sbuff.append("hello");
        }
        long endTime2 = System.currentTimeMillis();

        long duration2 = endTime2 - startTime2;
        System.out.println("Buffer: " +duration2);

    }
}
