public class Main {
    public static void main(String[] args) {

        Funcionario gerente = new Gerente("Carlos", 5000);
        Funcionario desenvolvedor = new Desenvolvedor("Ana", 4000);

        gerente.mostrarInfomacoes();
        gerente.calcularpagamento();

        desenvolvedor.mostrarInfomacoes();
        desenvolvedor.calcularpagamento();
    }
}

class Gerente extends Funcionario {
    private double salarioBase;

    public Gerente(String nome, double salarioBase) {
        super(nome);
        this.salarioBase = salarioBase;
    }

    @Override
    public void calcularpagamento() {

        double pagamento = salarioBase * 1.5;
        System.out.println("Pagamento do Gerente: R$ " + pagamento);
    }

    @Override
    public void mostrarInfomacoes() {
        System.out.println("Nome do Gerente: " + getNome());
        System.out.println("Salário Base: R$ " + salarioBase);
    }
}

class Desenvolvedor extends Funcionario {
    private double salarioBase;

    public Desenvolvedor(String nome, double salarioBase) {
        super(nome);
        this.salarioBase = salarioBase;
    }

    @Override
    public void calcularpagamento() {

        double pagamento = salarioBase * 1.2;
        System.out.println("Pagamento do Desenvolvedor: R$ " + pagamento);
    }

    @Override
    public void mostrarInfomacoes() {
        System.out.println("Nome do Desenvolvedor: " + getNome());
        System.out.println("Salário Base: R$ " + salarioBase);
    }
}

