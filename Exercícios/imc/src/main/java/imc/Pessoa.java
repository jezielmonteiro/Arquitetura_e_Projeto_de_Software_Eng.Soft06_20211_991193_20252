package imc;

public class Pessoa {
    private String sexo;
    private float peso;
    private float altura;

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if (!(sexo.equals("Masculino") || sexo.equals("Feminino"))) {
            throw new IllegalArgumentException("Sexo inválido. Tente novamente (apenas as opções 'Masculino' e 'Feminino' são válidas)!");
        }
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        if (peso <= 0f) {
            throw new IllegalArgumentException("Peso inválido. Tente novamente!");
        }
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if (altura <= 0f || altura >= 3f)  {
            throw new IllegalArgumentException("Altura inválida. Tente novamente!");
        }
        this.altura = altura;
    }

    public float calcularIMC() {
        float imc = (this.peso / (this.altura * this.altura));
        return (float) ((int) (imc * 10)) / 10;
    }

    public String verificarIMC() {
        float imc;
        imc = calcularIMC();

        if (this.sexo.equals("Masculino")) {
            if (imc < 20.7f) {
                return "Abaixo do peso.";
            } else if (imc < 26.4f) {
                return "No peso normal.";
            } else if (imc < 27.8f) {
                return "Marginalmente acima do peso.";
            } else if (imc < 31.1f) {
                return "Acima do peso ideal.";
            } else {
                return "Obeso.";
            }
        } else {
            if (imc < 19.1f) {
                return "Abaixo do peso.";
            } else if (imc < 25.8f) {
                return "No peso normal.";
            } else if (imc < 27.3f) {
                return "Marginalmente acima do peso.";
            } else if (imc < 32.3f) {
                return "Acima do peso ideal.";
            } else {
                return "Obesa.";
            }
        }
    }
}