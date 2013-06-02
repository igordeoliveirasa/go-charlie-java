package br.com.igordeoliveirasa.charliemail;

/**
 *
 * @author igor
 */
public class SMTPFactory {
    public static final int SMTP_DEFAULT_PORT = 587;
    public static ISMTP build(String smtpHost, String username, String password, int port) {
        return new SimpleSMTP(smtpHost, username, password, port);
    }
}
