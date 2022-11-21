import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class ButtonListener implements ActionListener
{
	
   private Measurable[] objs;
   private String metrics;
   //private String description;
   
   public ButtonListener(Measurable[] objects,String metric)
   {
		setMetrics(metric);
		getMetrics();
		setObjs(objects);
		getObjs();
   }
  
   public Measurable[] getObjs() {
	return objs;
}

public void setObjs(Measurable[] objs) {
	this.objs = objs;
}

public String getMetrics() {
	return metrics;
}

public void setMetrics(String metrics) {
	this.metrics = metrics;
}






  public void actionPerformed(ActionEvent event)
   {
      // The listener method accesses the account variable  from the surrounding block
	  double results = 0;
	  
	   if (metrics=="Minimum")
	   {
		   results = Data.min(objs);
	   }
	   if (metrics=="Maximum")
	   
	   {
		   results = Data.max(objs);
	   }
	   if (metrics=="Average") 
	   
	   {
		   results = Data.average(objs);
	   }
      if (objs[0].getClass().getName().equals("BankAccount")) 
      
      {
    	  System.out.println(metrics + " Account Balance is "+results);
      }
      if (objs[0].getClass().getName().equals("Country")) 
      
      {
    	  System.out.println(metrics + " Country Area is "+results);
      }
      if (objs[0].getClass().getName().equals("Quiz")) 
      
      {
    	  System.out.println(metrics + " Quiz Score is "+results);
      }
      
   }
}
