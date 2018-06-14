package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random rn = new Random();
        int listitems = rn.nextInt(6) + 5;
        List<R> robots = new ArrayList<R>();

        for (int i = 0; i < listitems; i++) {
            R robot = new R();
            robot.percentageOfLife = rn.nextInt(100);
            robots.add(robot);
        }

        Collections.sort(robots, (R a, R b) -> a.percentageOfLife - b.percentageOfLife);
        System.out.println("the list of robot ordered by percentage of life of the robots :");

        for (int i = 0; i < listitems; i++) {
            System.out.println(robots.get(i).percentageOfLife);
        }

        System.out.println("the list of robot that has more than 50% of life :");
        List<R> filtered = new ArrayList<R>();
        for (R rbt : robots) {
            if (rbt.percentageOfLife >= 50) {
                filtered.add(rbt);
            }
        }

        for (int i = 0; i < filtered.size(); i++) {
            System.out.println(filtered.get(i).percentageOfLife);
        }

        System.out.println("The THREE robots that have the highest percentage of life :");
        int startIndex = listitems - 3;
        for (int i = startIndex; i < listitems; i++) {
            System.out.println(robots.get(i).percentageOfLife);
        }
    }
}

class R {
    int percentageOfLife;
}