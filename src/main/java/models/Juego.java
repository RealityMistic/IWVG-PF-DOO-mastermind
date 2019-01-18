package models;

public class Juego
{

        private Estado estado;
        private Tablero tablero;

        int maxNumeroIntentos;

        public Juego() {
            estado = Estado.INICIO;
            tablero = new Tablero();

        }

        public Estado getEstado() {
            return estado;
        }

        public void setEstado(Estado estado){
            this.estado = estado;
        }

        public void clear() {
            tablero.clear();
        }

        public void crearCodigo() {
            tablero.crearCodigo();
        }


        public void setNumeroIntentos(int numJuegos){
            assert(numJuegos % 2 == 1);
            maxNumeroIntentos = numJuegos;
        }

        public void introducir(Codigo propuesta) {
            assert propuesta != null;
            this.tablero.introducir(propuesta);
        }


        public boolean alcanzadoNumeroIntentos(){
            return tablero.getNumeroIntentos() == this.maxNumeroIntentos;
        }

        public int contarMuertos(){
            return tablero.contarMuertos();
        }

        public int contarHeridos() {
            return tablero.contarHeridos();
        }

        public boolean todosMuertos(){
            return tablero.todosMuertos();
        }


}
