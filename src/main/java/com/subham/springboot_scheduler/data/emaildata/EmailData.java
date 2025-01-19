package com.subham.springboot_scheduler.data.emaildata;


public class EmailData {
    private String recipient;
    private String msgBody;
    private String subject;
    private String attachment;

    public EmailData(){}

    public EmailData(String recipient, String msgBody, String subject, String attachment) {
        this.recipient = recipient;
        this.msgBody = msgBody;
        this.subject = subject;
        this.attachment = attachment;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getMsgBody() {
        return msgBody;
    }

    public String getSubject() {
        return subject;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public void setMsgBody(String msgBody) {
        this.msgBody = msgBody;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }
}
