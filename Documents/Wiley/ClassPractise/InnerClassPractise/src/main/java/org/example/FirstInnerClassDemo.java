package org.example;

public class FirstInnerClassDemo {

    public static void main(String[] args) {
        FirstOuter firstOuterObj = new FirstOuter();
        firstOuterObj.inputValue(78);
        FirstOuter.FirstInner firstInnerObj = firstOuterObj.new FirstInner();

        firstInnerObj.inputNumber(6);
        firstInnerObj.displayNumber();

    }

}
