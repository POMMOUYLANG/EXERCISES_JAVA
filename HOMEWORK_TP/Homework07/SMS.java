package Homework.Homework07;
public class SMS {
    private String subject;
    private String senderNumber;
    private String receiverNumber;
    private String type;
    private String content;
    private String status;

    public SMS(String senderNumber, String receiverNumber, String content) {
        this.senderNumber = senderNumber;
        this.receiverNumber = receiverNumber;
        this.content = status;
        status = "new";
    }
    public SMS(String senderNumber, String receiverNumber, String content, String subject) {
        this.senderNumber = senderNumber;
        this.receiverNumber = receiverNumber;
        this.content = content;
        this.subject = subject;
        status = "new";
    }
    public SMS(String subject, String senderNumber, String receiverNumber, String type, String content, String status) {
        this.subject = subject;
        this.senderNumber = senderNumber;
        this.receiverNumber = receiverNumber;
        this.type = type;
        this.content = content;
        this.status = status;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getSenderNumber() {
        return senderNumber;
    }
    public void setSenderNumber(String senderNumber) {
        this.senderNumber = senderNumber;
    }
    public String getReceiverNumber() {
        return receiverNumber;
    }
    public void setReceiverNumber(String receiverNumber) {
        this.receiverNumber = receiverNumber;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
