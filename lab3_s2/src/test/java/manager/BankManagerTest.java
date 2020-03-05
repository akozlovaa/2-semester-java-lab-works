package manager;

import model.Service;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import manager.BankManager;

import java.util.List;

public class BankManagerTest extends BaseBankManagerTest {

    private BankManager bankManager;

    @BeforeEach
    public void setUp() {
        bankManager = new BankManager();

        createAll();

        bankManager.findServices(service);

    }

    @Test
    public void findServices() {
        List<Service> services = bankManager.findServices(service);
    }


}
