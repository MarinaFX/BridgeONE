package Abstraction.Conrete;

import Abstraction.Abstract.AbstracaoTamanho;
import Implementation.Abstract.ImplementacaoRefrigerante;

public class TamanhoFamilia extends AbstracaoTamanho {
    public TamanhoFamilia(ImplementacaoRefrigerante refrigerante) {
        super(refrigerante);
    }

    @Override
    public void beber() {
        System.out.println("Toma um golão de " + refrigerante);
        System.out.println("Toma um golão de " + refrigerante);
        System.out.println("Toma um golão de " + refrigerante);
        System.out.println("Acabou o(a) " + refrigerante);
        System.out.println();
    }
}
