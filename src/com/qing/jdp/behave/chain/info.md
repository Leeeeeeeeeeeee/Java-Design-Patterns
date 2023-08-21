职责链模式（Chain of Responsibility Pattern）是一种行为型设计模式，它允许你将请求沿着处理链传递，直到有一个处理者能够处理该请求为止。这种模式将请求的发送者和接收者解耦，使得多个对象都有机会处理请求，而不需要显式地指定处理者。

职责链模式的核心思想是将一系列处理对象组成链条，每个处理对象都可以处理请求，如果一个处理对象无法处理该请求，它会将请求传递给链条中的下一个处理对象，直到请求被处理或者到达链条的末尾。

该模式的主要角色包括：

处理者（Handler）： 定义一个处理请求的接口，通常包含一个处理方法。处理者可以是抽象类或接口，其中包含一个指向下一个处理者的引用，以形成处理链。

具体处理者（Concrete Handler）： 实现处理者接口，实现处理请求的具体逻辑。如果它无法处理请求，可以将请求传递给下一个处理者。

客户端（Client）： 创建处理链并将请求发送到处理链的起始处。

职责链模式的主要优点包括：

解耦请求发送者和接收者： 请求发送者无需知道实际的接收者是谁，从而降低了对象之间的耦合度。
动态修改处理链： 可以动态地添加、移除或修改处理者，改变处理链的结构。
避免请求被未处理： 如果没有处理者能够处理请求，可以防止请求被未处理而导致错误。
一个简单的例子是使用职责链模式来处理不同级别的日志记录。假设有多个日志处理者，分别处理不同级别的日志消息（例如，INFO、WARNING、ERROR）。日志消息将从链的起始处传递，直到找到一个能够处理该级别的处理者。如果没有处理者能够处理该级别的消息，消息就会被忽略。