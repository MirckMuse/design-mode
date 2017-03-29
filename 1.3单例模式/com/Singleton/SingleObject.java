package com.Singleton;

/**
 * Created by S.H.I.E.L.D on 2017/3/28 0028.
 */
public class SingleObject {
    //创建SingleObject的一个对象
    private static SingleObject instance=new SingleObject();
    //让构造函数为private，这样该类就不会实例化
    private SingleObject(){}
    //获取唯一可用的对象
    public  static SingleObject getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello world");
    }

}
