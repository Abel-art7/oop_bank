
package kutebabank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author lenovo
 */
public abstract class BankTransaction {
    protected String accId;
    protected double amount;

    public BankTransaction(String accId, double amount) {
        this.accId = accId;
        this.amount = amount;
    }

    public abstract void process();
}



