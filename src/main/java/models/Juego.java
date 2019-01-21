package models;

public class Juego
{

        private Estado estado;
        private Tablero tablero;
        private int puntos;

        int maxNumeroIntentos;

        public Juego() {
            estado = Estado.INICIO;
            tablero = new Tablero();
            puntos = 0;

        }

        public int incrementarPuntosPorJugada(int muertos, int heridos){
            if (!(muertos >0)) muertos = 0;
            if (!(heridos >0)) heridos = 0;
            this.puntos = puntos + 40 - (10 * muertos) - (5 *heridos);
            return puntos;
        }

        public int getPuntos(){
            return puntos;
        }

        public void setPuntos(int puntos){
            this.puntos = puntos;
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
