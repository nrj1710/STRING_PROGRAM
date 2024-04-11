package stringprogram_new;

public class String_integer {

	public static void main(String[] args) {
		//abc();
		def();
			
		}
		
		static void abc() {
		String str ="java1234";
		String x =str.replace("1234","Program");
		System.out.println(x);
		
		String a= "6547";
		int b=30;
		int c= Integer.parseInt(a)+b;//how to convert string into integr
		System.out.println(c);
		
		String p= "java";
		
		int q=
				1234; //how to convert integr into string
		String r= p+String.valueOf(q);
		System.out.println(r);
				

	}
		static void def() {
			String str= "This is java selenium program";
			            //marg or pmui nelesava jsisihT
			
			String str1 = str.replace(" ", "");
            System.out.println(str1);
             String rev= "";
          for (int i =str1.length()-1; i>=0; i--) {                         //10 retain spaces
                  rev = rev + str1.charAt(i);
                     }
               System.out.println(rev);
                    String value="";
                       int j =0;
                      for (int i = 0; i <str.length(); i++) {
                        if(str.charAt(i)== ' ') {
                        value = value +  " ";
                             } else {
                         value = value +rev.charAt(j);
                               j=j+1;
                                         }
                                                }
                                  System.out.println(value);
                         }
	                

				
			}
	
		
			
		
	

