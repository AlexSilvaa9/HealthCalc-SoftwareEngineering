# isa2024-healtcalc
Health calculator
***
# Pruebas unitarias
## Clase HealthCalImp
---
### Metodo idealWeight

#### Pruebas de particion (se compureba todos los tipos de entrada y salida posibles)
- Altura negativa
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
- Altura negativa
- Edad negativa
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