package riscoDieta;

public class Pessoa {
    private String sexo;
    private int idade;
    private float gorduraCorporal;
    private String nivelAtividade;

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if (!(sexo.equals("Masculino") || sexo.equals("Feminino"))) {
            throw new IllegalArgumentException("Sexo inválido. Tente novamente (apenas as opções 'Masculino' e 'Feminino' são válidas)!");
        }
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade <= 0 || idade > 120) {
            throw new IllegalArgumentException("Idade inválida!");
        }
        this.idade = idade;
    }

    public float getGorduraCorporal() {
        return gorduraCorporal;
    }

    public void setGorduraCorporal(float gorduraCorporal) {
        if (gorduraCorporal < 0 || gorduraCorporal > 60) {
            throw new IllegalArgumentException("Percentual de gordura inválido!");
        }
        this.gorduraCorporal = gorduraCorporal;
    }

    public String getNivelAtividade() {
        return nivelAtividade;
    }

    public void setNivelAtividade(String nivelAtividade) {
        if (!(nivelAtividade.equals("Baixa") || nivelAtividade.equals("Moderada") || nivelAtividade.equals("Alta"))) {
            throw new IllegalArgumentException("Nível de atividade inválido (apenas as opções 'Baixa', 'Moderada' e 'Alta' são válidas)!");
        }
        this.nivelAtividade = nivelAtividade;
    }

    public String avaliarRiscoDieta() {

        if (sexo.equals("Masculino")) {
            if (idade < 30) {
                if (gorduraCorporal < 10) {
                    return "Risco muito baixo";
                } else if (gorduraCorporal < 20) {
                    return "Baixo risco";
                } else if (gorduraCorporal < 25) {
                    return "Risco moderado";
                } else {
                    return "Alto risco";
                }
            } else if (idade <= 50) {
                if (gorduraCorporal < 12) {
                    return "Risco muito baixo";
                } else if (gorduraCorporal < 22) {
                    return "Baixo risco";
                } else if (gorduraCorporal < 28) {
                    return "Risco moderado";
                } else {
                    return "Alto risco";
                }
            } else {
                if (gorduraCorporal < 14) {
                    return "Risco muito baixo";
                } else if (gorduraCorporal < 24) {
                    return "Baixo risco";
                } else if (gorduraCorporal < 30) {
                    return "Risco moderado";
                } else {
                    return "Alto risco";
                }
            }
        } else {
            if (idade < 30) {
                if (gorduraCorporal < 18) {
                    return "Risco muito baixo";
                } else if (gorduraCorporal < 28) {
                    return "Baixo risco";
                } else if (gorduraCorporal < 33) {
                    return "Risco moderado";
                } else {
                    return "Alto risco";
                }
            } else if (idade <= 50) {
                if (gorduraCorporal < 20) {
                    return "Risco muito baixo";
                } else if (gorduraCorporal < 30) {
                    return "Baixo risco";
                } else if (gorduraCorporal < 35) {
                    return "Risco moderado";
                } else {
                    return "Alto risco";
                }
            } else {
                if (gorduraCorporal < 22) {
                    return "Risco muito baixo";
                } else if (gorduraCorporal < 32) {
                    return "Baixo risco";
                } else if (gorduraCorporal < 37) {
                    return "Risco moderado";
                } else {
                    return "Alto risco";
                }
            }
        }
    }
}