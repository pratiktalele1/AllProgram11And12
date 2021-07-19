import java.util.Scanner;

import Utility.utilityForCompanySharesLinkList;

public class CompanySharesLinkList {
	public static void main(String[] args) {
		Node newnode1=new Node();    
        Node newnode2=new Node();    
        Node newnode3=new Node();    
        Node newnode4=new Node();
        Node newnode5=new Node();
        Node newnode6=new Node();
  
		newnode1.name=utilityForCompanySharesLinkList.getShareName();
		newnode1.share=utilityForCompanySharesLinkList.addShare();

		newnode2.name=utilityForCompanySharesLinkList.getShareName();
		newnode2.share=utilityForCompanySharesLinkList.addShare();
		
		newnode3.name=utilityForCompanySharesLinkList.getShareName();
		newnode3.share=utilityForCompanySharesLinkList.addShare();

		newnode4.name=utilityForCompanySharesLinkList.getShareName();
		newnode4.share=utilityForCompanySharesLinkList.addShare();
		
		newnode5.name=utilityForCompanySharesLinkList.getShareName();
		newnode5.share=utilityForCompanySharesLinkList.addShare();
		
		newnode6.name=utilityForCompanySharesLinkList.getShareName();
		newnode6.share=utilityForCompanySharesLinkList.addShare();
		
        
          
        newnode1.next=newnode2;       
        newnode2.next=newnode3;
        newnode3.next=newnode4;
        newnode4.next=newnode5;
        newnode5.next=newnode6;
        newnode6.next=null;
        
       for (int i=1;i<=4;i++)
        {
            System.out.println("share is -"+newnode1.share+ " company name is -"+newnode1.name);
            
            newnode1=newnode1.next;        
        }
	}
}
