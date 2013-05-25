package br.com.igordeoliveirasa.mail.test;


import br.com.igordeoliveirasa.charliemail.SMTPFactory;
import br.com.igordeoliveirasa.charliemail.ISMTP;
import junit.framework.TestCase;

/**
 *
 * @author igor
 */
public class SMTPFactoryTest extends TestCase {
    public final String PASSWORD = "Umg0erre";
    
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
    public void testSendTextMailHelloWorld() {
        ISMTP smtp = SMTPFactory.build("smtp.prateleiravirtual.com", "contato@prateleiravirtual.com", PASSWORD);
        boolean ret = smtp.sendTextMail("contato@prateleiravirtual.com", 
                new String[] {"igordeoliveirasa@gmail.com"}, 
                null, 
                null, 
                "CharlieSMTPFactory Test", 
                "Olá\n\nEste foi o teste!");        
        assertTrue(ret);
    }
    
    public void testSendHTMLMailHelloWorld() {
        ISMTP smtp = SMTPFactory.build("smtp.prateleiravirtual.com", "contato@prateleiravirtual.com", PASSWORD);
        boolean ret = smtp.sendHTMLMail("contato@prateleiravirtual.com", 
                new String[] {"igordeoliveirasa@gmail.com"}, 
                null, 
                null, 
                "CharlieSMTPFactory Test", 
                "Olá, este foi o teste em <b>negrito</b>!");        
        assertTrue(ret);
    }
}
