/*
 * @Author: KingWJC
 * @Date: 2021-07-06 10:33:42
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-07-06 10:43:39
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\strategy\EnumSortor.java
 */
package strategy;

public enum EnumSortor {
    NAME("name") {
        public int compara(People a, People b) {
            if (a.getName().length() > b.getName().length())
                return 1;
            if (a.getName().length() < b.getName().length())
                return -1;
            return 0;
        }
    },
    AGE("age") {
        public int compara(People a, People b) {
            if (a.getAge() > b.getAge())
                return 1;
            if (a.getAge() < b.getAge())
                return -1;
            return 0;
        }
    };

    private String _value;

    EnumSortor(String value) {
        this._value = value;
    }

    public abstract int compara(People a, People b);
}