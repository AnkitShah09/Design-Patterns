package BehaviroalPatterns.ChainOfResponsibilityDesignPattern;

public class Main {

    public static void main(String[] args) {
        SupportHandler level1SupportHandler = new Level1SupportHandler();
        SupportHandler level2SupportHandler = new Level2SupportHandler();
        SupportHandler level3SupportHandler = new Level3SupportHandler();

        level1SupportHandler.setNext(level2SupportHandler);
        level2SupportHandler.setNext(level3SupportHandler);

        SupportRequest supportRequest1 = new SupportRequest(Priority.LOW);
        SupportRequest supportRequest2 = new SupportRequest(Priority.MEDIUM);
        SupportRequest supportRequest3 = new SupportRequest(Priority.HIGH);
        SupportRequest supportRequest4 = new SupportRequest(Priority.CRITICAL);

        level1SupportHandler.handle(supportRequest1);
        level1SupportHandler.handle(supportRequest2);
        level1SupportHandler.handle(supportRequest3);
        level1SupportHandler.handle(supportRequest4);

    }
}
