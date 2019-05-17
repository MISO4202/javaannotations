package mdd.uniandes.generatedao.project;

import mdd.uniandes.generatedao.annotations.TableColumn;
import mdd.uniandes.generatedao.annotations.TableSerializable;

@TableSerializable(name = "Estudiante")
public interface IEstudiante {
	
	@TableColumn String getNombre();
	
	@TableColumn String getCodigo();
	
	@TableColumn String getCarrera();
	

}
