package fr.unice.polytech.si3.qgl.isc;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class RunnerTest {


    @Test
    public void map1() {
        Runner run = new Runner();
        try{
            run.map11("src/main/resources/map11.json");
        }catch(Exception e){

        }
    }
//    @Test
//    public void map2() {
//        Runner run = new Runner();
//        try{
//            run.map12("src/main/resources/map12.json");
//        }catch(Exception e){
//
//        }
//    }
//    @Test
//    public void map3() {
//        Runner run = new Runner();
//        try{
//            run.map13("src/main/resources/map13.json");
//        }catch(Exception e){
//
//        }
//    }
}