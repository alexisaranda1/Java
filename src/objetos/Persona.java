
public  class Persona{
    private String nombre; 
    private int edad;
    private  String sexo;
  
    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad; 
        this.sexo = sexo;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;

    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return  edad;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public  String getSexo(){
        return sexo;
    }


}