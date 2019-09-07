package com.yuhui.behaviour_patterns.chain_of_responsibility;

public class ConcreteHandler2 extends Handler {

    public ConcreteHandler2(Handler successor) {
        super(successor);
    }

    @Override
    protected void handlerRequest(Request request) {
        if (request.getType() == (RequestType.Type2)) {
            System.out.println(request.getName() + "is handle by ConcreteHandler2");
            return;
        }
        if (successor != null) {
            successor.handlerRequest(request);
        }
    }
}
