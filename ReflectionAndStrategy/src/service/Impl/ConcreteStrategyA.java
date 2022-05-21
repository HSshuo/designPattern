package service.Impl;

import service.Strategy;

/**
 * @author SHshuo
 * @data 2021/10/16--8:36
 */
public class ConcreteStrategyA implements Strategy {

    @Override
    public void AlgorithmInterface() {
        System.out.println("A算法实现具体内容");
    }
}
