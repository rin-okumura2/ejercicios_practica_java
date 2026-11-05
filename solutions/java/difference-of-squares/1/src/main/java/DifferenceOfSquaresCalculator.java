class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        // Fórmula de la suma de los primeros N números: (N * (N + 1)) / 2
        int sum = (input * (input + 1)) / 2;
        // Devolvemos el cuadrado de esa suma
        return sum * sum;
    }

    int computeSumOfSquaresTo(int input) {
        // Fórmula de la suma de los cuadrados: (N * (N + 1) * (2 * N + 1)) / 6
        return (input * (input + 1) * (2 * input + 1)) / 6;
    }

    int computeDifferenceOfSquares(int input) {
        // La diferencia entre el cuadrado de la suma y la suma de los cuadrados
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }
}