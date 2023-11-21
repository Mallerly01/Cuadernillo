public class NodoCB {
    NodoCB padre; // El padre
    NodoCB hermano; // el hermano
    NodoCB hijo;  // el hijo
    Integer dato;  // la clave
    Short grado; // el grado, el grado es el numero de hijos

    //Constructor
    NodoCB(NodoCB padre, NodoCB hermano, NodoCB hijo, Integer dato, Short grado){
        this.padre =padre;
        this.hermano =hermano;
        this.hijo = hijo;
        this.dato = dato;
        this.grado = grado;
    }

    void  BinomialLink(NodoCB z){
        padre =z;
        hermano = z.hijo;
        z.hijo = this;
        z.grado++;
    }

}
