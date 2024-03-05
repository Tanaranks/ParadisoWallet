import java.math.BigDecimal;

public class YangWallet extends YingWallet {
    public YangWallet(BigDecimal walletBalance) {
        super(walletBalance);
        setTransactionFees(5);
    }

    @Override
    public void topUp(BigDecimal amount){
        super.topUp(amount);
    }
    @Override
    public void withdraw(BigDecimal amount){
        super.withdraw(amount);
    }
}
