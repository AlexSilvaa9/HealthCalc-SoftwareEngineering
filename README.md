# isa2024-healtcalc
Health calculator

# Pruebas unitarias
## Clase HealthCalImp

### Metodo idealWeight

#### Pruebas de particion 
- Peso negativo
- Genero ni 'm' ni 'f'
- Genero en mayusculas
- Altura 160 (valor bajo)
- Altura 190 (valor alto)
- Prueba de desbordamiento no necesaria ya que no ocurre nunca 
#### Pruebas de caminos base
Tenemos dos caminos, hombre y mujer.
- Genero 'm'
- Genero 'f'

### Metodo basalMetabolicRate

#### Pruebas de particion
- Peso negativo
- Altura negativa
- Edad negativa
- Genero ni 'm' ni 'f'
- Genero en mayusculas
- Peso 60, altura 170, edad 20 en basalMetabolicRate(valores bajos)
- Peso 150, altura 200, edad 90 en basalMetabolicRate(valores altos)
- Prueba de desbordamiento
#### Pruebas de caminos base
Tenemos dos caminos, hombre y mujer.
- Genero 'm'
- Genero 'f'