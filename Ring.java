
public class Ring {
	
	Fighter f1;
	Fighter f2;
	int minWeight;
	int maxWeight;
	
	public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
		this.f1 = f1;
		this.f2 = f2;
		this.maxWeight = maxWeight;
		this.minWeight = minWeight;
	}
	
	public void run() {
		System.out.println("Welcome The Boxing Tournament");
		System.out.println("First fighter name\t: " + f1.name + " \nFirst fighter health\t: " + f1.healt);
        System.out.println("===========================");
		System.out.println("Second fighter name\t: " + f2.name + "\nSecond fighter health\t: " + f2.healt);
		int round = 1;
		if(checkWeight()) {
			
			double firstHit = Math.random();
			
			if(firstHit > 0.5) {
                System.out.println("\nFirst hit\t\t: " + f1.name );
				while(f1.healt > 0 && f2.healt > 0) {
					System.out.print("\nRound : " + round);
                    System.out.println("");
					round++;
					f2.healt = f1.hit(f2);
					if(isWin()) {
						break;
					}
					f1.healt = f2.hit(f1);
					if(isWin()) {
						break;
					}
					printScore();
				}
		
			}
			else {
                System.out.println("\nFirst hit\t\t: " + f2.name );
				while(f1.healt > 0 && f2.healt > 0) {
					f1.healt = f2.hit(f1);
					if(isWin()) {
						break;
					}
					f2.healt = f1.hit(f2);
					if(isWin()) {
						break;
						
					}
					printScore();
				}
			}
		}else {
			System.out.println("The weights of the athletes do not match.");
		}
	}
	
	
	public boolean isWin() {
		if(f1.healt <= 0) {
			System.out.println("Match Winner : " + f2.name);
			return true;
		} else if(f2.healt <= 0) {
			System.out.println("Match Winner : "+ f1.name);
			return true;
		}
		return false;
	}
	
	public boolean checkWeight() {
		return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight <= minWeight && f2.weight <= maxWeight);
		
	}
	
	
	public void printScore() {
		System.out.println("-------------");
		System.out.println(f1.name + " remaining Health : " + f1.healt);
		System.out.println(f2.name + " remaining Health : " + f2.healt);
        System.out.println("-------------");
	}
	

}
