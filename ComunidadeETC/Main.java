```markdown
Exercício: Aplicando o Open-Closed Principle

Enunciado: Você foi contratado para desenvolver um sistema de cálculo de frete para uma loja virtual. Atualmente, a loja trabalha com três modalidades de entrega:

- Entrega Padrão – Custa R$ 20,00.
- Entrega Internacional – Custa R$ 50,00.

Requisitos:

Crie uma classe `Pedido` que armazene o valor do pedido e o tipo de entrega. Implemente uma solução que calcule o custo total do pedido (valor do produto + valor do frete). Importante: Sua solução deve seguir o Open-Closed Principle, ou seja: O código deve permitir a adição de novas modalidades de frete sem modificar a lógica existente. Você pode usar interfaces ou classes abstratas para alcançar isso.

Desafio extra: ➡️ Adicione uma nova modalidade de entrega: Entrega Prioritária – Custa R$ 30,00, sem modificar as classes já implementadas.
```

```java
// Interface for delivery strategy
interface Entrega {
    double calcularFrete();
}

// Concrete classes for each delivery type
class EntregaPadrao implements Entrega {
    @Override
    public double calcularFrete() {
        return 20.00;
    }
}

class EntregaInternacional implements Entrega {
    @Override
    public double calcularFrete() {
        return 50.00;
    }
}

// New delivery type added without modifying existing classes
class EntregaPrioritaria implements Entrega {
    @Override
    public double calcularFrete() {
        return 30.00;
    }
}

// Pedido class
class Pedido {
    private double valorProduto;
    private Entrega entrega;

    public Pedido(double valorProduto, Entrega entrega) {
        this.valorProduto = valorProduto;
        this.entrega = entrega;
    }

    public double calcularCustoTotal() {
        return valorProduto + entrega.calcularFrete();
    }
}

// Example usage
public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(100.00, new EntregaPadrao());
        System.out.println("Custo total do pedido 1: " + pedido1.calcularCustoTotal());

        Pedido pedido2 = new Pedido(100.00, new EntregaInternacional());
        System.out.println("Custo total do pedido 2: " + pedido2.calcularCustoTotal());

        Pedido pedido3 = new Pedido(100.00, new EntregaPrioritaria());
        System.out.println("Custo total do pedido 3: " + pedido3.calcularCustoTotal());
    }
}
```
