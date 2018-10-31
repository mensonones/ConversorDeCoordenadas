[![CircleCI](https://circleci.com/gh/mensonones/ConversorDeCoordenadas.svg?style=svg)](https://circleci.com/gh/mensonones/ConversorDeCoordenadas)

# Conversor De Coordenadas
> Conversor de coordenadas geográficas

Converte pontos X e Y do plano cartesiano em Latitude e Longitude e vice-versa. O código lê os dados de arquivos ```.txt``` ou ```.csv``` 

As coordenadas de latitude e longitude precisam estar no formato: -00.000000;-00.00000


## Features

- [x] Converte ponto [X,Y] para [latitude,longitude]
- [x] Converte ponto [latitude,longitude] para [X,Y]


## Exemplo de Uso

```shell
 java -jar ConversorDeCoordenadas.jar --e entrada.data --s saida.data

```
## Opções

 * ``` Arquivo de Entrada ``` : --e caminho/do/arquivo/de/entrada/nome.data Default: entrada.data
 * ``` Arquivo de Saída ``` : --s caminho/do/arquivo/de/saida/nome.data Default: saida.data

## Meta

Emerson Vieira – mensones.1@gmail.com 

Distribuído sob a licensa MIT. Ver ``LICENSE`` para mais detalhes.

