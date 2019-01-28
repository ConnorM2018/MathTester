package com.LickingHeights;

public class Main {

    public static void main(String[] args) {
	int firstNumber, secondNumber;
	String firstWord, secondWord;
	firstWord = "dog";
	secondWord = "house";
    firstNumber = 5;
    secondNumber = 6;
    System.out.println("The + of firstNumber and secondNumber is "+(firstNumber+secondNumber));
    System.out.println("The - of firstNumber and secondNumber is "+(firstNumber-secondNumber));
    System.out.println("The * of firstNumber and secondNumber is "+(firstNumber*secondNumber));
    System.out.println("The / of firstNumber and secondNumber is "+(firstNumber/secondNumber));
    System.out.println("The modulus of the secondNumber by the firstNumber is "+(secondNumber%firstNumber));
    System.out.println(firstWord+(firstNumber+secondNumber));
    System.out.println(firstWord+secondWord);
    System.out.println(firstWord+firstNumber+secondWord+secondNumber);
    System.out.println(firstWord+(firstNumber+secondNumber)+secondWord);
    }
}
