class Anagram {
  List<String> findAnagrams(String target, List<String> candidates) {
    final String normalizedTarget = target.toLowerCase();
    final String sortedTarget = _sortCharacters(normalizedTarget);
    
    final List<String> anagrams = [];

    for (String candidate in candidates) {
      final String normalizedCandidate = candidate.toLowerCase();

      // Una palabra no es su propio anagrama
      if (normalizedCandidate == normalizedTarget) {
        continue;
      }

      // Si al ordenar sus letras coinciden con el objetivo, es un anagrama
      if (_sortCharacters(normalizedCandidate) == sortedTarget) {
        anagrams.add(candidate);
      }
    }

    return anagrams;
  }

  // Función auxiliar para ordenar los caracteres de una palabra alfabéticamente
  String _sortCharacters(String str) {
    List<String> chars = str.split('');
    chars.sort();
    return chars.join();
  }
}

