package app.SpaServiceJOX;

public class SpaService {

    private String serviceDescription;
    private double price;

    public SpaService(){
        serviceDescription = "Massage";
        price = 1000;
    }

    public void setServiceDescription(String service) {
        serviceDescription = service;
    }

    public void setPrice(double priceService) {
        price = priceService;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public double getPrice(){
        return price;
    }
    
}