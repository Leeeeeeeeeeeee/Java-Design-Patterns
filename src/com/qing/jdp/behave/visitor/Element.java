package com.qing.jdp.behave.visitor;

//元素接口
interface Element {
 double accept(Visitor visitor);
}
