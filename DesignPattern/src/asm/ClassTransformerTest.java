/*
 * @Author: KingWJC
 * @Date: 2021-06-30 18:36:30
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-06-30 18:42:52
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\asm\ClassTransformerTest.java
 */
package asm;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import org.objectweb.asm.*;
import static org.objectweb.asm.Opcodes.*;

public class ClassTransformerTest {
    public static void main(String[] args) throws Exception {
        ClassReader cr = new ClassReader(
                ClassPrinter.class.getClassLoader().getResourceAsStream("asm/T1.class"));

        ClassWriter cw = new ClassWriter(0);
        ClassVisitor cv = new ClassVisitor(ASM4, cw) {
            @Override
            public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
                MethodVisitor mv = super.visitMethod(access, name, descriptor, signature, exceptions);
                //return mv;
                return new MethodVisitor(ASM4, mv) {
                    @Override
                    public void visitCode() {
                        visitMethodInsn(INVOKESTATIC, "com/mashibing/dp/ASM/TimeProxy","before", "()V", false);
                        super.visitCode();
                    }
                };
            }
        };

        cr.accept(cv, 0);
        byte[] b2 = cw.toByteArray();

        MyClassLoader cl = new MyClassLoader();
        //Class c = cl.loadClass("com.mashibing.dp.ASM.Tank");
        cl.loadClass("com.mashibing.dp.ASM.TimeProxy");
        Class c2 = cl.defineClass("com.mashibing.dp.ASM.Tank", b2);
        c2.getConstructor().newInstance();


        String path = (String)System.getProperties().get("user.dir");
        File f = new File(path + "/com/mashibing/dp/ASM/");
        f.mkdirs();

        FileOutputStream fos = new FileOutputStream(new File(path + "/com/mashibing/dp/ASM/Tank_0.class"));
        fos.write(b2);
        fos.flush();
        fos.close();
    }
}

class MyClassLoader extends ClassLoader {
    public Class defineClass(String name, byte[] b) {
        return defineClass(name, b, 0, b.length);
    }
}