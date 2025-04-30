public class Variable {
    String nombre;
    int valorInt;
    float valorFloat;
    String valorString;

    Variable(String nombre){
        this.nombre = nombre;
    }

    Variable(String nombre, String valor){
        this.nombre = nombre;
        if(valor.matches("[0-9]+")){
            this.valorInt = Integer.parseInt(valor);
        }else if(valor.matches("[a-zA-Z]+")){
            this.valorString = valor;
        }else{
            this.valorFloat = Float.parseFloat(valor);
        }
    }



}
