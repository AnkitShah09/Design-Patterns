package BehaviroalPatterns.ChainOfResponsibilityPattern;

public class Level1SupportHandler implements SupportHandler {

    SupportHandler nextHandler;

    @Override
    public void setNext(SupportHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handle(SupportRequest supportRequest) {
        if(Priority.LOW == supportRequest.getPriority()) {
            System.out.println("This request is handled by Level1 Support Handler.");
        } else if(this.nextHandler != null) {
            nextHandler.handle(supportRequest);
        }
    }
}
