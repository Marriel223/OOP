public class Dog {
    public String dogName;
    public boolean isMale;
    public int numberOfPuppies;
    public Dog[] puppies;
 
    public Dog(String name, boolean gender) {
        dogName = name; 
        isMale = gender; 
        numberOfPuppies = 0;
        puppies = new Dog[0];
    }
 
    public void setName(String name) {
        dogName = name; 
    }
 
    public String showName() {
        return dogName; 
    }
 
    public void bark() {
        System.out.println("Woof! Woof!");
    }
 
    public void addPuppy(Dog puppy) {
        Dog[] newPuppies = new Dog[puppies.length + 1];
        System.arraycopy(puppies, 0, newPuppies, 0, puppies.length);
        newPuppies[puppies.length] = puppy;
        puppies = newPuppies;
        setNumberOfPuppies(puppies.length);
    }
 
    public void setNumberOfPuppies(int number) {
        numberOfPuppies = number;  
    }
 
    public int showNumberOfPuppies() {
        return numberOfPuppies;  
    }
 
    public void showPuppies() {
        for (Dog puppy : puppies) {
            System.out.println(puppy.dogName);  
        }
    }
}
