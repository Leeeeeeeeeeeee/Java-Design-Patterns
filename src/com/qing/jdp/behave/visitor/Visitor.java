package com.qing.jdp.behave.visitor;

//访问者接口
interface Visitor {
 double visit(Book book);
 double visit(ElectronicProduct electronicProduct);
}
