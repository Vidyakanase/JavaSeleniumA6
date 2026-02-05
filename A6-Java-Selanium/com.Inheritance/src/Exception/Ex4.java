package Exception;

public class Ex4 {

	public static void main(String[] args) 
	{
	 System.out.println	("Main Start");
	 try {
		 calculation(10,0);
	     }
	 catch(Exception e)
	     {
		  e.printStackTrace();
	     }
          System.out.println("Main End");
	      }
          public static void calculation(int a,int b)throws Exception
          {
	         div(a,b);
          }
          public static void div(int a,int b)throws Exception {
		}  
          {
			int b;
			int a;
			System.out.println(a/b);
            }

          


	
		
	}

}
