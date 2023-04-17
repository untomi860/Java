public class ComplaintHandler extends Handler {

    public ComplaintHandler(Handler successor) {
        super(successor);
    }


    public void handleRequest(Email email) {
        if (email.getType() == EmailType.Complaint) {
            System.out.println("Spam Handler is handling the following message ...");
            System.out.println("Deleting the following e-mail ...");
            System.out.println(email.getMessage());
            System.out.println();
        } else if (_successor != null) {
            _successor.HandleRequest(email);
        }
    }
}
