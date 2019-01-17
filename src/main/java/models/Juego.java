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

        public boolean comprobarMastermind(Codigo codigoPropuesta) {
            return tablero.comprobarMastermind(codigoPropuesta);
        }

        public void put(Codigo codigo) {
            tablero.codigo(codigo);
        }


        void setNumeroIntentos(int numJuegos){
            assert(numJuegos % 2 == 1);
            maxNumeroIntentos = numJuegos;
        }

        int getMaxNumeroIntentos(){
            maxNumeroIntentos;
        }

        public int contarNumeroIntentos() {
            return tablero.contarNumeroIntentos();
        }

        public boolean alcanzadoNumeroIntentos(){
            return maxNumeroIntentos == tablero.contarNumeroIntentos();
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

        public void setEstado(Estado estado){
            this.estado = estado;
        }

}
