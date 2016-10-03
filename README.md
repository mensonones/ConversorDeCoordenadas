[![Codacy Badge](https://api.codacy.com/project/badge/Grade/ee37d023e1684aab959cc71bc0b51f53)](https://www.codacy.com/app/mensones-1/ConversorDeCoordenadas?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=mensonones/ConversorDeCoordenadas&amp;utm_campaign=Badge_Grade) 
[![Build Status](https://travis-ci.org/mensonones/ConversorDeCoordenadas.svg?branch=master)](https://travis-ci.org/mensonones/ConversorDeCoordenadas)

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
