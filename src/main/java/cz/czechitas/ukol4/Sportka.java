package cz.czechitas.ukol4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Sportka {
  private final List<Integer> osudi = new ArrayList<>();

  public Sportka() {
      for (int i = 0; i < 50; i++) {
        osudi.add(i);

  }
  }
  public void zamichat() {
    Collections.shuffle(osudi);

  }

  public List<Integer> vylosovanaCisla() {
    return osudi.subList(0, 6);
  }


  public Integer dodatkoveCislo() {
    return osudi.get(7);

  }
}
