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

    public void map12(String s) throws Exception {
        Path mapLocation = Paths.get(s);
        if (! mapLocation.toFile().exists()){
            throw new IllegalArgumentException("Your map does not exist, aborting");
        }

        run(Explorer.class)
                .exploring(mapLocation.toFile())
                .withName("isc")
                .withSeed(0xAB3DB02B0F1D78C6L)
                .startingAt(1, 1, "EAST")
                .backBefore(20000)
                .withCrew(12)
                .collecting(4000, "WOOD")
                .collecting(20,   "QUARTZ")
                .collecting(1000,   "FUR")
                .collecting(5,   "RUM")
                .storingInto(".")
                .fire();

        run(Explorer.class)
                .exploring(mapLocation.toFile())
                .withName("isc")
                .withSeed(0xAB3DB02B0F1D78C6L)
                .startingAt(1, 1, "SOUTH")
                .backBefore(20000)
                .withCrew(12)
                .collecting(4000, "WOOD")
                .collecting(20,   "QUARTZ")
                .collecting(1000,   "FUR")
                .collecting(5,   "RUM")
                .storingInto(".")
                .fire();

        run(Explorer.class)
                .exploring(mapLocation.toFile())
                .withName("isc")
                .withSeed(0xAB3DB02B0F1D78C6L)
                .startingAt(159, 159, "NORTH")
                .backBefore(20000)
                .withCrew(12)
                .collecting(4000, "WOOD")
                .collecting(20,   "QUARTZ")
                .collecting(1000,   "FUR")
                .collecting(5,   "RUM")
                .storingInto(".")
                .fire();

        run(Explorer.class)
                .exploring(mapLocation.toFile())
                .withName("isc")
                .withSeed(0xAB3DB02B0F1D78C6L)
                .startingAt(159, 159, "WEST")
                .backBefore(20000)
                .withCrew(12)
                .collecting(4000, "WOOD")
                .collecting(20,   "QUARTZ")
                .collecting(1000,   "FUR")
                .collecting(5,   "RUM")
                .storingInto(".")
                .fire();
    }

    public void map13(String s) throws Exception {
        Path mapLocation = Paths.get(s);
        if (! mapLocation.toFile().exists()){
            throw new IllegalArgumentException("Your map does not exist, aborting");
        }

        run(Explorer.class)
                .exploring(mapLocation.toFile())
                .withName("isc")
                .withSeed(0xB8743F260B1D24EFL)
                .startingAt(159, 159, "NORTH")
                .backBefore(15000)
                .withCrew(7)
                .collecting(7000, "WOOD")
                .collecting(20,   "QUARTZ")
                .collecting(400,   "SUGAR_CANE")
                .collecting(5,   "RUM")
                .collecting(4,"ORE")
                .storingInto(".")
                .fire();

        run(Explorer.class)
                .exploring(mapLocation.toFile())
                .withName("isc")
                .withSeed(0xB8743F260B1D24EFL)
                .startingAt(159, 159, "WEST")
                .backBefore(15000)
                .withCrew(7)
                .collecting(7000, "WOOD")
                .collecting(20,   "QUARTZ")
                .collecting(400,   "SUGAR_CANE")
                .collecting(5,   "RUM")
                .collecting(4,"ORE")
                .storingInto(".")
                .fire();

        run(Explorer.class)
                .exploring(mapLocation.toFile())
                .withName("isc")
                .withSeed(0xB8743F260B1D24EFL)
                .startingAt(1, 1, "EAST")
                .backBefore(15000)
                .withCrew(7)
                .collecting(7000, "WOOD")
                .collecting(20,   "QUARTZ")
                .collecting(400,   "SUGAR_CANE")
                .collecting(5,   "RUM")
                .collecting(4,"ORE")
                .storingInto(".")
                .fire();

        run(Explorer.class)
                .exploring(mapLocation.toFile())
                .withName("isc")
                .withSeed(0xB8743F260B1D24EFL)
                .startingAt(1, 1, "SOUTH")
                .backBefore(15000)
                .withCrew(7)
                .collecting(7000, "WOOD")
                .collecting(20,   "QUARTZ")
                .collecting(400,   "SUGAR_CANE")
                .collecting(5,   "RUM")
                .collecting(4,"ORE")
                .storingInto(".")
                .fire();
    }

    public void map14(String s) throws Exception {
        Path mapLocation = Paths.get(s);
        if (! mapLocation.toFile().exists()){
            throw new IllegalArgumentException("Your map does not exist, aborting");
        }

        run(Explorer.class)
                .exploring(mapLocation.toFile())
                .withName("isc")
                .withSeed(0xF8C2F759DFAC20BAL)
                .startingAt(1, 1, "EAST")
                .backBefore(10000)
                .withCrew(4)
                .collecting(7000, "WOOD")
                .collecting(500,   "FUR")
                .collecting(5,   "FLOWER")
                .storingInto(".")
                .fire();

        run(Explorer.class)
                .exploring(mapLocation.toFile())
                .withName("isc")
                .withSeed(0xF8C2F759DFAC20BAL)
                .startingAt(1, 1, "SOUTH")
                .backBefore(10000)
                .withCrew(4)
                .collecting(7000, "WOOD")
                .collecting(500,   "FUR")
                .collecting(5,   "FLOWER")
                .storingInto(".")
                .fire();

        run(Explorer.class)
                .exploring(mapLocation.toFile())
                .withName("isc")
                .withSeed(0xF8C2F759DFAC20BAL)
                .startingAt(159, 159, "NORTH")
                .backBefore(10000)
                .withCrew(4)
                .collecting(7000, "WOOD")
                .collecting(500,   "FUR")
                .collecting(5,   "FLOWER")
                .storingInto(".")
                .fire();

        run(Explorer.class)
                .exploring(mapLocation.toFile())
                .withName("isc")
                .withSeed(0xF8C2F759DFAC20BAL)
                .startingAt(159, 159, "WEST")
                .backBefore(10000)
                .withCrew(4)
                 .collecting(7000, "WOOD")
                .collecting(500,   "FUR")
                .collecting(5,   "FLOWER")
                .storingInto(".")
                .fire();
    }

    public void map10(String s) throws Exception {
        Path mapLocation = Paths.get(s);
        if (! mapLocation.toFile().exists()){
            throw new IllegalArgumentException("Your map does not exist, aborting");
        }

        run(Explorer.class)
                .exploring(mapLocation.toFile())
                .withName("isc")
                .withSeed(0x49FCBBF35EDDC6EAL)
                .startingAt(1, 1, "EAST")
                .backBefore(15000)
                .withCrew(7)
                .collecting(7000, "WOOD")
                .collecting(20,   "QUARTZ")
                .storingInto(".")
                .fire();

        run(Explorer.class)
                .exploring(mapLocation.toFile())
                .withName("isc")
                .withSeed(0x49FCBBF35EDDC6EAL)
                .startingAt(1, 1, "SOUTH")
                .backBefore(15000)
                .withCrew(7)
                .collecting(7000, "WOOD")
                .collecting(20,   "QUARTZ")
                .storingInto(".")
                .fire();
        run(Explorer.class)
                .exploring(mapLocation.toFile())
                .withName("isc")
                .withSeed(0x49FCBBF35EDDC6EAL)
                .startingAt(159, 159, "NORTH")
                .backBefore(15000)
                .withCrew(7)
                .collecting(7000, "WOOD")
                .collecting(20,   "QUARTZ")
                .storingInto(".")
                .fire();

        run(Explorer.class)
                .exploring(mapLocation.toFile())
                .withName("isc")
                .withSeed(0x49FCBBF35EDDC6EAL)
                .startingAt(159, 159, "WEST")
                .backBefore(15000)
                .withCrew(7)
                .collecting(7000, "WOOD")
                .collecting(20,   "QUARTZ")
                .storingInto(".")
                .fire();
    }
}