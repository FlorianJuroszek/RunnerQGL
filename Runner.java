package fr.unice.polytech.si3.qgl.isc;

import java.nio.file.Path;
import java.nio.file.Paths;

import static eu.ace_design.island.runner.Runner.*;

public class Runner {

    // To run the code:  mvn -q exec:java -Dexec.args="../championships/week03/_map.json"
    public static void main(String[] args) throws Exception {

        if (args.length != 1) {
            throw new IllegalArgumentException("No map available, aborting");
        }

        Path mapLocation = Paths.get(args[0]);
        if (! mapLocation.toFile().exists()){
            throw new IllegalArgumentException("Your map does not exist, aborting");
        }

        run(Explorer.class)
                .exploring(mapLocation.toFile())
                .withName("isx")
                .withSeed(0x161D552A4A22E2A1L)
                .startingAt(159, 159, "NORTH")
                .backBefore(30000)
                .withCrew(15)
                .collecting(2000, "WOOD")
                .collecting(100,  "FUR")
                .collecting(400,   "QUARTZ")
                .collecting(2,   "RUM")
                .storingInto(".")
                .fire();
    }

    public void map11(String s) throws Exception {
        Path mapLocation = Paths.get(s);
        if (! mapLocation.toFile().exists()){
            throw new IllegalArgumentException("Your map does not exist, aborting");
        }

        run(Explorer.class)
                .exploring(mapLocation.toFile())
                .withName("isc")
                .withSeed(0x161D552A4A22E2A1L)
                .startingAt(1, 1, "EAST")
                .backBefore(20000)
                .withCrew(3)
                .collecting(7000, "WOOD")
                .collecting(20,   "QUARTZ")
                .collecting(5,   "FLOWER")
                .storingInto(".")
                .fire();

        run(Explorer.class)
                .exploring(mapLocation.toFile())
                .withName("isc")
                .withSeed(0x161D552A4A22E2A1L)
                .startingAt(1, 1, "SOUTH")
                .backBefore(20000)
                .withCrew(3)
                .collecting(7000, "WOOD")
                .collecting(20,   "QUARTZ")
                .collecting(5,   "FLOWER")
                .storingInto(".")
                .fire();

        run(Explorer.class)
                .exploring(mapLocation.toFile())
                .withName("isc")
                .withSeed(0x161D552A4A22E2A1L)
                .startingAt(159, 159, "NORTH")
                .backBefore(20000)
                .withCrew(3)
                .collecting(7000, "WOOD")
                .collecting(20,   "QUARTZ")
                .collecting(5,   "FLOWER")
                .storingInto(".")
                .fire();

        run(Explorer.class)
                .exploring(mapLocation.toFile())
                .withName("isc")
                .withSeed(0x161D552A4A22E2A1L)
                .startingAt(159, 159, "WEST")
                .backBefore(20000)
                .withCrew(3)
                .collecting(7000, "WOOD")
                .collecting(20,   "QUARTZ")
                .collecting(5,   "FLOWER")
                .storingInto(".")
                .fire();
    }
}