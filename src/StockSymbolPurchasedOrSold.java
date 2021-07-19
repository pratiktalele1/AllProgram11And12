import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import Utility.utilityForCompanySharesLinkList;

public class StockSymbolPurchasedOrSold {
	public static void main(String[] args) {
		
		
		
		PurchasedOrSold newnode1=new PurchasedOrSold();
		PurchasedOrSold newnode2=new PurchasedOrSold();
		PurchasedOrSold newnode3=new PurchasedOrSold();
		PurchasedOrSold newnode4=new PurchasedOrSold();
		PurchasedOrSold newnode5=new PurchasedOrSold();
		PurchasedOrSold newnode6=new PurchasedOrSold();
		
  
		newnode1.name=utilityForCompanySharesLinkList.getShareName();
		newnode1.share=utilityForCompanySharesLinkList.addShare();
		newnode1.action=utilityForCompanySharesLinkList.action();

		newnode2.name=utilityForCompanySharesLinkList.getShareName();
		newnode2.share=utilityForCompanySharesLinkList.addShare();
		newnode2.action=utilityForCompanySharesLinkList.action();
		
		newnode3.name=utilityForCompanySharesLinkList.getShareName();
		newnode3.share=utilityForCompanySharesLinkList.addShare();
		newnode3.action=utilityForCompanySharesLinkList.action();
		
		newnode4.name=utilityForCompanySharesLinkList.getShareName();
		newnode4.share=utilityForCompanySharesLinkList.addShare();
		newnode4.action=utilityForCompanySharesLinkList.action();
		
		newnode5.name=utilityForCompanySharesLinkList.getShareName();
		newnode5.share=utilityForCompanySharesLinkList.addShare();
		newnode5.action=utilityForCompanySharesLinkList.action();
		
		newnode6.name=utilityForCompanySharesLinkList.getShareName();
		newnode6.share=utilityForCompanySharesLinkList.addShare();
		newnode6.action=utilityForCompanySharesLinkList.action();
        
          
        newnode1.next=newnode2;       
        newnode2.next=newnode3;
        newnode3.next=newnode4;
        newnode4.next=newnode5;
        newnode5.next=newnode6;
        newnode6.next=null;
        
        
       for (int i=1;i<7;i++)
        {
            System.out.println("share is -"+newnode1.share+ " company name is -"+newnode1.name+" action-"+newnode1.action);
            
            newnode1=newnode1.next;        
        }
	}
}
