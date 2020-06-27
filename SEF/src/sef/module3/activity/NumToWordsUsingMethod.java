/**
 * 
 */
package sef.module3.activity;

/**
 * @author 
 *
 */
public class NumToWordsUsingMethod {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			for (int i=8; i<=10;++i);{ 
		
			printMyWord (8); // complete the code to print text value of 8, 9 and 10

		}
		}
		private static void printMyWord(int i) {
			final String numText;
			switch(i) {
			case 1:
				numText = "EIGHT";break;
							
			case 2:
				numText = "NINE";break;
			case 3:
				numText = "TEN";break;
			default:
				numText = "NUMBER " + i;
			}
			System.out.println(numText);
			
		}


		

	}
