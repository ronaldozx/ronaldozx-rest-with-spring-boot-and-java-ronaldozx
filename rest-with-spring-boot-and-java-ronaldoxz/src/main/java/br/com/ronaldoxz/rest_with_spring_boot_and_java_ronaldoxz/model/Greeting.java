package br.com.ronaldoxz.rest_with_spring_boot_and_java_ronaldoxz.model;

public class Greeting {

    private final long id;
    private final String content;

    Greeting(long id, String content){
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
