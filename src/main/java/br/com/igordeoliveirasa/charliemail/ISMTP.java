package br.com.igordeoliveirasa.charliemail;

/**
 *
 * @author igor
 */
public interface ISMTP {
    public boolean sendTextMail(String from, String displayName, String to, String cc, String bcc, String subject, String message);
    public boolean sendTextMail(String from, String displayName, String[] toArray, String[] ccArray, String[] bccArray, String subject, String message);
    
    public boolean sendHTMLMail(String from, String displayName, String to, String cc, String bcc, String subject, String HTMLMessage);
    public boolean sendHTMLMail(String from, String displayName, String[] toArray, String[] ccArray, String[] bccArray, String subject, String HTMLMessage);
}
