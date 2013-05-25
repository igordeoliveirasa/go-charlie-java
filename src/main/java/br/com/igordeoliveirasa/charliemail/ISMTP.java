package br.com.igordeoliveirasa.charliemail;

/**
 *
 * @author igor
 */
public interface ISMTP {
    public boolean sendTextMail(String from, String to, String cc, String bcc, String subject, String message);
    public boolean sendTextMail(String from, String[] toArray, String[] ccArray, String[] bccArray, String subject, String message);
    
    public boolean sendHTMLMail(String from, String to, String cc, String bcc, String subject, String HTMLMessage);
    public boolean sendHTMLMail(String from, String[] toArray, String[] ccArray, String[] bccArray, String subject, String HTMLMessage);
}
