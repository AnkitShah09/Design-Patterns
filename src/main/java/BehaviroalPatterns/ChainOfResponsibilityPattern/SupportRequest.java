package BehaviroalPatterns.ChainOfResponsibilityPattern;

public class SupportRequest {

    Priority priority;
    public SupportRequest(Priority priority) {
        this.priority = priority;
    }

    public Priority getPriority() {
        return priority;
    }

}
