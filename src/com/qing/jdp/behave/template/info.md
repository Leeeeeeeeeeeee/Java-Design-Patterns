模板方法模式（Template Method Pattern）是一种行为型设计模式，它定义了一个算法的基本框架，而将一些步骤的具体实现延迟到子类中。模板方法模式允许子类在不改变算法结构的情况下，重新定义某些步骤的具体实现。

在模板方法模式中，有两种类型的方法：

模板方法（Template Method）：定义了算法的骨架，包含了一系列步骤的调用，有些步骤可以是抽象的，由子类实现。

具体方法（Concrete Methods）：在模板方法中调用的具体实现，通常在抽象类中已经提供了默认实现。

模板方法模式的核心思想是，将不变的部分放在父类中，将可变的部分留给子类来实现。

以下是一个使用模板方法模式的简单 Java 示例：

假设您正在开发一个咖啡因饮料制作的程序，其中有两种饮料：咖啡和茶。这两种饮料有相似的制作步骤，但是其中一些步骤可能因为种类不同而有所不同。