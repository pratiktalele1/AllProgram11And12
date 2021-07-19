import Utility.utilityForCompanySharesLinkList;

public class DateTimeOfTheTransaction {
	public static void main(String[] args) {
		DateTimeQueue newnode1=new DateTimeQueue();
		DateTimeQueue newnode2=new DateTimeQueue();
		DateTimeQueue newnode3=new DateTimeQueue();
		DateTimeQueue newnode4=new DateTimeQueue();
		DateTimeQueue newnode5=new DateTimeQueue();
		DateTimeQueue newnode6=new DateTimeQueue();
		
		
  
		newnode1.name=utilityForCompanySharesLinkList.getShareName();
		newnode1.share=utilityForCompanySharesLinkList.addShare();
		newnode1.action=utilityForCompanySharesLinkList.action();
		newnode1.dateTime=utilityForCompanySharesLinkList.dateTime();

		newnode2.name=utilityForCompanySharesLinkList.getShareName();
		newnode2.share=utilityForCompanySharesLinkList.addShare();
		newnode2.action=utilityForCompanySharesLinkList.action();
		newnode2.dateTime=utilityForCompanySharesLinkList.dateTime();
		
		newnode3.name=utilityForCompanySharesLinkList.getShareName();
		newnode3.share=utilityForCompanySharesLinkList.addShare();
		newnode3.action=utilityForCompanySharesLinkList.action();
		newnode3.dateTime=utilityForCompanySharesLinkList.dateTime();
		
		newnode4.name=utilityForCompanySharesLinkList.getShareName();
		newnode4.share=utilityForCompanySharesLinkList.addShare();
		newnode4.action=utilityForCompanySharesLinkList.action();
		newnode4.dateTime=utilityForCompanySharesLinkList.dateTime();
		
		newnode5.name=utilityForCompanySharesLinkList.getShareName();
		newnode5.share=utilityForCompanySharesLinkList.addShare();
		newnode5.action=utilityForCompanySharesLinkList.action();
		newnode5.dateTime=utilityForCompanySharesLinkList.dateTime();
		
		newnode6.name=utilityForCompanySharesLinkList.getShareName();
		newnode6.share=utilityForCompanySharesLinkList.addShare();
		newnode6.action=utilityForCompanySharesLinkList.action();
		newnode6.dateTime=utilityForCompanySharesLinkList.dateTime();
          
        newnode1.next=newnode2;       
        newnode2.next=newnode3;
        newnode3.next=newnode4;
        newnode4.next=newnode5;
        newnode5.next=newnode6;
        newnode6.next=null;
        
        
       for (int i=1;i<7;i++)
        {
            System.out.println("share is -"+newnode1.share+ " company name is -"+newnode1.name+" action-"+newnode1.action+" time date -"+newnode1.dateTime);
            
            newnode1=newnode1.next;        
        }
	}
	
}

