package pojo;

public class BmwEngine implements Engine
{
   private String seriesname;
   private int modelyear;
   public void setSeriesname(String seriesname) {
	this.seriesname = seriesname;
}
   public void setModelyear(int modelyear) {
	this.modelyear = modelyear;
}public BmwEngine() {
	// TODO Auto-generated constructor stub
}
public String getSeriesname() {
	return seriesname;
}
public int getModelyear() {
	return modelyear;
}
}
