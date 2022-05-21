package controller;

import Context.ConcreteStrategy;
import service.Impl.ConcreteStrategyA;
import service.Impl.ConcreteStrategyB;
import service.Impl.ConcreteStrategyC;

/**
 * @author SHshuo
 * @data 2021/10/16--8:41
 * 策略模式
 */
public class Client {
    public static void main(String[] args) {

        ConcreteStrategy concreteStrategy;

        /***
         * 实例化的时候传入不同的具体策略对象
         */
        concreteStrategy = new ConcreteStrategy(new ConcreteStrategyA());
        concreteStrategy.AlgorithmInterface();

        concreteStrategy = new ConcreteStrategy(new ConcreteStrategyB());
        concreteStrategy.AlgorithmInterface();

        concreteStrategy = new ConcreteStrategy(new ConcreteStrategyC());
        concreteStrategy.AlgorithmInterface();
    }
}
