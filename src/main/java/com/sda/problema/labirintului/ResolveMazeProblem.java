package com.sda.problema.labirintului;

public class ResolveMazeProblem {

    public Position[] findExit(int startRow, int startColumn, int[][] maze) {

        int m = maze.length;
        int n = maze[0].length;

        //make an array of Positions, size m*n which will keep the way from start to end
        Position[] positions = new Position[m * n];

        //first position in array is starting position
        positions[0] = new Position(startRow,startColumn);

        //index k will parse the positions array
        int k = 0;

        //a visited position is marked by value 2
        maze[startRow][startColumn] = 2;

        Position actualPosition = positions[0];

        boolean exitFound = false;

        do {

            //later program will check if the actual position was changing or not, if is not changed it means for the program
            // that there is no other position with value 0 to go further, so algorithms go back one position (position k - 1
            // from positions[] array
            Position auxPosition = actualPosition;

            //a visited position is marked with value 2, a wall has value 1, an unvisited position has value 0
            //from actual position, try looking for a position with value 0
                //if 0 values is foound, actualPosition becomes the found position, mark it with value 2, add it to positions array
                // and check if is exit
                //if NO 0 values was found, actual position becomes the previous position from array (k-1)

            for (int l = 0; l < 4; l++) {
                int i = actualPosition.getIndexRow();
                int j = actualPosition.getIndexCol();

                if(l == 0) {
                    //move down
                    i += 1;
                } else if(l == 1) {
                    //move up
                    i -= 1;
                } else if(l == 2) {
                    //move right
                    j += 1;
                } else {
                    //move left
                    j -=1;
                }

                if(i >= 0 && i < m && j >= 0 && j < n) {

                    if(maze[i][j] == 0) {
                        k += 1;
                        positions[k] = new Position(i,j);
                        maze[i][j] = 2;
                        actualPosition = positions[k];

                        if (isExit(actualPosition,maze)) {
                            exitFound = true;
                        }

                        break;
                    }
                }
            }

            //if no 0 was find from actual position, go back one position and keep looking for another 0
            if (actualPosition == auxPosition) {
                positions[k] = null;
                actualPosition = positions[k - 1];
                k -= 1;
            }
        } while (k >= 0 && !exitFound);

        return positions;
    }

    //check is the riched position is actually the exit
    public boolean isExit(Position position, int[][] maze) {

        boolean exit = false;

        //number of rows
        int m = maze.length;
        //number of columns
        int n = maze[0].length;

        //if riched position is edge of the maze
        if (position.getIndexRow() == 0 || position.getIndexRow() == (m-1) ||
        position.getIndexCol() == 0 || position.getIndexCol() == (n-1)) {
            exit = true;
        }

        return exit;
    }
}
