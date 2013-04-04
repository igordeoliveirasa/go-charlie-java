package br.com.igordeoliveirasa.charliemail;

/**
 *
 * @author igor
 */
public interface ISMTP {
    public boolean sendMail(String from, String to, String cc, String bcc, String subject, String message);
    public boolean sendMail(String from, String[] toArray, String[] ccArray, String[] bccArray, String subject, String message);
}
