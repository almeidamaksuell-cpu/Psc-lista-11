   package CarroMotoCaminhao;
   
   public class Carro extends CarroMotoCaminhao {
       
       public Carro (String marca, String modelo, int ano) {
           super (marca, modelo, ano);
       }
       @Override
       
       public void acelerar(){
           System.out.println(modelo + "" + marca + "Está acelerando de 0 a 100 km/h em X segundos.");
       }
       }
   
  