package Abstraction.Conrete;

import Abstraction.Abstract.AbstracaoTamanho;
import Implementation.Abstract.ImplementacaoRefrigerante;

public class TamanhoGrande extends AbstracaoTamanho {

    public TamanhoGrande(ImplementacaoRefrigerante refrigerante) {
        super(refrigerante);
    }

    @Override
    public void beber() {
        System.out.println("Toma um gole de " + refrigerante);
        System.out.println("Toma um gole de " + refrigerante);
        System.out.println("Toma um gole de " + refrigerante);
        System.out.println("Acabou o(a) " + refrigerante);
        System.out.println();
    }
}
