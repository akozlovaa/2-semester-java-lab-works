package manager;

import model.AbstractBank;
import model.Service;

import java.util.LinkedList;
import java.util.List;

public class BankManager {

    private List<AbstractBank>banks = new LinkedList<AbstractBank>();
    private List<Service>services = new LinkedList<Service>();

    public List<Service> findServices(List<Service> creditOrDebit) {
        LinkedList<Service> result = new LinkedList<Service>();
        for (Service service: services) {
           if (service.getInterestRate() > 0) {
               result.add(service);
           }
        }
        return result;
    }



}
