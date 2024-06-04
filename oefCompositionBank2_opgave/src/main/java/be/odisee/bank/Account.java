package be.odisee.bank;

/**
 * A financial account managed by a bank for making transactions
 */
class Account {   //package visibility!

    protected double balance;  //The current balance. use Currency for real life financial operations
    private final int accountNumber;  //The account number
    private static int nextAccountNbr = 0; // the account number used for the next instantiated account

    /**
     * Creates a new account with the next available account number
     */
    public Account() {
        balance = 0;
        accountNumber = nextAccountNbr;
        nextAccountNbr += 1;
    }

    /**
     * deposit an amount to increase the balance
     * @param amount positive non zero amount to add
     */
    public void deposit(final double amount) {
        if (amount>=0) {
            balance += amount;
        } else {
            //System.err.println("Account.deposit(...): cannot deposit negative amount.");   // SRP inbreuk: output EN balans wijzigen.
        }
    }

    /**
     * withdraw an amount decreasing the balance
     * @param amount positive amount, not larger than the balance
     */
    public void withdraw(final double amount) {
        if(amount< 0){
            //cannot withdraw negative amount.
            return;
        }

        if (amount<=balance) {
            balance -= amount;
        } else {
            // Cannot withdraw money that is not present
        }
    }

    /**
     * Current balance
     * @return Current balance
     */
    public double getBalance()
    {
        return balance;
    }

    /**
     * The unique account number tied to this account
     * @return account number
     */
    public double getAccountNumber()
    {
        return accountNumber;
    }

    /**
     * String representation of an account
     * @return String representation of an account
     */
    public String toString()
    {
        return "Account number " + accountNumber + ": " + "balance = " + balance;
    }

}
