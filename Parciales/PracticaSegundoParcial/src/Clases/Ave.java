package Clases;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Objects;

public final class Ave extends Animal{

    //Atributos
    ArrayList<String> listadoAlimentos;

    //Constructor
    public Ave(int idRegistro, String especie, int edad) {
        super(idRegistro, especie, edad);
        this.listadoAlimentos = new ArrayList<>();
    }

    //Getter
    public ArrayList<String> getListadoAlimentos() {
        return listadoAlimentos;
    }

    //Equals && HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ave ave = (Ave) o;
        return Objects.equals(listadoAlimentos, ave.listadoAlimentos);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), listadoAlimentos);
    }

    //ToString
    @Override
    public String toString() {
        return super.toString()+  "Ave " +
                "listadoAlimentos=" + listadoAlimentos;
    }

    //Metodos
    @Override
    public String dormir() {
        return "La especie con el id: " + getEdad() + ": "+ getEspecie() + super.dormir();
    }
    @Override
    public String aparearse() {
        return "La especie con el id: " + getEdad() + ": "+ getEspecie() + super.aparearse();
    }
    @Override
    public String comer() {
        return "La especie con el id: " + getEdad() + ": "+ getEspecie() + super.comer();
    }

    public void ingresarAlimentosLista(String tipoAlimento)
    {
        listadoAlimentos.add(tipoAlimento);
    }

    public boolean eliminarAlimentoLista(String tipoAlimento) {
        boolean eliminado= false;
        for (String ali : listadoAlimentos) {
            if (ali.equalsIgnoreCase(tipoAlimento))
            {
                listadoAlimentos.remove(tipoAlimento);
                eliminado= true;
            }
        }

        return eliminado;

    }

    //ToJsonObject
    public JSONObject toJsonObject()
    {
        JSONObject json = new JSONObject();
        json.put("idRegistro" , getIdRegistro());
        json.put("especie" , getEspecie());
        json.put("edad" ,getEdad());
        JSONArray jsonAlimentos = new JSONArray();
        for(String alimentos : listadoAlimentos)
            {
                jsonAlimentos.put(alimentos);
            }
        json.put("listadoAlimentos" , jsonAlimentos);

        return json;
    }

    public static Ave fromJsonObject(JSONObject jsonObject)
    {
        int idRegistro = jsonObject.getInt("idRegistro");
        String especie= jsonObject.getString("especie");
        int edad= jsonObject.getInt("edad");
        Ave ave = new Ave(idRegistro, especie, edad);

        JSONArray listaAlimentos= jsonObject.getJSONArray("listadoAlimentos");
        for(int i=0; i< listaAlimentos.length(); i++)
        {
            ave.ingresarAlimentosLista(listaAlimentos.getString(i));
        }

        return ave;
    }
}
