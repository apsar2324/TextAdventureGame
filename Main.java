package beginning;

import java.util.Scanner;


public class Main {
    
	Scanner Scanner = new Scanner(System.in);
    String a,b,walk;
    int w1,w2,w3;
    String[] Wp = {"","Knife","Lighter","Backpack","Gun"};
    String[] lr = {"Right","Left"};
    String LR;
    
    
    
    public void greet() {
        System.out.println("Welcome to the Adventurous game!!");
        System.out.println("if you want to continue Press - ");
       a = Scanner.nextLine();
       
        if(a.equals("-"))
             {
        System.out.println("In This Game You are stranded in a forest. You are choices are important for your survival");
        
        System.out.println("Press 1 to Continue");
        
             }
        b = Scanner.nextLine();
         if(b.equals("1")) {
	        	System.out.println("Alright..");
	        	System.out.println("You can choose two objects from below list, What Will Do you Choose:");
	        	System.out.println("1. Knife");
	        	System.out.println("2. Lighter");
	        	System.out.println("3. Backpack");
	        	System.out.println("4. Gun");
	        	
	        	System.out.println("Before u Choosing any of these,I Want to let u know that forest is Raining "
	        			+ "for the past five days and lots of Dangerous animal Habitat in that.  ");
	        	 w1 = Scanner.nextInt();
	             w2 = Scanner.nextInt();
	             
	             Scanner.nextLine();
	             		System.out.println("You have Selected: "+Wp[w1]+" & "+Wp[w2]);
	             		System.out.println("Good Choice, Let's Begin");	             			           
	             		
	        }             
         } 			
         	
        		 
             public void gameEnd(){
                 System.out.println("Thanks for Playing");
                 System.out.println("Bye!!");
                 System.exit(0);
             }
             public void gameOver(){
                 System.out.println("Game Over");
                 System.out.println("Bye!!");
                 System.exit(0);
             }
    
    
    			public void stageSelect() {
    				System.out.println("Now You Have Two Ways on Your Front. You have to take a Crucial Step");
    				System.out.println("Right one : Muddy Yet clear Floor");
    				System.out.println("Left One : Dense and Leafy ");
    				System.out.println("Which one do you Pick? L (Or) R");
    				LR = Scanner.nextLine();
    				if(LR.equalsIgnoreCase("R")) {
	             			System.out.println("Muddy Road, It is ");
	             		}
    				else if(LR.equalsIgnoreCase("L")) {
    					System.out.println("OOH!, Sense of Adventure. Dense Route./n Foolish yet Brave");
    				}
    			}
    			
    			public void Stage1() {
    				System.out.println("Press w To walk");
    				if(LR.equalsIgnoreCase("L")) {
    					
    					walk = Scanner.nextLine();
    					for(int i =0; i<2 ; i++) {
    						if(walk.equals("w")) {
    								System.out.println("You are Walking in a Dense Forest, Keep Walking");
    								walk = Scanner.nextLine();
    							}
    							else {
    									System.out.println("You've Not started walking, Walk! Adventure Awaits");
    									walk = Scanner.nextLine();
    									if(walk.equals("w")) {
    										System.out.print("You reached Uncharted Terrain");
    									}
    									break;
    								}
    						}
						System.out.println("You reached Uncharted Terrain");
						System.out.println("There is a branch on your way, You have to get rid of it.");
						
						if(Wp[w1].equals("Knife")||Wp[w2].equals("Knife")) {
							System.out.println("You have knife to cut down the branches");
							System.out.println("Do You want to Cut it? Y/N");
							String YN = Scanner.nextLine();
							if(YN.equalsIgnoreCase("y")) {
								System.out.println("Cutting up the Branches...");
								System.out.println("You've Got a Clear Way");
								System.out.println("You Reached the Seashore, Now You can get Help");
								gameEnd();
							}
							
							else if(YN.equalsIgnoreCase("n")) {
								System.out.println("You have Nowhere To go");
								System.out.println("Game Over");
								
							}
							
						}
						else if(Wp[w1].equals("Lighter")||Wp[w2].equals("Lighter")) {
							System.out.println("You Don't have knife to cut down the branches");
							System.out.println("Instead You can Burn Down Branches WARNING!! It May Lead To Fire Everywhere");
							String yn;
							yn = Scanner.nextLine();
							if(yn.equalsIgnoreCase("y")) {
								System.out.println("Lighting up the Branches...");
								System.out.println("You've Got a Clear Way");
								System.out.println("You Reached the Seashore, Now You can get Help");
								gameEnd();
							}
							else if(yn.equalsIgnoreCase("n")) {
								System.out.println("You have Nowhere To go");
								System.out.println("Game Over");
							}
						}
						
						
						
    					}
    				
    				
    				if(LR.equalsIgnoreCase("R")) {
    					
    					walk = Scanner.nextLine();
    					for(int i =0; i<2 ; i++) {
    						if(walk.equals("w")) {
    								System.out.println("You are Walking in a Muddy Road, Keep Walking");
    								walk = Scanner.nextLine();
    							}
    							else {
    									System.out.println("You've Not started walking, Walk! Adventure Awaits");
    									walk = Scanner.nextLine();
    									if(walk.equals("w")) {
    										System.out.print("You reached Uncharted Terrain");
    									}
    									break;
    								}
    						}
						System.out.println("You reached Uncharted Terrain");
						
						System.out.println("There Might be Poisonous Snakes And Dangerous Animals Around You, Be Careful, Use Your Things Effectively");
						System.out.println("Now There are ThreeWays in Your Front");
						System.out.println("Left: Dense Forest");
						System.out.println("Right: Unknown Terrain (Might Be Animals Lurking in)");
						System.out.println("Straight: Looks Safe May Get To the Seashore");
						System.out.println("Choose L/S/R");
						
						String Dir = Scanner.nextLine();
						if(Dir.equalsIgnoreCase("R")) {
							System.out.println("You've Reached Seashore Now You can Get Help");
							gameEnd();
						}
						else if(Dir.equalsIgnoreCase("L")) {
							System.out.println("You're Walking To Dense Forest");
							System.out.println("There is a branch on your way, You have to get rid of it.");
							
							if(Wp[w1].equals("Knife")||Wp[w2].equals("Knife")) {
								System.out.println("You have knife to cut down the branches");
								System.out.println("Do You want to Cut it? Y/N");
								String YN = Scanner.nextLine();
								if(YN.equalsIgnoreCase("y")) {
									System.out.println("Cutting up the Branches...");
									System.out.println("You've Got a Clear Way");
									System.out.println("You Reached the Seashore, Now You can get Help");
									gameEnd();
								}
								
								else if(YN.equalsIgnoreCase("n")) {
									System.out.println("You have Nowhere To go");
									System.out.println("Game Over");
									
								}
								
							}
						 }
						else if(Dir.equalsIgnoreCase("S")) {
							System.out.println("You've Entered into Animal's Den");
							gameOver();
						}
						
						
    					}
    				
    				
    				}
    			
    			
    			
    			
    			
  
    
    		public static void main(String[] args) {
    				Main m = new Main();
    				m.greet();
    				m.stageSelect();
    				m.Stage1();
    		}

   
}

