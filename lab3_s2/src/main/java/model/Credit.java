package model;

public class Credit extends Service {

    private int moneyLoaned;
    private ServiceType serviceType;

    public int getMoneyLoaned() {
        return moneyLoaned;
    }

    public void setMoneyLoaned(int moneyLoaned) {
        this.moneyLoaned = moneyLoaned;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public Credit(int interestRate, int moneyLoaned, ServiceType serviceType) {
        super(interestRate);
        this.moneyLoaned = moneyLoaned;
        this.serviceType = serviceType;
    }
}
