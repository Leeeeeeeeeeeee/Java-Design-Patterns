命令模式（Command Pattern）是一种行为型设计模式，它旨在将请求或操作封装成一个对象，从而允许将请求者和执行者之间解耦。这种模式使得可以将不同的请求转化为具体的命令对象，这些命令对象可以被存储、传递、撤销和重做。

命令模式的主要角色包括：

命令（Command）： 这是一个接口或抽象类，定义了执行操作的方法。通常包括一个 execute 方法，该方法会在接收者上执行实际的操作。

具体命令（Concrete Command）： 这是实现了命令接口的类，它包含了接收者对象的引用，并实现了 execute 方法以调用接收者的相应操作。

接收者（Receiver）： 接收者是执行实际操作的对象。命令模式将请求封装成一个命令对象，接收者知道如何执行这些命令。

调用者（Invoker）： 调用者是发出命令的对象。它持有一个命令对象，并在需要的时候调用命令的 execute 方法。

客户端（Client）： 创建命令对象、接收者对象和调用者对象，然后将它们组装起来的地方。

命令模式的主要优点包括：

解耦： 命令模式将请求者和执行者解耦，使得可以更容易地对系统的各个部分进行修改和扩展。
可撤销操作： 由于每个命令都是一个独立的对象，可以轻松地实现撤销和重做操作。
容易构建复杂操作： 可以通过组合不同的命令来构建复杂的操作，从而支持更高层次的抽象。
一个简单的例子是使用命令模式来实现遥控器控制家电设备。遥控器可以持有不同的命令对象，每个命令对象代表一个特定的操作（比如打开电视、关闭音响等）。调用者（遥控器）只需要调用命令对象的 execute 方法，而不需要知道实际操作是如何执行的。这种方式使得遥控器和家电设备之间解耦，也方便添加新的家电设备和命令。

总之，命令模式在需要将请求封装成对象、实现撤销和重做等功能时非常有用，它提供了一种灵活的方式来组织和管理代码。