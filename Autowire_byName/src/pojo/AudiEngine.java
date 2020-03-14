package pojo;

public class AudiEngine implements Engine
{
	private String seriesname;
    private int modelyear;
   
   public void setModelyear(int modelyear)
    {
	  this.modelyear = modelyear;
    }
   public int getModelyear()
   {
	 return modelyear;
   }
   public void setSeriesname(String seriesname) {
	this.seriesname = seriesname;
}
   public String getSeriesname() {
	return seriesname;
}
}
