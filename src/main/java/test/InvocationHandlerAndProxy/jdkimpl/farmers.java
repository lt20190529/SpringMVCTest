package test.InvocationHandlerAndProxy.jdkimpl;

public class farmers implements People {
    @Override
    public String Work() {
        System.out.println("农民开田种地!");
        return "种地";
    }
}
