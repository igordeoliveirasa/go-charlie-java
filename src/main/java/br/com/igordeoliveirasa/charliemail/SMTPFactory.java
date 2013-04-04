/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.igordeoliveirasa.charliemail;

/**
 *
 * @author igor
 */
public class SMTPFactory {
    public static ISMTP build(String smtpHost, String username, String password) {
        return new AuthSMTP(smtpHost, username, password);
    }
}
