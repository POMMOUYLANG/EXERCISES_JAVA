package Homework.Homework07;

import java.util.ArrayDeque;

public class SMSList {
    private static ArrayDeque<SMS> smsList = new ArrayDeque<>();;
    
    private final static int max_characters_per_sms = 160;
    
    public SMSList() {
    }
    
    public void add(SMS sms) {
        smsList.add(sms);
    }

    public void add(String msg) {
        msg = msg.substring(0, max_characters_per_sms);
        SMS sms = new SMS("", "", msg);
        smsList.add(sms);
    }
    
    public void add(String msg, String title) {
        msg = msg.substring(0, max_characters_per_sms);
        SMS sms = new SMS("", "", msg, title);
        smsList.add(sms);
    }
    
    public ArrayDeque<SMS> getSmsList() {
        return smsList;
    }

    public void removeLast() {
        smsList.removeLast();
    }

    public void remove(SMS m) {
        smsList.remove(m);
    }

    public int listSize() {
        return smsList.size();
    }

}
