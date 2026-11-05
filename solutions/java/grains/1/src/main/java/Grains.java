import java.math.BigInteger;

class Grains {

    // 1. Calcula el número de granos en una casilla específica (del 1 al 64)
    BigInteger grainsOnSquare(final int square) {
        if (square < 1 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        // Usamos BigInteger.ONE y desplazamos los bits (1L << (square - 1))
        // Alternativa con BigInteger: BigInteger.TWO.pow(square - 1)
        return BigInteger.ONE.shiftLeft(square - 1);
    }

    // 2. Calcula el número total de granos en todo el tablero (2^64 - 1)
    BigInteger grainsOnBoard() {
        // El total en 64 casillas es (2^64 - 1), que equivale a poner un bit en la posición 64 y restar 1
        // O bien, usando shiftLeft(64).subtract(BigInteger.ONE)
        return BigInteger.ONE.shiftLeft(64).subtract(BigInteger.ONE);
    }

}