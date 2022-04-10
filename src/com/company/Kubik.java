package com.company;

import java.util.Random;

public class Kubik {
    public static int random() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }


    public static void cube(int a) {
        int i = 0;
        switch (a) {
            case (1)-> {
                System.out.print("""
                        +---------+
                        |         |
                        |    #    |
                        |         |
                        +---------+
                        """);
            }
            case (2) -> {
                System.out.print("""
                        +---------+
                        |#        |
                        |         |
                        |        #|
                        +---------+
                        """);
            }

            case (3)-> {
                System.out.print("""
                        +---------+
                        |#        |
                        |    #    |
                        |        #|
                        +---------+
                        """);
            }

            case (4)-> {
                System.out.print("""
                        +---------+
                        |#       #|
                        |         |
                        |#       #|
                        +---------+
                        """);
            }

            case (5) ->{
                System.out.print("""
                        +---------+
                        |#       #|
                        |    #    |
                        |#       #|
                        +---------+
                        """);
            }
            case (6) ->
                    System.out.print("""
                        +---------+
                        |#       #|
                        |#       #|
                        |#       #|
                        +---------+
                        """);
            default -> {

            }
        }

    }
}

