/*
 * @Author: KingWJC
 * @Date: 2021-07-06 13:49:35
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-06 14:05:08
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\memento\V3\BeanUtils.java
 * 
 * 通过反射，设置和获取当前对象的属性。
 * 
 */
package memento.V4;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

public class BeanUtils {
    public static HashMap<String, Object> bacckProps(Object bean) {
        HashMap<String, Object> pMap = new HashMap<>();
        try {
            BeanInfo bInfo = Introspector.getBeanInfo(bean.getClass());
            PropertyDescriptor[] pd = bInfo.getPropertyDescriptors();
            for (PropertyDescriptor des : pd) {
                String fieldName = des.getName();
                Method method = des.getReadMethod();
                Object filedValue = method.invoke(bean, new Object[] {});
                if (!fieldName.equalsIgnoreCase("class")) {
                    pMap.put(fieldName, filedValue);
                }
            }
        } catch (IntrospectionException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return pMap;
    }

    public static void restoreProps(Object bean, HashMap<String, Object> sMap) {
        try {
            BeanInfo bInfo = Introspector.getBeanInfo(bean.getClass());
            PropertyDescriptor[] pd = bInfo.getPropertyDescriptors();
            for (PropertyDescriptor des : pd) {
                String fieldName = des.getName();
                if (sMap.containsKey(fieldName)) {
                    Method method = des.getWriteMethod();
                    method.invoke(bean, new Object[] { sMap.get(fieldName) });
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}