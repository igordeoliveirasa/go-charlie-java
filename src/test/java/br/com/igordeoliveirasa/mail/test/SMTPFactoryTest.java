package br.com.igordeoliveirasa.mail.test;


import br.com.igordeoliveirasa.charliemail.SMTPFactory;
import br.com.igordeoliveirasa.charliemail.ISMTP;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.TestCase;
import org.apache.commons.io.FileUtils;

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
    /*
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
    */
    public void testSendHTMLMailHelloWorld() {
        ISMTP smtp = SMTPFactory.build("smtp.prateleiravirtual.com", "contato@prateleiravirtual.com", PASSWORD);
        
        
        String message="";
        try {
            message = FileUtils.readFileToString(new File("/Users/igor/Desktop/tmp/index.html"), "utf-8");
        } catch (IOException ex) {
            fail();
        }
        
        
        boolean ret = smtp.sendHTMLMail("contato@prateleiravirtual.com", 
                new String[] {
                    "igor.deoliveirasa@facebook.com",
                    "igordeoliveirasa@gmail.com", 
                    "mligordeoliveirasa@gmail.com", 
                    "debrynha_portilho@hotmail.com", 
                    "deboraportilho@bol.com.br",
                    "deboraportilhogarcia@gmail.com",
                "debora.portilho.3@facebook.com",
                "pr_barcelos@hotmail.com"   
                }, 
                null, 
                null, 
                "Ração Medium Mature Cães Médio Porte Acima de 7 Anos", 
                message);
        assertTrue(ret);
    }
    
    
    
}
