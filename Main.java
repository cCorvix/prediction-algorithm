import java.util.*;

public class Main {
  public void main() throws InterruptedException {

    boolean hasFur = false;
    boolean isBig = false;
    boolean eatsMeat = false;
    boolean isDomesticated = false;
    boolean hasClaws = false;
    boolean hasHooves = false;

    String hasFurResponse = "null";
    String isBigResponse = "null";
    String eatsMeatResponse = "null";
    String isDomesticatedResponse = "null";
    String hasClawsResponse = "null";
    String hasHoovesResponse = "null";

    IO.println("Welcome to the guessing game!");
    
    Thread.sleep(1500);
    
    IO.println("Think of one of these animals: \nCow, sheep, lion, horse, dog, cat, zebra");
    
    Thread.sleep(4000);
    
    IO.println("Got it? Good. now remember it.");
    
    Thread.sleep(1500);
    
    IO.println("Yes or no answers only!");
    
    Thread.sleep(1000);
    
    IO.println("does your animal have fur?");
    hasFurResponse = IO.readln();
    
    if (hasFurResponse.equals("yes")) {
      hasFur = true;
    } else {
      hasFur = false;
    }
    
    IO.println("is your animal big?");
    isBigResponse = IO.readln();
    
    if (isBigResponse.equals("yes")) {
      isBig = true;
    } else {
      isBig = false;
    }

    IO.println("Does your animal eat meat?");
    eatsMeatResponse = IO.readln();

    if (eatsMeatResponse.equals("yes")) {
      eatsMeat = true;
    } else {
      eatsMeat = false;
    }

    IO.println("is your animal domesticated?");
    isDomesticatedResponse = IO.readln();

    if (isDomesticatedResponse.equals("yes")) {
      isDomesticated = true;
    } else {
      isDomesticated = false;
    }

    IO.println("does your animal have hooves?");
    hasHoovesResponse = IO.readln();

    if (hasHoovesResponse.equals("yes")) {
      hasHooves = true;
    } else {
      hasHooves = false;
    }

    IO.println("does your animal have claws?");
    hasClawsResponse = IO.readln();

    if (hasClawsResponse.equals("yes")) {
      hasClaws = true;
    } else {
      hasClaws = false;
    }

    IO.println("ok. i think i know!");

    if (hasFur == true && hasClaws == true && eatsMeat == true && isBig == true && isDomesticated == false && hasHooves == false) {

      IO.println("You were thinking of a Lion!");

    } else if (hasFur == true && hasClaws == false && eatsMeat == false && isBig == false && isDomesticated == true && hasHooves == false) {

      IO.println("You were thinking of a Sheep!");

    } else if (hasFur == false && hasClaws == false && eatsMeat == false && isBig == true && isDomesticated == true && hasHooves == false) {

      IO.println("You were thinking of a Cow!");

    } else if (hasFur == false && hasClaws == false && eatsMeat == false && isBig == true && isDomesticated == true && hasHooves == true) {

      IO.println("You were thinking of a Horse!");

    } else if (hasFur == true && hasClaws == false && eatsMeat == true && isBig == false && isDomesticated == true && hasHooves == false) {

      IO.println("You were thinking of a Dog!");

    } else if (hasFur == true && hasClaws == true && eatsMeat == true && isBig == false && isDomesticated == true && hasHooves == false) {

      IO.println("You were thinking of a Cat!");

    } else if (hasFur == false && hasClaws == false && eatsMeat == false && isBig == true && isDomesticated == false && hasHooves == true) {

      IO.println("You were thinking of a Zebra!");

    } else {

      IO.println("Actually i dont know. you stumped me!");

    }




  }
}
