package VedioRental;

import java.util.Scanner;

public class VideoStore {
	Video v[]=new Video[10];

	private String title;

    static int i=0;

    void addVideo(String title)
    {
    	 v[i]=new Video();
          this.title=title;
          v[i].title=title;
          i++;
System.out.println("Video Added Successfully");
System.out.println(" ");
    }

    void checkOut(String title) {
    	for(int k=0;k<i;k++)

          {
               if(v[k].title.equalsIgnoreCase(title)){
                    if(v[k].checked()){
                    v[k].rent();
                    System.out.println("Video is rented !!");
                    System.out.println(" ");
                    }
                    else if(v[k].title.equals(title)) {
                    	System.out.println("Successfully Rented !!");
                    	System.out.println(" ");
                    }
                    else{
                          System.out.println("OOPS !! Video not available.");
                          System.out.println(" ");
                    }
               }
          }
    }
   public void returnVideo(String title){
    	if(i==0)
          {
               System.out.println("You have no video to return");
          }
          if(i>0)
        	  {
        	  /*for(int k=0;k<i;k++)
        	  }
          {
               if(v[k].title.equalsIgnoreCase(title)){
            	   
                    v[k].checked=true;*/
                    System.out.println("Video Returned Successfully !!");
                    System.out.println(" ");
               }
              	          
        }
    

    public void receiveRating()

    {
    	if(i==0){
               System.out.println("No Video in Inventory.");
          }
          else{
               for(int k=0;k<i;k++)
               {
                    System.out.println("Enter the rating for video: "+v[k].title);
                    Scanner ob=new Scanner(System.in);
                    v[k].avgrating=ob.nextInt();
               }
               System.out.println(" ");
         }
    }

    public void listInventory(){
    if(i==0)
    {
    	System.out.println("No Video in Inventory.");
    }
   else
   {
   for(int k=0;k<i;k++)
     {
      System.out.println(k+1 +". "+v[k].title+" "+"|| Rating:   "+v[k].avgrating+"|| Availability: "+v[k].checked());  
     }
   System.out.println(" ");
     }
    }
}  
