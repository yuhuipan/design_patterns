package com.yuhui.behaviour_patterns.chain_of_responsibility;

public class Client {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1(null);
        Handler handler2 = new ConcreteHandler2(handler1);

        Request request1 = new Request(RequestType.Type1, "request1");
        handler2.handlerRequest(request1);

        Request request2 = new Request(RequestType.Type2, "request2");
        handler2.handlerRequest(request2);
    }
}
