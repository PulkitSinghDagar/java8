package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class nothreadsafeCollection {
    public static void main(String[] args) {

////here we are trying no thread safe collection
//        List<String> st = new ArrayList<>();
//        st.add("first");
//        st.add("second");
//        st.add("third");
//        st.add("fourth");
//
//        Runnable t1 = () -> {
//            for (String str : st) {
//                System.out.println(str);
//            }
//
//
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//
//                e.printStackTrace();
//            }
//
//        };
//
//
//        Runnable t2 = () -> {
//
//            st.add("my new ");
//            st.add("my new ");
//            st.add("my new ");
//
//        };
//
//
//        new Thread(t1).start();
//        new Thread(t2).start();











        //here we are trying  thread safe collection
        List<String> st = new CopyOnWriteArrayList<>();
        st.add("first");
        st.add("second");
        st.add("third");
        st.add("fourth");

        Runnable t1 = () -> {
            for (String str : st) {
                System.out.println(str);
            }


            try {
                Thread.sleep(100000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }

        };


        Runnable t2 = () -> {

            st.add("my new ");
            st.add("my new ");
            st.add("my new ");

        };
        new Thread(t2).start();

        new Thread(t1).start();








    }
}
