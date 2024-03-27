/**
 * Authors:
 *  - Jamison Grudem(grude013)
 *  - Manan Mrig (mrig0001)
 */

public class Account {
    // Keeps track of the last assigned uid
    private static int uidCounter = 0;
    // Unique identifier for the account
    private int uid;
    // The balance of the account
    private int balance;

    /**
     * Initialize a new account with next uid and a balance of 0
     */
    public Account() {
        this.uid = uidCounter++;
        this.balance = 0;
    }

    /**
     * Initialize a new account with a given uid and a balance of 0
     * @param uid
     */
    public Account(int uid) {
        this.uid = uid;
        this.balance = 0;
    }

    /**
     * Retrieves the unique identifier of the account
     * @return The unique identifier of the account
     */
    public int getUid() {
        return this.uid;
    }

    /**
     * Retrieves the balance of the account
     * @return The balance of the account
     */
    public int getBalance() {
        return this.balance;
    }
    /**
     * Updates the balance of the account
     * @param balance The new balance of the account
     */
    public void setBalance(int balance) {
        this.balance = balance;
    }
}
