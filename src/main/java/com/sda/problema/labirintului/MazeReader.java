package com.sda.problema.labirintului;

import java.io.*;

public class MazeReader {

    public int[][] readMaze(String path) {

        int[][] matrixFromFile = null;

        int rows = 0;
        int cols = 0;

        File file = new File(path);

        try {

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String firstLine = bufferedReader.readLine();
            String[] size = firstLine.split(" ");

            rows = Integer.parseInt(size[0]);
            cols = Integer.parseInt(size[1]);

            matrixFromFile = new int[rows][cols];

            String line = bufferedReader.readLine();
            int i = 0;

            while (line != null) {

                String[] lineSplitted = line.split("");
                int[] elementsOfRow = new int[lineSplitted.length];

                for (int j = 0; j < elementsOfRow.length; j++) {
                    elementsOfRow[j] = Integer.parseInt(lineSplitted[j]);
                }

                matrixFromFile[i] = elementsOfRow;

                i++;
                line = bufferedReader.readLine();
            }

            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }


        return matrixFromFile;
    }
}

