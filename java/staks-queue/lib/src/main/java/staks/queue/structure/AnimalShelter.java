package staks.queue.structure;

public class AnimalShelter {
  private Queue<Animal> dogs;
  private Queue<Animal> cats;

  public AnimalShelter() {
    this.dogs = new Queue<>();
    this.cats = new Queue<>();
  }

  public void enqueue(Animal animal) {
    if(animal.getType().equalsIgnoreCase("dog")) {
      dogs.enqueue(animal);
    }
    else if (animal.getType().equalsIgnoreCase("cat")) {
      cats.enqueue(animal);
    }

    else {
      System.out.println("Animal is not either a dog or cat");
    }
  }

  public String dequeue (String pref) {
    if(pref.equalsIgnoreCase("dog") && !dogs.isEmpty()) {
      dogs.dequeue();
      return pref;
    }

    else if (pref.equalsIgnoreCase("cat") && !cats.isEmpty()) {
      cats.dequeue();
      return pref;
    }

    else {
      System.out.println("No such animal exists");
      return null;
    }
  }

  public Queue<Animal> getDogs() {
    return dogs;
  }

  public Queue<Animal> getCats() {
    return cats;
  }

  @Override
  public String toString() {
    return "AnimalShelter{" +
      "dogs=" + dogs+
      ", cats=" + cats +
      '}';
  }


}
