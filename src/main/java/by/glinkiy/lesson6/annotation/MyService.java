package by.glinkiy.lesson6.annotation;

import java.util.Objects;

@Version(isActive = true)
public class MyService {

    private int a = 10;
    private String version = "Nougat";


    private void thisClassInfo() {
        System.out.println("Class version: " + version);
        this.getClass().getMethods();
    }

    private void privateMethod() {
        System.out.println("FROM PRIVATE: a value is: " + a);
    }

    public void publicMethod() {
        System.out.println("FROM PUBLIC: a value is: " + a);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyService myService = (MyService) o;
        return a == myService.a &&
                Objects.equals(version, myService.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, version);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}