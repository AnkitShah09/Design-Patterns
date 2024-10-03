package BehaviroalPatterns.ChainOfResponsibilityPattern;

public class Level2SupportHandler implements SupportHandler {

    SupportHandler nextHandler;

    @Override
    public void setNext(SupportHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handle(SupportRequest supportRequest) {
        if(Priority.MEDIUM == supportRequest.getPriority()) {
            System.out.println("This request is handled by Level2 Support Handler.");
        } else if(this.nextHandler != null) {
            nextHandler.handle(supportRequest);
        }
    }
}
