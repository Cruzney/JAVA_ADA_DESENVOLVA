// Carro.java
        public class Carro extends Veiculo {
            private String tipoDeCombustivel;

            public Carro(String marca, String modelo, String tipoDeCombustivel) {
                super(marca, modelo);
                this.tipoDeCombustivel = tipoDeCombustivel;
            }

            public String ligar() {
                if (super.isLigado()) {
                    return "carro já está ligado";
                }
                super.setLigado(true);
                return "ligado";
            }

            public String desligar() {
                if (!super.isLigado()) {
                    return "carro já está desligado";
                }
                super.setLigado(false);
                return "desligado";
            }

            public String getTipoDeCombustivel() {
                return tipoDeCombustivel;
            }

            public void setTipoDeCombustivel(String tipoDeCombustivel) {
                this.tipoDeCombustivel = tipoDeCombustivel;
            }
        }