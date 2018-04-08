package fr.unice.polytech.si3.qgl.isc;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class RunnerTest {

    @Test
    public void map10() {
        Runner run = new Runner();
        try{
            run.map10("src/main/resources/map10.json");
        }catch(Exception e){

        }
    }

    @Test
    public void map11() {
        Runner run = new Runner();
        try{
            run.map11("src/main/resources/map11.json");
        }catch(Exception e){

        }
    }

    @Test
    public void map12() {
        Runner run = new Runner();
        try{
            run.map12("src/main/resources/map12.json");
        }catch(Exception e){

        }
    }
    @Test
    public void map13() {
        Runner run = new Runner();
        try{
            run.map13("src/main/resources/map13.json");
        }catch(Exception e){

        }
    }
    @Test
    public void map14() {
        Runner run = new Runner();
        try{
            run.map14("src/main/resources/map14.json");
        }catch(Exception e){

        }
    }
}