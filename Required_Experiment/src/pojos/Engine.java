package pojos;

import org.springframework.beans.factory.annotation.Required;

public class Engine {
  private String eng_name;
  private int model_year;
  @Required
  public void setEng_name(String eng_name) {
	this.eng_name = eng_name;
}
  public void setModel_year(int model_year) {
	this.model_year = model_year;
}
  public String getEng_name() {
	return eng_name;
}
  public int getModel_year() {
	return model_year;
}
}
