package staks.queue.structure;

public class Animal {
  private String type;

  public Animal(String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }

  @Override
  public String toString() {
    return "Animal{" +
      "type='" + type + '\'' +
      '}';
  }
}
