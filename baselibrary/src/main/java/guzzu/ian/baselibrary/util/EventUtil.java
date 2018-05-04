package guzzu.ian.baselibrary.util;

import com.squareup.otto.Bus;

public class EventUtil {

    static class OttoBus extends Bus{
        private volatile static OttoBus bus;
        private OttoBus (){
        }
        public static OttoBus getInstance() {
            if (bus == null) {
                synchronized (OttoBus.class){
                    if(bus==null){
                        bus = new OttoBus();
                    }
                }
            }
            return bus;
        }
    }


    public static void register(Object context){
        OttoBus.getInstance().register(context);
    }

    public static void unregister(Object context){
        OttoBus.getInstance().unregister(context);
    }

    public static void sendEvent(Object object){
        OttoBus.getInstance().post(object);
    }
}