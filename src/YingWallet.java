import java.math.BigDecimal;

public class YingWallet extends wallet {

    public YingWallet(BigDecimal walletBalance) {
        super(walletBalance);
        setTransactionFees(2);
    }

    @Override
    public void topUp(BigDecimal amount) {
        System.out.println("Credit Alert !!!");
        System.out.println(amount + " Deposited");
        System.out.println("Your account has been credited with " + amount+"$. Your new Account balance is "+ getWalletBalance().add(amount));

    }
    @Override
    public void withdraw(BigDecimal amount) {
        System.out.println("Debit Alert");
        System.out.println("Note: There is a tiny transaction fee stipulation for any transaction done which is "+ TransactionFees);
        System.out.println("Your account has been debited with " + amount+"$. Your new Account balance is "+ getWalletBalance().subtract(TransactionFees).subtract(TransactionFees));
    }
}

