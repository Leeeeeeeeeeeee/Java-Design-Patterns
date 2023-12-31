访问者模式（Visitor Pattern）是一种行为型设计模式，用于将数据结构和数据操作分离开来，使得可以在不改变数据结构的情况下，定义新的操作或算法。它将数据结构中的每个元素都封装成一个接受访问者的方法，从而可以将具体的操作委托给访问者对象，实现了双重分派。

访问者模式通常包含以下几个主要角色：

访问者（Visitor）：访问者是一个接口或抽象类，其中定义了访问数据结构中各种元素的方法。每个具体的访问者类实现了这个接口，从而可以在访问不同元素时执行不同的操作。

具体访问者（Concrete Visitor）：具体访问者类实现了访问者接口中定义的方法，定义了具体的操作逻辑。

元素（Element）：元素是一个接口或抽象类，其中定义了接受访问者的方法。每个具体的元素类实现了这个接口，从而可以接受不同的访问者。

具体元素（Concrete Element）：具体元素类实现了元素接口中定义的方法，将自身作为参数传递给访问者的方法。

数据结构（Object Structure）：数据结构是一组具体元素的集合，提供了一种方式让访问者能够遍历其中的元素。

以下是一个简单的例子来说明访问者模式的使用：

假设有一个电商网站，里面有不同类型的商品（如书籍、电子产品等），同时也有不同类型的访问者（如普通用户、VIP用户等）。使用访问者模式，可以定义不同的访问者来计算不同类型商品的折扣价格。