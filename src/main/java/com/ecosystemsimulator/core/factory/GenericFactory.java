package main.java.com.ecosystemsimulator.core.factory;

public class GenericFactory<T>{

    private final Class<T> type;
    public GenericFactory(Class <T> type){
        this.type = type;

    }

    public T createInstance() throws InstantiationException, IllegalAccessException{
        return type.newInstance();
    }


}
