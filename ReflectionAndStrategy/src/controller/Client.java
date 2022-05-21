package controller;

import Context.ConcreteStrategy;

/**
 * @author SHshuo
 * @data 2021/10/16--8:41
 * 反射与策略模式结合
 * 不需要改动Client的代码
 */
public class Client {
    public static void main(String[] args) {

        ConcreteStrategy concreteStrategy;

        /**
         * 客户端传入不同的参数、例如传入的是下拉框的选项，这里写一个就够了，也就是说客户端代码是不变的；
         * 减轻客户端的职责交给Context，实现了具体的策略类与客户端解耦。
         *
         * 单纯的策略模式，这里仍需要自己定义具体实现的策略，每次仍需要添加分支，修改客户端的代码，增加客户端的压力
         */
        concreteStrategy = new ConcreteStrategy("ConcreteStrategyA");
        concreteStrategy.AlgorithmInterface();

//        concreteStrategy = new ConcreteStrategy("ConcreteStrategyB");
//        concreteStrategy.AlgorithmInterface();
//
//        concreteStrategy = new ConcreteStrategy("ConcreteStrategyC");
//        concreteStrategy.AlgorithmInterface();
    }
}
