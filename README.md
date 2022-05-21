# designPattern
常见的设计模式的总结

1. 策略模式
一步步改进的过程：`Strategy-->SimpleFactoryAndStrategy-->ReflectionAndStrategy`

思路是：

- 基础的策略模式的代码，由客户端指定具体的策略，通过Context传入，调用具体策略的方法；缺点是：客户端来辨别具体传入的策略，增加了负担，客户端与具体策略没有充分解耦；
- 针对客户端进行改进，在Context使用工厂模式，将客户端的代码移动到Context类来实现，客户端只需要传递type，由Context来判断具体策略的创建；好处是：减轻了客户端的压力，客户端代码不需要改动，客户端与具体的策略解耦；缺点是：增加一个策略，仍需要改动Context类的代码，添加分支；
- 针对Context进行改进，在Context使用反射，通过客户端传入具体的类名，来获取class、构造器、newInstance()；好处是：增加一个策略的时候，不需要改动客户端、Context的代码，只需要实现接口即可。



-----
待完善。。。
