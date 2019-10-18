# javaannotations
Java Maven projects to generate Java code from annotations


## Getting Started

### Prerequisites
Netbeans 8.1

### Installing
Importar los tres proyectos en Netbeans.

## Proyectos
### mdd.uniandes.generatedao
En este proyecto se incluyen las definiciones de las anotaciones y el procesador de anotaciones para generar el código a partir de la anotación.

* anotations: Se definen las anotaciones TableColumn y TableSerializable.

* processor:Se define el procesador que lee las anotaciones y genera el codigo para persistencia de Java dada una interfaz anotada. En este ejemplo se desarrollaron dos tipos de generador uno manual usando Strings y metodos con parámetros y otro usando JTwig, un generador Java basado en templates.

### mdd.uniandes.generatedao.project
Este proyecto importa como dependencia a mdd.uniandes.generatedao permitiendo que cuando se compile el jar, se genere el código de persistencia dada una interfaz.

### mdd.uniandes.generatedao.test
Este proyecto incluye como dependencia a mdd.uniandes.generatedao.project y prueba que sea posible usar el código de persistencia generado.

## Ejecución
Al tener importados los tres proyectos en el workspace el proyecto mdd.uniandes.generatedao ya cotiene el código necesario para generar los archivos Java con la persistencia dadas interfaces anotadas con las anotaciones definidas en el proyecto. Dentro del proyecto mdd.uniandes.generatedao.project se encuentran dos ejemplos de interfaces anotadas IUusuario y IEstudiante. El siguiente código es un ejemplo de la interface anotada.

```
package mdd.uniandes.generatedao.project;

import mdd.uniandes.generatedao.annotations.TableColumn;
import mdd.uniandes.generatedao.annotations.TableSerializable;

@TableSerializable(name = "Estudiante")
public interface IEstudiante {
	
	@TableColumn String getNombre();
	
	@TableColumn String getCodigo();
	
	@TableColumn String getCarrera();
	

}
```
La anotación @TableSerializable permitira crear una Entity cuyo nombre de tabla será Estudiante y las anotaciones @TableColumn crearán las columnas de la entidad. 

Para generar el código se debe ejecutar mvn install para generar el .jar que ya contendrá las clases de persistencia. Al tener este jar el siguiente pasó será ejecutar el archivo App.java que se encuentra en el proyecto mdd.uniandes.generatedao.test, esto para verificar que efectivamente el jar generado en el paso anterior ya contenia las clases de persistencia.

## Authors

* **Kevin Sanchez** - *Initial work* - [kedavidsa](https://github.com/kedavidsa)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
