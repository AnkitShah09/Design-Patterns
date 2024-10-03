package BehaviroalPatterns.ChainOfResponsibilityPattern;

public interface SupportHandler {

    void setNext(SupportHandler handler);
    void handle(SupportRequest supportRequest);

}
