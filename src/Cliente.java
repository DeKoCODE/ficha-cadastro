public class Cliente {
    private String nome;        // >= 6 e <=30
    private int idade;          // >0 e <100
    private float altura;       // >0
    private float peso;         // >0
    private char sexo;          // 'M' ou 'F'

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if((nome.length() < 6) || (nome.length()>30)){
            throw new IllegalArgumentException("Nome inválido. Mínimo 6 caracteres, máximo 30 caracteres.");
        }
        else
            this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if((idade <= 0) || (idade >= 100)){
            throw new IllegalArgumentException("Idade inválida.");
        }
        else
            this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if(altura <= 0){
            throw new IllegalArgumentException("Altura inválida.");
        }
        else
            this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        if(peso <= 0){
            throw new IllegalArgumentException("Peso inválido.");
        }
        else
            this.peso = peso;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if((sexo != 'M') && (sexo != 'F')){
            throw new IllegalArgumentException("Sexo inválido.");
        }
        this.sexo = sexo;
    }

    public void printData(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Sexo: " + sexo);

    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                ", peso=" + peso +
                ", sexo=" + sexo +
                '}';
    }
}
