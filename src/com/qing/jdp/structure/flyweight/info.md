享元模式（Flyweight Pattern）是一种结构型设计模式，旨在通过共享对象来减少内存使用和提高性能。它适用于需要创建大量细粒度的对象，但这些对象之间有许多共同的特性，可以被共享。

以下是一个使用 Java 示例来解释享元模式的简单情况：

假设你正在开发一个文字编辑器，用户可以在文档中添加不同的字符，每个字符都有字体、颜色等属性。在这个情况下，使用享元模式可以有效地共享相同字体和颜色的字符，以减少内存使用。