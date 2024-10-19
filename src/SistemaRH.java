public class SistemaRH {
    public static void main(String[] args) {

        Funcionario gerente = new Gerente("Carlos", 5000);
        Funcionario desenvolvedor = new Desenvolvedor("Ana", 4000);

        System.out.println("Gerente:");
        gerente.mostrarInfomacoes();
        gerente.calcularSalario();
        gerente.descreverResponsabilidade();

        System.out.println();

        System.out.println("Desenvolvedor:");
        desenvolvedor.mostrarInfomacoes();
        desenvolvedor.calcularSalario();
        desenvolvedor.descreverResponsabilidade();
    }
}


abstract class Funcionario {
    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public abstract void calcularSalario();
    public abstract void mostrarInfomacoes();
    public abstract void descreverResponsabilidade();
}

class Gerente extends Funcionario {
    private double salarioBase;

    public Gerente(String nome, double salarioBase) {
        super(nome);
        this.salarioBase = salarioBase;
    }

    @Override
    public void calcularSalario() {
        // Salário do gerente é o salário base vezes 1.5
        double salario = salarioBase * 1.5;
        System.out.println("Salário do Gerente: R$ " + salario);
    }

    @Override
    public void mostrarInfomacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Cargo: Gerente");
        System.out.println("Salário Base: R$ " + salarioBase);
    }

    @Override
    public void descreverResponsabilidade() {
        System.out.println("Responsabilidades: Gerenciar a equipe, supervisionar projetos, definir metas e estratégias.");
    }
}

class Desenvolvedor extends Funcionario {
    private double salarioBase;

    public Desenvolvedor(String nome, double salarioBase) {
        super(nome);
        this.salarioBase = salarioBase;
    }

    @Override
    public void calcularSalario() {

        double salario = salarioBase * 1.2;
        System.out.println("Salário do Desenvolvedor: R$ " + salario);
    }

    @Override
    public void mostrarInfomacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Cargo: Desenvolvedor");
        System.out.println("Salário Base: R$ " + salarioBase);
    }

    @Override
    public void descreverResponsabilidade() {
        System.out.println("Responsabilidades: Desenvolver software, corrigir bugs, implementar novas funcionalidades.");
    }
}

