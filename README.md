# isa2024-healtcalc
Health calculator
***
# Practica 3
### Historias de usuario
#### Ideal weight calculation

As a user
I want to calcule my ideal weight 
So that I can set goals to improve my physical health 

##### Aceptance criteria

    Scenario: Calculate ideal weight with correct parameters
    Given my gender and heigth 
    When I calcule my ideal weight
    Then I should see my ideal wheight 

    Scenario: calculate ideal weight with incorrect parameters
    Given my gender or heigth incorrectly
    When I calcule my ideal weight
    Then The system raises an exception

#### Metabolic basal rate calculation

    As a user
    I want to calcule my metabolic basal rate 
    So that I can make a diet and control my caloric intake

##### Aceptance criteria


    Scenario Outline: calculate metabolic basal rate with correct parameters
    Given my gender, heigth, weight and age 
    When I calcule my imb
    Then I should see my imb

    Scenario: calculate metabolic basal rate with incorrect parameters
    Given my gender, heigth, weight or age incorrectly
    When I calcule my imb
    Then The system raises an exception

***
# Practica 1
# Pruebas unitarias
## Clase HealthCalImp
---
### Metodo idealWeight

#### Pruebas de particion (se compureba todos los tipos de entrada y salida posibles)
- Altura menor
- Altura cero
- Podriamos comprobar una altura minima pero no esta implementado
- Genero ni 'm' ni 'f'
- Genero en mayusculas
- Altura 160 (valor bajo)
- Altura 190 (valor alto)
- Prueba de desbordamiento no necesaria ya que no ocurre nunca 
- No se comprueban salidas negativas ya que segun la formula es posible si la altura es baja pero no tiene sentido(hablar con el cliente)

#### Pruebas de caminos base (se comprueba todos los caminos o posiblidades de un metodo)
Tenemos dos caminos, hombre y mujer.

- Genero 'm'
- Genero 'f'
***
### Metodo basalMetabolicRate

#### Pruebas de particion (se compureba todos los tipos de entrada y salida posibles)
- Peso negativo
- Peso cero
- Altura negativa
- Altura cero
- Edad negativa
- Edad cero
- Se podrian comprobar peso altura minimas
- Genero ni 'm' ni 'f'
- Genero en mayusculas
- Peso 60, altura 170, edad 20 en basalMetabolicRate(valores bajos)
- Peso 150, altura 200, edad 90 en basalMetabolicRate(valores altos)
- Prueba de desbordamiento (por el tipo de metodo no se deberia de llegar nunca pero lo añado para recordar que es importante este tipo de prueba)
- No se comprueban salidas negativas ya que segun la formula es posible si la altura es baja pero no tiene sentido(hablar con el cliente)

#### Pruebas de caminos base (se comprueba todos los caminos o posiblidades de un metodo)
Tenemos dos caminos, hombre y mujer.

- Genero 'm'
- Genero 'f'


## Imagen con las pruebas pasadas

![imagen no cargan la puedes encontrar en el repositorio](pruebasPasadas.png)

## Imagen con el grafo de commits

![imagen no cargan la puedes encontrar en el repositorio](grafoCommits.png)