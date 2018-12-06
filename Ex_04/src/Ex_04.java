
public class Ex_04 {

	public static void main(String[] args) 
	{
		//===========================01===========================
		{
			int wrt = 1;
			
			//Does wrt contained in set <0, +infinity)?
			System.out.println(wrt >= 0 ? "01: wrt     CONTAIN <0, +infinity)" : "01: wrt NOT CONTAIN <0, +infinity)");
			//Does wrt contained in set (-infinity, 1>
			System.out.println(wrt <= 1 ? "01: wrt     CONTAIN (-infinity, 1>" : "01: wrt NOT CONTAIN (-infinity, 1>");
			//Does wrt contained in set <0, 1>
			System.out.println(wrt >= 0 && wrt <= 1 ? "01: wrt     CONTAIN <0, 1>" : "01: wrt NOT CONTAIN <0, 1>");
		}
		
		//===========================02===========================
		//How many days from 2018 beginning?
			int month = 12;
			int day = 20;		
		//IF======================================================
		{
			if (month == 1)	   System.out.println("02(IF): Days from beginning 2018: " + --day);		
			else if (month == 2) System.out.println("02(IF): Days from beginning 2018: " + (31 + --day));
			else if (month == 3) System.out.println("02(IF): Days from beginning 2018: " + (31 + 28 + --day));
			else if (month == 4) System.out.println("02(IF): Days from beginning 2018: " + (31 + 28 + 31 + --day));
			else if (month == 5) System.out.println("02(IF): Days from beginning 2018: " + (31 + 28 + 31 + 30 + --day));
			else if (month == 6) System.out.println("02(IF): Days from beginning 2018: " + (31 + 28 + 31 + 30 + 31 + --day));
			else if (month == 7) System.out.println("02(IF): Days from beginning 2018: " + (31 + 28 + 31 + 30 + 31 + 30 + --day));
			else if (month == 8) System.out.println("02(IF): Days from beginning 2018: " + (31 + 28 + 31 + 30 + 31 + 30 + 31 + --day));
			else if (month == 9) System.out.println("02(IF): Days from beginning 2018: " + (31 + 28 + 31 + 30 + 31 + 30 + 31 + 30 + --day));
			else if (month == 10) System.out.println("02(IF): Days from beginning 2018: " + (31 + 28 + 31 + 30 + 31 + 30 + 31 + 30 + 31 + --day));
			else if (month == 11) System.out.println("02(IF): Days from beginning 2018: " + (31 + 28 + 31 + 30 + 31 + 30 + 31 + 30 + 31 + 30 + --day));
			else if (month == 12) System.out.println("02(IF): Days from beginning 2018: " + (31 + 28 + 31 + 30 + 31 + 30 + 31 + 30 + 31 + 30 + 31 + --day));
			else System.out.println("02(IF): Out of range");
		}
		
		//SWITCH==================================================
		day++; //refresh day value after --day in if statement
		{
			switch (month)
			{
				case 1: 
				{
					System.out.println("02(SWITCH): Days from beginning 2018: " + --day);	
					break;
				}
				case 2:
				{
					System.out.println("02(SWITCH): Days from beginning 2018: " + (31 + --day));
					break;
				}
				case 3:
				{
					System.out.println("02(SWITCH): Days from beginning 2018: " + (31 + 28 + --day));
					break;
				}
				case 4:
				{
					System.out.println("02(SWITCH): Days from beginning 2018: " + (31 + 28 + 31 + --day));
					break;
				}
				case 5:
				{
					System.out.println("02(SWITCH): Days from beginning 2018: " + (31 + 28 + 31 + 30 + --day));
					break;
				}
				case 6:
				{
					System.out.println("02(SWITCH): Days from beginning 2018: " + (31 + 28 + 31 + 30 + 31 + --day));
					break;
				}
				case 7:
				{
					System.out.println("02(SWITCH): Days from beginning 2018: " + (31 + 28 + 31 + 30 + 31 + 30 + --day));
					break;
				}
				case 8:
				{
					System.out.println("02(SWITCH): Days from beginning 2018: " + (31 + 28 + 31 + 30 + 31 + 30 + 31 + --day));
					break;
				}
				case 9:
				{
					System.out.println("02(SWITCH): Days from beginning 2018: " + (31 + 28 + 31 + 30 + 31 + 30 + 31 + 30 + --day));
					break;
				}
				case  10:
				{
					System.out.println("02(SWITCH): Days from beginning 2018: " + (31 + 28 + 31 + 30 + 31 + 30 + 31 + 30 + 31 + --day));
					break;
				}
				case 11:
				{
					System.out.println("02(SWITCH): Days from beginning 2018: " + (31 + 28 + 31 + 30 + 31 + 30 + 31 + 30 + 31 + 30 + --day));
					break;
				}
				case 12:
				{
					System.out.println("02(SWITCH): Days from beginning 2018: " + (31 + 28 + 31 + 30 + 31 + 30 + 31 + 30 + 31 + 30 + 31 + --day));
					break;
				}
				default: 
				{
					System.out.println("02(SWITCH): Out of range");
				}		
			}
		}
		
		//===========================03===========================
		//What jam in the jar?
		{
			int stawberry  = 0b0001;	//1
			int raspberry  = 0b0010;	//2
			int peach      = 0b0100;	//4
			int gooseberry = 0b1000;	//8
			
			int jar = stawberry + raspberry + peach + gooseberry;
			
			switch (jar)
			{
				case 1:
				{
					System.out.println("03: Strawberry jam");
					break;
				}
				case 2:
				{
					System.out.println("03: Raspberry jam");
					break;
				}
				case 3:
				{
					System.out.println("03: Strawberry and raspberry jam");
					break;
				}
				case 4:
				{
					System.out.println("03: Peach jam");
					break;
				}
				case 5:
				{
					System.out.println("03: Strawberry and peach jam");
					break;
				}
				case 6:
				{
					System.out.println("03: Raspberry and peach jam");
					break;
				}
				case 7:
				{
					System.out.println("03: Strawberry and raspberry and peach jam");
					break;
				}
				case 8:
				{
					System.out.println("03: Gooseberry jam");
					break;
				}
				case 9:
				{
					System.out.println("03: Strawberry and gooseberry jam");
					break;
				}
				case 10:
				{
					System.out.println("03: Raspberry and gooseberry jam");
					break;
				}
				case 11:
				{
					System.out.println("03: Strawberry and raspberry and gooseberry jam");
					break;
				}
				case 12:
				{
					System.out.println("03: Peach and gooseberry jam");
					break;
				}
				case 13:
				{
					System.out.println("03: Strawberry and peach and gooseberry jam");
					break;
				}
				case 14:
				{
					System.out.println("03: Raspberry and peach and gooseberry jam");
					break;
				}
				case 15:
				{
					System.out.println("03: Strawberry and raspberry and peach and gooseberry jam");
					break;
				}
				default:
				{
					System.out.println("03: Out of range");
				}
			}
			
			//===========================04===========================
			//What is the green component? Answer = 0b10100110 = 166
			//8 bits per component: alpha, red, green, blue
			{
				int ARGB = 370208;
				System.out.println("04: Green = " + ((ARGB & 0b11111111 << 8) >> 8));
			}
			
			//===========================05===========================
			{
				//Nothing special...
			}
			
			//===========================06===========================
			//Print numbers 1..10
			{
				System.out.print("06:");
				
				for (int i = 1; i<=10; i++)
				{
					System.out.print(" " + i);
				}
				
				System.out.println();
			}
			
			//===========================07===========================
			//Print every bit of wrt
			{
				System.out.print("07:");
				
				int wrt = 122;
								
				for (int i = 31; i >= 0; i--)
				{
					System.out.print(" " + (wrt & (1 << i)));
				}
				
				System.out.println();
			}
			
			//===========================08===========================
			//Print wrt * i
			{
				System.out.print("08:");
				
				int wrt = 5;
								
				for (int i = 31; i >= 0; i--)
				{
					System.out.print(" " + (wrt * i));
				}
				
				System.out.println();
			}
			
			//===========================09===========================
			//Show different between while and do-while
			{
				int wrt = 0;
				
				System.out.print("09(WHILE): ");
				while (wrt > 10)
				{
					System.out.print("Never done");
					wrt++;
				}
				
				System.out.println();
				System.out.print("09(DO-WHILE): ");
				do
				{					
					System.out.print("Code in the loop will execute always more than one time");
					wrt++;
				} while (wrt > 10);
			}
			
			//===========================10===========================
			//Print sum of geometric series 1/2^n
			{
				int n = 3;
				double sum = 0;
				
				for (int i = 1; i <= n; i++)
				{
					sum += 1 / (Math.pow(2, i));
				}
				
				System.out.println();
				System.out.print("10: " + sum);
			}
			
			//===========================11===========================
			//Print triangle
			{
				for (int i = 0; i <= 5; i++)
				{
					System.out.print("11: ");
					for (int j = 0; j < i; j++)
					{
						System.out.print("*");
					}
					
					System.out.println();
				}
			}
		}
	}
}
