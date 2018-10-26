package chapter_11;

import java.io.*;

public interface State extends Serializable {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
    void refill(int numberGumballs);
}
