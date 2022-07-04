# Proyecto Automatizacion General Store




<p align="center">

![Screenplay](imagesReadme/screenplay.png)
[![Appium](imagesReadme/appium.jpg)
  <a href="https://serenity-bdd.github.io/theserenitybook/latest/index.html"> 
  <img src="https://serenity-bdd.info/wp-content/uploads/elementor/thumbs/serenity-bdd-pac9onzlqv9ebi90cpg4zsqnp28x4trd1adftgkwbq.png" title="Serenity"> 
  </a>
  <a href="https://cucumber.io/">
  <img src="imagesReadme/automation_tools.png" title="Automation tools">
  </a>
  <a href="https://www.selenium.dev/"> 
  <img src="https://selenium-python.readthedocs.io/_static/logo.png" title="Selenium" > 
  </a>
  <a href="https://gradle.org/"> 
  <img src="https://gradle.org/images/gradle-knowledge-graph-logo.png?20170228" title="Gradle" > 
  </a> 
</p>


## Proyecto construido con patrón de diseño para automatización screenplay
El patrón de diseño screenplay ha sido mayormente difundido por serenity BDD, aunque el patrón en sí es en gran medida independiente del lenguaje y del marco
### Pilares POO en screenplay
- Encapsulamiento
- Herencia
- Polimorfismo
- Abstracción

### Principios SOLID en screenplay
- S -   Principio de responsabilidad unica
- O -  Principio abierto cerrado
- L  -   Principio sustitución Liskov
- I   -   Principio segregación  de interfaces
- D -  Principio Inversión de dependencias

### Paquetes en screenplay
- Features
- Runners
- Steps definition
- Tasks
- Interaccion
- Questions
- User interface

## Repositorio Github
- Acceder a la vpn en caso de trabajo desde casa conectada y activa
- Acceder a la url del proyecto https://github.com/automatizaciontesting/GeneralStoreAppAppiumScreenplay
- Seleccionar la opción "Clone" usar en la lista "Clone with https"
- Copiar el link del vinculo :  https://github.com/automatizaciontesting/GeneralStoreAppAppiumScreenplay.git
- Usar una herramienta para conectar y descargar el proyecto, ejemplo Gitbash.

## Descarga del proyecto

- Acceder a la url del proyecto https://github.com/automatizaciontesting/GeneralStoreAppAppiumScreenplay
  ![releases_gradle](imagesReadme/clone_gitlab.png)
- Seleccionar la opción "Clone" usar en la lista "Clone with https"
- Copiar el link del vinculo :  https://github.com/automatizaciontesting/GeneralStoreAppAppiumScreenplay.git
  - Usar una herramienta para conectar y descargar el proyecto, ejemplo Gitbash, https://git-scm.com/downloads.
    ![clone_gitbash](imagesReadme/clone_gitlab.png)
    ![clone_gitbash](imagesReadme/gitbash_open.png)
    ![clone_gitbash](imagesReadme/gitbash_open_branch.png)

## Reporte de serenity
El framework de serenity permite generar una vez concluidas las pruebas un reporte que resume los resultados tanto de pasos como del resultado esperado.
Para consultar este reporte ir a raizProyecto\target\site\serenity

![Serenity_Report](imagesReadme/serenity_report_1.png)
![Serenity_Report](imagesReadme/serenity_report_2.png)
![Serenity_Report](imagesReadme/serenity_report_3.png)
![Serenity_Report](imagesReadme/serenity_report_4.png)
![Serenity_Report](imagesReadme/serenity_report_5.png)
![Serenity_Report](imagesReadme/serenity_report_6.png)
![Serenity_Report](imagesReadme/serenity_report_7.png)

Git global setup
```sh
git config --global user.name "Hervin Camargo Carlier"
git config --global user.email "hervincamargo@gmail.com"
```

Como ejecutar el proyecto

| Ruta | Acción |
| ------ | ------ |
| \src\test\java\com\generalstore\runners | ejecutar el runner de la funcionalidad, dando clic derecho sobre la clase|
| Consola cmd en la raíz del proyecto | ejecutar comando: gradle clean test -Dtags=nombreTag , el nombre del tag se encuentra en el feature anterior a la definición del escenario. |


# Licencias

MIT
Open-Source

**Free Software!**