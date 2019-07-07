public class Eagle extends Animal implements Fly {

	//attributs
	private int meters;

    //Constructeur
    public Eagle(String name, int age, int meters) {
        super(name, age);
        this.meters = meters;
    }

    //getters & setters
    public int getMeters() {
        return meters;
    }
    
    public void setMeters(int meters) {
        this.meters = meters;
    } 

    @Override
    public void takeOff() {
        System.out.println("Eye Cherry takes off in the sky.");
    }

    @Override
    public int ascend(int meters) {
        this.setMeters(meters + this.getMeters());
        System.out.println("Eye Cherry flies upward, altitude : " + this.getMeters());
        return this.getMeters();
    }
    @Override
    public int descend(int meters) {
        this.setMeters(this.getMeters() - meters);
        System.out.println("Eye Cherry flies downward, altitude : " + this.getMeters());
        return this.getMeters();
    }

    @Override
    public void land() {
        if (this.getMeters() > 1) {
    		System.out.println("Eye Cherry is too high, it can't lands.");
    	}
    	else {
    		System.out.println("Eye Cherry is lands on the ground.");
    	}
    }
}