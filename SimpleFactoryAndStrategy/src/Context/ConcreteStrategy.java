package Context;

import service.Impl.ConcreteStrategyA;
import service.Impl.ConcreteStrategyB;
import service.Impl.ConcreteStrategyC;
import service.Strategy;


/**
 * @author SHshuo
 * @data 2021/10/16--8:42
 * 简单工厂模式
 * 由Context作为工厂，创建具体的实现类
 */
public class ConcreteStrategy {

    private Strategy strategy;


    /**
     * 利用工厂模式在构造函数中根据不同分支创建具体的对象，
     * 而不需要从客户端传入具体的对象，实现了客户端与具体的实现类的解耦
     * @param type
     */
    public ConcreteStrategy(String type){
        switch (type){
            case"ConcreteStrategyA":
                strategy = new ConcreteStrategyA();
                break;
            case"ConcreteStrategyB":
                strategy = new ConcreteStrategyB();
                break;
            case"ConcreteStrategyC":
                strategy = new ConcreteStrategyC();
                break;
        }
    }


    /**
     * 根据具体的策略对象、调用其算法的方法
     */
    public void AlgorithmInterface(){
        strategy.AlgorithmInterface();
    }
}
