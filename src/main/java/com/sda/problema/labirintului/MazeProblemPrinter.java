package com.sda.problema.labirintului;

public class MazeProblemPrinter {

    //this method shows the path from start to end in coordinates
    public void displayPath(Position[] positions) {

        for (Position element : positions) {
            if (element != null){
                System.out.print(element + " ");
            }
        }
    }

    //this method shows the maze, and all the visited cells has value 2
    public void displayMazeWithValues(int[][] maze) {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }
    }
}
