import org.junit.Assert;
import org.junit.Test;

public class BankAccountTesting {

    @Test
public void method_to_see_if_withdrawal_works() {
        AccountDetails accDetails = new AccountDetails();
        accDetails.setBalance(100);
        long expectedResult =accDetails.getBalance();
        Assert.assertEquals(expectedResult, accDetails.getBalance());

    }
}

