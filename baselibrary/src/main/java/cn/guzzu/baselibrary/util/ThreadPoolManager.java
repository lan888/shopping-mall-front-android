package cn.guzzu.baselibrary.util;

import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Ian on 2018/3/15.
 */

public class ThreadPoolManager {
    private ExecutorService service;

    private ThreadPoolManager(){
        int num = Runtime.getRuntime().availableProcessors()*20;
        service = Executors.newFixedThreadPool(num);
    }

    private static final ThreadPoolManager manager = new ThreadPoolManager();

    public static ThreadPoolManager getInstance(){
        return manager;
    }

    public void executeTask(Runnable runnable){
        service.execute(runnable);
    }

    public void executeTasks(LinkedList<Runnable> list){
        for (Runnable runnable:list){
            service.execute(runnable);
        }
    }
}
