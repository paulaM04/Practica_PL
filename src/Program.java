public class Program {
    String nombrePrograma;
    Boolean hayBloque;
    Bloque bloque;

    Program(String nombrePrograma, Boolean hayBloque) {
        this.nombrePrograma = nombrePrograma;
        this.hayBloque = hayBloque;
        this.bloque = new Bloque();
    }

    Program() {}

    public void setHayBloque(Boolean hayBloque) {
        this.hayBloque = hayBloque;
    }

    public String toString(){
        if(hayBloque){
            return "#include <stdio.h>"+"\n" + this.nombrePrograma + "\n" + this.hayBloque.toString();

        }else{
            return " ";
        }
    }


}
