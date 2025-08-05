
package kutebabank;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class TransactionHistory {
    private final List<String> recentDeposits = new ArrayList<>();

    public void addDeposit(String info) {
        recentDeposits.add(info);
    }

    public List<String> getDeposits() {
        return recentDeposits;
    }
}

