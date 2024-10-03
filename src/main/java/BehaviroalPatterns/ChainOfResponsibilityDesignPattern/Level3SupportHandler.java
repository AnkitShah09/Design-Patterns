package BehaviroalPatterns.ChainOfResponsibilityDesignPattern;

public class Level3SupportHandler implements SupportHandler {

    SupportHandler nextHandler;

    @Override
    public void setNext(SupportHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handle(SupportRequest supportRequest) {
        if(Priority.HIGH == supportRequest.getPriority()) {
            System.out.println("This request is handled by Level3 Support Handler.");
        } else {
            System.out.println("This request cannot be handle by any support handler");
        }
    }
}
