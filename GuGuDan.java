import java.util.Scanner;

public class GuGuDan {
	String dan;
		GuGuDan(){}
			
				void guguCalc(){
						System.out.println("원하는 구구단을 입력하세요(Q : 종료) : ");
								Scanner sc = new Scanner(System.in);
										while(true){
													System.out.print(sc + "단  ");
																dan = sc.nextLine();
																			
																						if(dan.equals("Q"))
																										break;
																													else if(Integer.parseInt(dan)>1 && Integer.parseInt(dan)<10){
																																	for(int i=1; i<10; ++i){
																																						if(i%2==0)
																																												System.out.printf("%d * %d = %d\n",Integer.parseInt(dan),i,Integer.parseInt(dan)*i);
																																																	else
																																																							System.out.printf("%d * %d = %d     ",Integer.parseInt(dan),i,Integer.parseInt(dan)*i);
																																																											}
																																																															System.out.println();
																																																																		}
																																																																					else
																																																																									System.out.println("잘 못된 입력입니다.");		
																																																																												
																																																																														}
																																																																															}

																																																																															}

