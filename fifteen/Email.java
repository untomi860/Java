public class Email {
    private EmailType type;
    private String message;

    public Email(EmailType type, String message) {
        this.type = type;
        this.message = message;
    }

    public EmailType getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }
}
