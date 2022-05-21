package service.Impl;

import service.Strategy;

/**
 * @author SHshuo
 * @data 2021/10/16--8:36
 */
public class ConcreteStrategyC implements Strategy{
    @Override
    public void AlgorithmInterface() {
        System.out.println("C算法实现具体内容");
    }
}
