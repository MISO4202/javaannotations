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

## Authors

* **Kevin Sanchez** - *Initial work* - [kedavidsa](https://github.com/kedavidsa)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
