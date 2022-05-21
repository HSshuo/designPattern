package service;

/**
 * @author SHshuo
 * @data 2021/10/16--8:35
 * 拓展：如果有类实现不了Strategy,可以使用委托的方式添加AlgorithmInterface方法到Client类中
 */
public interface Strategy {

    void AlgorithmInterface();
}
