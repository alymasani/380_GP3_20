package edu.ucalgary.oop;

import java.security.PrivateKey;
import java.security.PublicKey;

public class Inquirer {
    private String FIRST_NAME;
    private String LAST_NAME;
    private String INFO;
    private String SERVICES_PHONE;

    public Inquirer(String FIRST_NAME, String LAST_NAME,
                    String SERVICES_PHONE, String INFO){
        this.FIRST_NAME = FIRST_NAME;
        this.LAST_NAME = LAST_NAME;
        this.SERVICES_PHONE = SERVICES_PHONE;
        this.INFO = INFO;
    }

    public String getFIRST_NAME(){return this.FIRST_NAME;}
    public String getLAST_NAME(){return this.LAST_NAME;}
    public String getINFO(){return this.INFO;}
    public String getSERVICES_PHONE(){return this.SERVICES_PHONE;}
}
