package JamesKo;

public class SkyView {
    private double[][] view;

    public SkyView(int numRows, int numCols, double[] scanned) {
        view = new double[numRows][numCols];

        int scannedIndex = 0;

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                if (row % 2 == 0)
                    view[row][col] = scanned[scannedIndex];
                else
                    view[row][numCols - col - 1] = scanned[scannedIndex];

                scannedIndex++;


            }
        }
    }
}


