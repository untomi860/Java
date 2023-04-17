public class SpamHandler extends Handler {
    public SpamHandler(Handler successor) {
        super(successor);
    }

    public void HandleRequest(Email email) {
        if (email.getType() == EmailType.Spam) {
            System.out.println("Spam Handler is handing the following message ...");
            System.out.println("Deleting the following e-mail ...");
            System.out.println(email.getMessage());
            System.out.println();
        } else if (_successor != null) {
            _successor.HandleRequest(email);
        }
    }
}
