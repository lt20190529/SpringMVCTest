package test.InvocationHandlerAndProxy.jdkimpl;

public class Teacher implements  People {

    @Override
    public String Work() {
        System.out.println("老师教书育人!");
        return "教书";
    }
}
