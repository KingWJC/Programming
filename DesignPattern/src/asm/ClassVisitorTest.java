/*
 * @Author: KingWJC
 * @Date: 2021-06-30 18:22:53
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-06-30 18:35:06
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\asm\ClassVisitorTest.java
 */
package asm;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;

import static org.objectweb.asm.Opcodes.ASM4;

import java.io.IOException;

public class ClassVisitorTest extends ClassVisitor {

    public ClassVisitorTest() {
        super(ASM4);
    }

    @Override
    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        System.out.println(name + " extends " + superName + "{");
    }

    @Override
    public FieldVisitor visitField(int access, String name, String descriptor, String signature, Object value) {
        System.out.println("    " + name);
        return null;
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String descriptor, String signature,
            String[] exceptions) {
        System.out.println("    " + name + "()");
        return null;
    }

    @Override
    public void visitEnd() {
        System.out.println("}");
    }

    public static void main(String[] args) throws IOException {
        ClassVisitorTest cp = new ClassVisitorTest();
        //ClassReader cr = new ClassReader("java.lang.Runnable");
        ClassReader cr = new ClassReader(
            ClassVisitorTest.class.getClassLoader().getResourceAsStream("asm/T1.class"));
        cr.accept(cp, 0);
    }
}
