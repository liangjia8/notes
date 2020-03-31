package com.liang.erhua.thread.proandcon;

/**
 * @author liangjia
 * @version 1.0
 * @date 22:08/2020-01-19
 * @description
 */
public class Producer implements Runnable {

    private Resource resource;

    public Producer(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        while (true) {
            resource.setName("+ 商品 +");
        }
    }
}
