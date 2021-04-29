package builder.inner;

/*
 * @Author: KingWJC
 * @Date: 2021-04-29 14:05:22
 * @LastEditors: KingWJC
 * @LastEditTime: 2021-04-29 14:32:49
 * @Descripttion: 
 * @FilePath: \DesignPattern\src\builder\inner\Person.java
 */
public class Person {
    String name;
    Integer age;
    Boolean sex;
    Double weight;
    Double height;
    String addr;
    String email;

    private Person() {
    }

    public static class PersonBuilder {
        Person person = new Person();

        public PersonBuilder basicInfo(String name, Integer age, Boolean sex) {
            person.age = age;
            person.name = name;
            person.sex = sex;
            return this;
        }

        public PersonBuilder bodyInfo(Double weight, Double height) {
            person.height = height;
            person.weight = weight;
            return this;
        }

        public PersonBuilder contactInfo(String addr, String email) {
            person.addr = addr;
            person.email = email;
            return this;
        }

        public Person build() {
            return person;
        }
    }

    @Override
    public String toString() {
        return name + age + sex;
    }
}
