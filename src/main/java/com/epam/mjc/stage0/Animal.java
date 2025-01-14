package com.epam.mjc.stage0;

       // 2. Provide it with 3 private fields - **color**(`String`),
// **numberOfPaws**(`int`), **hasFur**(`boolean`).
        //3. Add **constructor with full  parameters**.
// *Save the parameter order and names as it is listed in a second paragraph.*
       // 4. Add a methods `getDescription()`, witch would use class fields
// and return a string with such pattern **"This animal is mostly `(color)`.
// It has `(numberOfPaws)` paws and `('a'/'no' -> depends on value of hasFur)` fur."**
       // 5. **(Optional)**  *In the method `getDescription()` change the word **'paw'**
// depending on the `numberOfPaws`: number of paws is 1 -> 'paw',
// number of paws is different from 1 -> 'paws'.*

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String pawWord = (numberOfPaws == 1) ? "paw" : "paws";
        String hasFurWord = (hasFur) ? "a" : "no";
        return "This animal is mostly " + color + ". It has " + numberOfPaws + " " + pawWord + " and " + hasFurWord + " fur.";
    }

}
