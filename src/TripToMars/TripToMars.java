package TripToMars;

import java.util.Scanner;

public class TripToMars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read grid upper-right corner
        int maxX = sc.nextInt();
        int maxY = sc.nextInt();

        // Read rover's initial position and direction
        int x = sc.nextInt();
        int y = sc.nextInt();
        char dir = sc.next().charAt(0);

        // Read movement commands
        String commands = sc.next();

        boolean outOfBoundary = false;

        // Process each command
        for (int i = 0; i < commands.length(); i++) {
            if (commands.charAt(i) == 'M') {
                int newX = x;
                int newY = y;

                // Calculate next position based on direction
                switch (dir) {
                    case 'N': newY += 1; break;
                    case 'S': newY -= 1; break;
                    case 'E': newX += 1; break;
                    case 'W': newX -= 1; break;
                }

                // Check if new position is within bounds
                if (newX >= 0 && newX <= maxX && newY >= 0 && newY <= maxY) {
                    x = newX;
                    y = newY;
                } else {
                    // Out of boundary
                    System.out.println(x + " " + y + " " + dir);
                    System.out.println("Out Of Boundary");
                    outOfBoundary = true;
                    break;
                }
            }
        }

        // If no boundary violation, print final position
        if (!outOfBoundary) {
            System.out.println(x + " " + y + " " + dir);
        }
    }
}

