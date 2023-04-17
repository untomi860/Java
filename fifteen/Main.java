public class Main{
public static void main(String[] args) {
    Handler emailHandler = new SpamHandler(
        new FanHandler(
            new ComplaintHandler(
                new NewLocHandler(null))));
    Email eSpam = new Email(EmailType.Spam, "Dear Dir, I am a Migerian prince in need to transfer large sums of money outof the country. All i need is tour bank account number...");
    emailHandler.HandleRequest(eSpam);
            
    Email eFan = new Email(EmailType.Fan, "I love your gumball machines! Please stock them with more bubble-gum flavors");
    emailHandler.HandleRequest(eFan);

    Email eComplaint = new Email(EmailType.Complaint, "I swear, if i get one more black licorice flavored gumball. i am going to break your machines");
    emailHandler.HandleRequest(eComplaint);

    Email eOther = new Email(EmailType.Unclassified, "I swear, if i get one more black licorice flavored gumball. i am going to break your machines");
    emailHandler.HandleRequest(eOther);
}
}