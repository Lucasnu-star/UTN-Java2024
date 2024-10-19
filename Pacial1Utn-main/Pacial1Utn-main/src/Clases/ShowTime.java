package Clases;
import Interfaces.IShow;
import java.util.ArrayList;

/**
 * Esta clase tiene 1 arrayList con el tipo de dato IShow que viene de una interfaz
 *
 * Con esta clase vamos a utiliar los arrays de la clase Circo para separar con un instaceOf los que tienen implementada la interfaz IShow y poder meterles en un array
 */

public class ShowTime  {

    //Atributos(lista SHOWTIME)
    protected ArrayList<IShow> listaShow;

    //Constructor
    public ShowTime() {
        this.listaShow = new ArrayList<>();
    }

    //Metodos
    public void agregarAlShow(ArrayList<Persona> personas, ArrayList<PerroAdiestrado> perritos) {
        for(Persona personitas: personas)
        {
            if(personitas instanceof IShow)
            {
                listaShow.add((IShow) personitas);

            }
        }

        agregarPerrosAdiestrados(perritos);

    }
    public void agregarPerrosAdiestrados(ArrayList<PerroAdiestrado> perritoss) {
        for(PerroAdiestrado perritosAdiestrados: perritoss) {
            listaShow.add((IShow) perritosAdiestrados);
        }
    }
    public void mostrarListaShow() {
        for(IShow a: listaShow)
        {
            System.out.println("----------");
            System.out.println(a.ensayar());
            System.out.println(  a.probarseVestuario());
            System.out.println(a.brindarShow());
            System.out.println("----------");



        }
    }




}
