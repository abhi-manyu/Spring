package pojos;

import org.springframework.beans.factory.annotation.Required;

public class Engine {
    private int model_year;
    private long price;
    
    public void setModel_year(int model_year) {
		this.model_year = model_year;
	}
    @Required
    public void setPrice(long price) {
		this.price = price;
	}
    public int getModel_year() {
		return model_year;
	}
    public long getPrice() {
		return price;
	}
}
