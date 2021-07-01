/*
 * @Author: KingWJC
 * @Date: 2021-07-01 17:29:54
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-01 17:56:22
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\visitor\v1\File.java
 */
package visitor.v1;

import java.util.HashSet;

public abstract class File {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
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
}