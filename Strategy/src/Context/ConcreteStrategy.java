package Context;

import service.Strategy;

/**
 * @author SHshuo
 * @data 2021/10/16--8:42
 * 面向接口编程、体现依赖倒转原则
 * 上下文
 */
public class ConcreteStrategy {

    private Strategy strategy;

    /**
     * 初始化的之后传入具体的策略对象
     * @param strategy
     */
    public ConcreteStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    /***
     * 根据具体的策略对象、调用其算法的方法
     */
    public void AlgorithmInterface(){
        strategy.AlgorithmInterface();
    }
}
