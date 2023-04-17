public class FanHandler extends Handler {
    public FanHandler (Handler successor) {
    super(successor);
    }
    public void handleRequest(Email email) {
        if (email.getType() == EmailType.Fan) {
            System.out.println("Fan Handler is handling the following message ...");
            System.out.println("Sending to the CEO ...");
            System.out.println(email.getMessage());
            System.out.println();
        }
        else if (_successor != null) {
            _successor.HandleRequest(email);
        }
    }
}    