package com.yuhui.behaviour_patterns.chain_of_responsibility;

public class ConcreteHandler1 extends Handler {

    public ConcreteHandler1(Handler successor) {
        super(successor);
    }

    @Override
    protected void handlerRequest(Request request) {
        if (request.getType() == (RequestType.Type1)) {
            System.out.println(request.getName() + "is handle by ConcreteHandler1");
            return;
        }
        if (successor != null) {
            successor.handlerRequest(request);
        }
    }
}
