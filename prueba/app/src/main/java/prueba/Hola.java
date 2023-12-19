package prueba;

public class Hola {
    public String getGreeting(){
	return "las ventajas que ofrece Git es su capacidad de editar archivos desde un equipo y que el resto de equipos que tenga acceso a este puedan descargar la nueva version, tambien se tiene que tener en cuen ta que se pueden acceder a versiones anteriores y que no te lo actualiza de manera automatica forzada, tiens que ser tu el que decida si actualizarlo o no.";
}
    public static void main(String[] args) {
        String nombre=args.length>0?args[0]:"";
        Saluda.saluda(nombre);
    }
}
