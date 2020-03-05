package manager;

import model.Credit;
import model.Deposit;
import model.Service;
import model.ServiceType;

import manager.BankManager;

import java.util.LinkedList;
import java.util.List;

public class BaseBankManagerTest {

    protected List<Service> credit;
    protected List<Service> deposit;
    protected List<Service> service;


    public void createCredit() {
        credit = new LinkedList<Service>();
        credit.add(new Credit(7, 20000, ServiceType.CREDIT));
        credit.add(new Credit(20, 70000, ServiceType.CREDIT));
    }

    public void createDeposit() {
        deposit = new LinkedList<Service>();
        deposit.add(new Deposit(9, 5, ServiceType.DEPOSIT));
        deposit.add(new Deposit(5, 2, ServiceType.DEPOSIT));
    }

    public void createService() {
        service = new LinkedList<Service>();
        service.add(new Service(10));
    }

    public void createAll() {
        createCredit();
        createDeposit();
    }

}
