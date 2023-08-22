### 1. 创建型模式（Creational Patterns）:

这类模式关注对象的创建过程，提供了创建对象的机制，以降低系统对类的直接依赖。

- 单例模式（Singleton Pattern）
  - 懒加载：多线程环境下需要考虑线程安全
  - 饿加载：在类加载时就创建实例，并且对外提供静态的获取实例的方法。优点是线程安全
  - 静态内部/枚举单例：利用Java的类加载机制和静态内部类的特性，实现了懒加载且线程安全。
  - 双重同步检查单例：在getInstance内利用同步锁再检查一次instance状态，结合了懒汉式和饿汉式的优点，在多线程环境下保证了懒加载和高效获取实例。

- 工厂模式（Factory Pattern）
  - 简单工厂：只有产品有接口，工厂是一个统一的类，根据传入的不同值生成不同的具体产品
  - 具体工厂：产品和工厂都有接口，某个具体的工厂只生产某种具体的产品
  - 抽象工厂：每种具体的产品都有一个不同的接口，这样可以利用不同的具体产品接口定义不同的具体产品行为

- 建造者模式（Builder Pattern）：将产品不同性质的设置定义为建造者中的不同方法
- 原型模式（Prototype Pattern）：具体产品实现Cloneable接口

### 2. 结构型模式（Structural Patterns）:

这类模式关注如何组合对象以形成更大的结构，以满足更复杂的需求。

- 适配器模式（Adapter Pattern）：将一个类的接口转换成客户端希望的另一个接口
- 桥接模式（Bridge Pattern）：用于将抽象部分与其实现部分分离，以便它们可以独立地进行变化，比如图形的颜色或者形状
- 装饰器模式（Decorator Pattern）：用于动态地将责任添加到对象上，而不会影响其他对象，允许将对象包装在具有相同接口的装饰器类中来扩展对象的功能
- 外观模式（Facade Pattern）：旨在提供一个简化的接口，将复杂系统的一组接口、类和子系统组合成一个更高级别的统一接口，从而使外部客户端代码能够更轻松地与系统交互
- 享元模式（Flyweight Pattern）：通过共享对象来减少内存使用和提高性
- 代理模式（Proxy Pattern）：它允许一个对象（代理对象）代替另一个对象（真实对象）来控制其访问。代理对象充当了客户端和真实对象之间的中介，可以在访问真实对象之前或之后进行一些额外的操作。这可以用于实现懒加载、权限控制、缓存等功能

### 3. 行为型模式（Behavioral Patterns）:

这类模式关注对象之间的通信、交互、职责分配等行为。

- 观察者模式（Observer Pattern）：让多个观察者对象可以同时监听并依赖于一个主题对象，当主题对象状态发生变化时，所有依赖它的观察者都会收到通知并自动更新。
- 策略模式（Strategy Pattern）：它允许在运行时选择算法的实现方式。这种模式定义了一组算法（或策略），并将每个算法封装成一个独立的类，使得它们可以相互替换而不影响客户端使用。
- 模板方法模式（Template Method Pattern）：它定义了一个算法的基本框架，而将一些步骤的具体实现延迟到子类中。模板方法模式允许子类在不改变算法结构的情况下，重新定义某些步骤的具体实现。
- 命令模式（Command Pattern）：将请求或操作封装成一个对象，从而允许将请求者和执行者之间解耦。这种模式使得可以将不同的请求转化为具体的命令对象，这些命令对象可以被存储、传递、撤销和重做。
- 职责链模式（Chain of Responsibility Pattern）：允许你将请求沿着处理链传递，直到有一个处理者能够处理该请求为止。这种模式将请求的发送者和接收者解耦，使得多个对象都有机会处理请求，而不需要显式地指定处理者。
- 解释器模式（Interpreter Pattern）：用于定义一种语言的文法规则，并提供一种解释器来解释这种语言中的表达式。这个模式主要用于处理类似于编程语言解释、数学表达式求值等问题。它将一个语言表达式的解释器拆分为一组小的对象，每个对象对应语言中的一个文法规则。
- 迭代器模式（Iterator Pattern）：用于提供一种统一的方法来访问集合对象（如列表、数组等）中的元素，而不必关心集合的内部表示方式。它将遍历集合的责任从客户端代码中分离出来，使得客户端可以通过统一的接口逐个访问集合中的元素，而无需知道底层集合的结构。
- 中介者模式（Mediator Pattern）：通过一个中介对象来协调多个对象之间的交互，从而降低对象之间的耦合度。它将对象之间的通信和交互行为集中管理，而不是让每个对象都直接与其他对象进行通信。这种模式有助于简化对象之间的相互作用，并且可以更好地维护和扩展代码。
- 备忘录模式（Memento Pattern）：用于捕获一个对象的内部状态，并将其保存在一个备忘录对象中，从而在需要的时候可以恢复对象的状态。这种模式允许在不暴露对象内部结构的情况下，对对象的状态进行备份和恢复操作。
- 状态模式（State Pattern）：用于在一个对象的内部状态改变时，使对象的行为也发生相应的改变，从而将状态的变化和行为的变化分离开来。这种模式将对象的状态封装成不同的状态类，使得状态的切换可以更加灵活，而且可以避免大量的条件语句。
- 访问者模式（Visitor Pattern）：用于将数据结构和数据操作分离开来，使得可以在不改变数据结构的情况下，定义新的操作或算法。它将数据结构中的每个元素都封装成一个接受访问者的方法，从而可以将具体的操作委托给访问者对象，实现了双重分派。