package br.edu.ifal.controle;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifal.modelo.Lance;
import br.edu.ifal.modelo.Produto;

public class Leilao {
private Double oferta;
private Produto produto;

private List<Lance> lances;

public Leilao(List<Lance> lances) {
super();
this.lances = lances;
}

public Leilao(Produto produto) {
this.produto = produto;
this.lances = new ArrayList<Lance>();
}

public Leilao() {
super();
this.lances = new ArrayList<Lance>();
}

public List<Lance> getLances() {
return lances;
}

public void setLances(List<Lance> lances) {
this.lances = lances;
}

public void propoe(Lance lance) {
lances.add(lance);
}

}