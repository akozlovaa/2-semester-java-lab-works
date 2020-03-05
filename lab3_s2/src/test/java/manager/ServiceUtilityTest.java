package manager;

import org.junit.jupiter.api.Test;
import model.*;
import manager.*;


public class ServiceUtilityTest extends BaseBankManagerTest {

    @Test
    public void testAscendingSort() {
        ServiceUtility.sortServices(ServiceType.CREDIT, SortBy.INTEREST, SortType.ASCENDING);
    }

}
