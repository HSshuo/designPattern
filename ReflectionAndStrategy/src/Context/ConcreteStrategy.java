package Context;

import service.Strategy;

import java.lang.reflect.Constructor;

/**
 * @author SHshuo
 * @data 2021/10/16--8:42
 * 使用反射实例化具体的类
 * 不需要改动Context的代码
 */
public class ConcreteStrategy {

    private Strategy strategy;


    /**
     * 利用反射根据类名，创建对应具体类的实例，
     * 不需要Switch，case分支进行传入判断，而不需要改动Context类的代码
     * @param type
     */
    public ConcreteStrategy(String type){
        try {
            Class c = Class.forName("service.Impl." + type);
            Constructor constructor = c.getConstructor();
            strategy = (Strategy) constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 根据具体的策略对象、调用其算法的方法
     */
    public void AlgorithmInterface(){
        strategy.AlgorithmInterface();
    }
}
