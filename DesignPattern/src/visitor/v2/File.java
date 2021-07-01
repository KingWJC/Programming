/*
 * @Author: KingWJC
 * @Date: 2021-07-01 17:29:54
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-01 18:13:43
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\visitor\v2\File.java
 */
package visitor.v2;

import java.util.HashSet;

public abstract class File {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void accept(Visitor visitor);
}

/**
 * @description: 普通文件
 */
class PlainFile extends File {
    private long size;

    public long getSize() {
        return size;
    }

    public PlainFile(String name, long fileSize) {
        setName(name);
        size = fileSize;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

/**
 * @description: 目录
 */
class Directory extends File {
    private HashSet<File> children = new HashSet<>();

    public File[] list() {
        // 泛型机制，new File[0]只为方法的返回值提供返回类型。
        return children.toArray(new File[0]);
    }

    public Directory(String name) {
        setName(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}