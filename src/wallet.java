import java.math.BigDecimal;

abstract public class wallet {
    protected BigDecimal WalletBalance;
    protected BigDecimal TransactionFees;

    public wallet(BigDecimal walletBalance) {
        WalletBalance = walletBalance;
    }

    public void setTransactionFees(Double transactionFees) {
        TransactionFees = BigDecimal.valueOf(transactionFees);
    }

    public void setTransactionFees(int transactionFees) {
        TransactionFees = BigDecimal.valueOf(transactionFees);
    }

        public BigDecimal getWalletBalance () {
            return WalletBalance;
        }
    public abstract void topUp(BigDecimal amount);
    public abstract void withdraw(BigDecimal amount);

    }




