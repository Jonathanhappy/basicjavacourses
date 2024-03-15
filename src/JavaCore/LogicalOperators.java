package JavaCore;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// && condition check
		int a = 14;
		int b = 12;

		/*
		 * true  && true  = true 
		 * true  && false = false 
		 * false && true  = false 
		 * false && false = false
		 */
		
		 boolean reponse = (a==14)&&(b==12);
		 System.out.println(reponse);
		 reponse = (a==14)&&(b==10);
		 System.out.println(reponse);
		 reponse = (a==10)&&(b==12);
		 System.out.println(reponse);
		 reponse = (a==10)&&(b==10);
		 System.out.println(reponse);
		 
		 if((a==14)&&(b==12)) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		 
		 /*
		 * true  || true  = true 
		 * true  || false = true 
		 * false || true  = true 
		 * false || false = false
		 */
		 if((a==14)||(b==12)) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		}
	 
		 

}
