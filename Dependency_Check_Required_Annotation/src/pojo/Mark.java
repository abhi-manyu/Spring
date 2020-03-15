package pojo;

import org.springframework.beans.factory.annotation.Required;

public class Mark
{
    private int mark_scored;
    
    @Required
    public void setMark_scored(int mark_scored)
    {
		this.mark_scored = mark_scored;
	}
    
    public int getMark_scored()
    {
		return mark_scored;
	}
}
