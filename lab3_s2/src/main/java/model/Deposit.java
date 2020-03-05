package model;

public class Deposit extends Service {

    public int duration;
    private ServiceType serviceType;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public Deposit(int interestRate, int duration, ServiceType serviceType) {
        super(interestRate);
        this.duration = duration;
        this.serviceType = serviceType;
    }

}
