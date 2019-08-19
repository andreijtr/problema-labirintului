package com.sda.problema.labirintului;

public class MazeProblemMain {

    private static final String path = "D:\\Andrei\\Java\\FisiereIO\\problema labirintului\\labirint.txt";

    public static void main(String[] args) {

        MazeReader reader = new MazeReader();

        ResolveMazeProblem resolveMazeProblem = new ResolveMazeProblem();

        MazeProblemPrinter printer = new MazeProblemPrinter();

        int[][] maze = reader.readMaze(path);

        Position[] pathOfPositions = resolveMazeProblem.findExit(3,5,maze);

        printer.displayMazeWithValues(maze);
        printer.displayPath(pathOfPositions);
    }

}
