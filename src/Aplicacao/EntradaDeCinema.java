package Aplicacao;
import java.util.Scanner;
public class EntradaDeCinema {
	    float horario;
	    int sala;
	    float valor;
	    // DUPLA: WENDELL ALCÂNTARA E RAÍSSA MARA
	    public EntradaDeCinema(float horario, int sala, float valor) {
	        this.horario = horario;
	        this.sala = sala;
	        this.valor = valor;
	    }

	    public void CalculaDesconto(int idade) {
	        if (idade < 12) {
	            valor *= 0.5;
	        }
	    }

	    public void CalculaDesconto(int idade, int carteiraEstudante) {
	        if (idade >= 12 && idade <= 15) {
	            valor *= 0.6;
	        } else if (idade >= 16 && idade <= 20) {
	            valor *= 0.7;
	        } else if (idade > 20) {
	            valor *= 0.8;
	        }
	        if (carteiraEstudante == 0) {
	            valor *= 0.9; // Desconto adicional para estudantes
	        }
	    }

	    public void CalculaDesconto(float horarioFilme) {
	        if (horarioFilme < 16) {
	            valor *= 0.9;
	        }
	    }

	    @Override
	    public String toString() {
	        return "Entrada: horário=" + horario + ", sala=" + sala + ", valor=" + valor;
	    }
	}
