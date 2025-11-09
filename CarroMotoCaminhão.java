package CarroMotoCaminhao01;
    
    public abstract class CarroMotoCaminhao {
        
        private String marca;
        private String modelo;
        private int ano;
        
        public CarroMotoCaminhao (String marca, String modelo, int ano) {
            
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
            
        public void exibirDetalhes() {
            
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
      }
            public abstract void acelerar();
        
            public String getmarca() {
                return marca;
            }

            public String getmodelo() {
                return modelo;
            }

            public int getano() {
                return ano;
            }
        }