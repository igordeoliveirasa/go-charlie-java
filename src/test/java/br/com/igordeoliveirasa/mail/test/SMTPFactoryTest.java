package br.com.igordeoliveirasa.mail.test;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import br.com.igordeoliveirasa.charliemail.SMTPFactory;
import br.com.igordeoliveirasa.charliemail.ISMTP;
import junit.framework.TestCase;

/**
 *
 * @author igor
 */
public class SMTPFactoryTest extends TestCase {
    public final String PASSWORD = "YOUR_PASSWORD_HERE";
    
    public SMTPFactoryTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    // TODO add test methods here. The name must begin with 'test'. For example:
    public void testHelloWorld() {
        ISMTP smtp = SMTPFactory.build("smtp.prateleiravirtual.com", "contato@prateleiravirtual.com", PASSWORD);
        boolean ret = smtp.sendMail("contato@prateleiravirtual.com", 
                new String[] {"igordeoliveirasa@gmail.com"}, 
                null, 
                null, 
                "CharlieSMTPFactory Test", 
                "Olá\n\nEste foi o teste!");        
        assertTrue(ret);
    }
}
