<!--
 * @Author: KingWJC
 * @Date: 2021-04-27 11:01:11
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-04-27 17:31:54
 * @Descripttion: 
 * @FilePath: \DesignPattern\README.md
-->
## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

## Dependency Management

The `JAVA DEPENDENCIES` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-pack/blob/master/release-notes/v0.9.0.md#work-with-jar-files-directly).


单例模式：
该类负责创建自己的对象，同时确保只有单个对象被创建。
这个类提供了一种访问其唯一的对象的方式，可以直接访问，不需要实例化该类的对象。

单例模式解决的问题
保证一个类仅有一个实例，并提供一个访问它的全局访问点。防止一个全局使用的类频繁地创建与销毁，节省资源，方便管理。

单例模式注意事项
单例类只能有一个实例。单例类必须自己创建自己的唯一实例，其他任何地方无法通过构造方法创建对象，也意味着需要构造方法私有化。单例类必须给所有其他对象提供这一实例。

使用场景
网站的计数器，一般也是采用单例模式实现，否则难以同步。
数据库连接池的设计一般也是采用单例模式，因为数据库连接是一种数据库资源。数据库软件系统中使用数据库连接池，主要是节省打开或者关闭数据库连接所引起的效率损耗，这种效率上的损耗还是非常昂贵的，因为何用单例模式来维护，就可以大大降低这种损耗。
操作系统的文件系统，也是大的单例模式实现的具体例子，一个操作系统只能有一个文件系统。

代码实现：懒汉，恶汉，双重校验锁，枚举和静态内部类。
单例模式又分为懒汉模式和饿汉模式，
两种的区别在于是不是启动的时候创建对象，饿汉模式不管是否需要对象，都先创建好。懒汉模式是在需要对象的时候，进行对象的创建。
本质区别是时间和空间的取舍，懒汉模式是用时间换空间，启动时候不需要创建对象，节省了空间，但是访问对象的时候要判断是否已经创建对象，会浪费一些时间。饿汉模式是用空间换时间，启动的时候创建对象，浪费了一些空间，但是访问的时候，不需要创建对象和判断对象是否存在，节省了时间，提高了效率。

懒汉模式存在一些问题，在多线程的情况下，多个线程同时调用getInstance方法，可能会创建多个对象，违背了单例模式只有一个实例的原则，需要对getInstance进行同步处理
同步处理后，保证只会创建一个单例，但是效率很低，是对整个getInstance方法加锁，一旦对象已经创建，每次只能有一个线程访问对象，可以通过双检锁的方式进行优化，既可以保证只会创建一个对象，同时又允许多个线程访问实例。

优缺点
优点：在单例模式中，活动的单例只有一个实例，对单例类的所有实例化得到的都是相同的一个实例。由于在系统内存中只存在一个对象，因此可以 节约系统资源，当需要频繁创建和销毁的对象时单例模式无疑可以提高系统的性能。

缺点：不适用于变化的对象，如果同一类型的对象总是要在不同的用例场景发生变化，单例就会引起数据的错误，不能保存彼此的状态。由于单利模式中没有抽象层，因此单例类的扩展有很大的困难。 单例类的职责过重，在一定程度上违背了“单一职责原则”



单例，简单工厂，抽象工厂，Mix。
当检索大量数据时， DataReader是一个不错的选择，因为数据不会缓存在内存中。
DataReader检索只读、只进数据流。 结果将在执行查询时返回，并存储在客户端的网络缓冲区中，直到您使用DataReader的Read方法请求它们
使用参数化命令来抵御 SQL 注入攻击
DataAccess封装DBHelper的类可以去掉。
Assembly和AppDomain：https://blog.csdn.net/talent_jian/article/details/54837064
连接字符串中包含的内容：Initial Catalog初始化连接池

简单工厂，工厂，抽象工厂区别。https://www.cnblogs.com/wikis/p/11738149.html

1) 分离了具体的类
Abstract Factory 模式帮助你控制一个应用创建的对象的类。因为一个工厂封装创建产品对象的责任和过程，它将客户与类的实现分离。客户通过它们的抽象接口操纵实例。产品的类名也在具体工厂的实现中被分离；它们不出现在客户代码中。

2) 使得易于交换产品系列
一个具体工厂类在一个应用中仅出现一次—即在它初始化的时候。这使得改变一个应用的具体工厂变得很容易。它只需改变具体的工厂即可使用不同的产品配置，这是因为一个抽象工厂创建了一个完整的产品系列，所以整个产品系列会立刻改变。

3) 有利于产品的一致性
当一个系列中的产品对象被设计成一起工作时，一个应用一次只能使用同一个系列中的对象，这一点很重要。而AbstractFactory很容易实现这一点。

4) 难以支持新种类的产品
难以扩展抽象工厂以生产新种类的产品，这是因为AbstractFactory接口确定了可以被创建的产品集合。 支持新种类的产品就需要扩展该工厂接口，这将涉及 AbstractFactory类及其所有子类的改变。