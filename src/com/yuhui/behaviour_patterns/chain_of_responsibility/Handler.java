package com.yuhui.behaviour_patterns.chain_of_responsibility;

/**
 * javax.servlet.Filter#doFilter()
 * Apache Commons Chain
 * java.util.logging.Logger#log()
 */
public abstract class Handler {
    protected Handler successor;

    public Handler(Handler successor) {
        this.successor = successor;
    }

    protected  void handlerRequest(Request request){
    }
}
