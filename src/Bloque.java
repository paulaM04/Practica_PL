import java.util.ArrayList;

public class Bloque {
    //ArrayList<Funcion> funciones;
    ArrayList<Variable> variables;
    //ArrayList<Constante> constantes;
    //Main mainFuntion;

    Bloque() {
        variables = new ArrayList<>();
    }

    public void addVariable(Variable v) {
        variables.add(v);
    }

}
