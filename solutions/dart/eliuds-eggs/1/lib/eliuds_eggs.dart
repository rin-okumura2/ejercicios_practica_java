class EggCounter {
  // Your code goes here.
int count(int numeroCodificado) {
 
  return numeroCodificado
      .toRadixString(2)
      .split('')
      .where((bit) => bit == '1')
      .length;
}
}
