package mdd.uniandes.generatedao.test;

import java.util.List;
import mdd.uniandes.generatedao.project.Estudiante;
import mdd.uniandes.generatedao.project.EstudianteDatabaseManager;
import mdd.uniandes.generatedao.project.Usuario;
import mdd.uniandes.generatedao.project.UsuarioDatabaseManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Estudiante estudiante= new Estudiante("Kevin Sanchez","123456","MISO");
        EstudianteDatabaseManager db = new EstudianteDatabaseManager();
        db.saveEstudiante(estudiante);
        
        List<Estudiante> estudiantes=db.getEstudiante();
        for (Estudiante estudiante1 : estudiantes) {
            System.out.println(estudiante1.getNombre());
        }
        
        
        /*Usuario usuario= new Usuario("Kelly", "Garces", "kj.garces971");
        UsuarioDatabaseManager dbu = new UsuarioDatabaseManager();
        dbu.saveUsuario(usuario);
        
        List<Usuario> usuarios=dbu.getUsuario();
        for (Usuario usuario1 : usuarios) {
            System.out.println(usuario1.getUsername());
        }*/
        
        
    }
}
