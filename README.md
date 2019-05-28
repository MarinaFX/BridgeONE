# 2. Bridge

### 2.1.Exercício:


Para ilustrar o padrão Bridge, vamos simulá-lo com um exemplo do mundo real. Em lanchonetes você pode
comprar refrigerantes de vários tipos (coca-cola, guaraná, etc.) e tamanhos (pequeno, médio, etc.). Se
fôssemos criar classes representando estes elementos, teríamos uma proliferação de classes:
CocaColaPequena, CocaColaMedia, GuaranaPequeno, etc. Utilizando o padrão Bridge, as classes abaixo
foram criadas:


```
public abstract class AbstracaoTamanho {
   protected ImplementacaoRefrigerante refrigerante;
   
    public AbstracaoTamanho(ImplementacaoRefrigerante refrigerante) {
        this.refrigerante = refrigerante;
    }

    public abstract void beber();
 
}

public class TamanhoPequeno extends AbstracaoTamanho {

     public TamanhoPequeno(ImplementacaoRefrigerante refrigerante) {
         super(refrigerante);
     }

     public void beber() {
         System.out.println("Toma um gole de " + refrigerante);
         System.out.println("Acabou o(a) " + refrigerante);
         System.out.println();
     }
}

public class TamanhoMedio extends AbstracaoTamanho {

     public TamanhoMedio(ImplementacaoRefrigerante refrigerante) {
         super(refrigerante);
     }
     
     public void beber() {
         System.out.println("Toma um gole de " + refrigerante);
         System.out.println("Toma um gole de " + refrigerante);
         System.out.println("Acabou o(a) " + refrigerante);
         System.out.println();
     }
}
```


A hierarquia acima abstrai o quesito “tamanho” de um refrigerante. Ela se preocupa em prover classes
diferentes para tamanhos diferentes. Temos ainda que tratar o quesito “tipo” do refrigerante. Para não
proliferar classes, como já enunciado, criamos uma outra hierarquia para tratar o tipo dos refrigerantes.



```
public interface ImplementacaoRefrigerante { }

public class CocaCola implements ImplementacaoRefrigerante {

     public String toString() {
        return "coca-cola";
     }
}

public class Guarana implements ImplementacaoRefrigerante {

     public String toString() {
        return "guaraná";
     }
}

```

Experimente as classes acima criando um programa que criará diferentes tipos de refrigerantes de diferentes
tamanhos. Chame o método “beber()” e note que o tipo e o tamanho estão certos (o tipo é impresso e o
tamanho é notado pela quantidade de goles que se toma antes de acabar o refrigerante). Implemente mais
tipos de refrigerante (Fanta, Sprite, etc.) e mais tamanhos (Grande, Tamanho Família, etc.) para
experimentar como o padrão Bridge funciona.

