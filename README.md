# TSP
Travelling salesman problem


## Project specs
* Java8
* maven 3.6.2


## Run project:
`mvn exec:java -Dexec.mainClass="io.ingnition.App"`


## Idea:
Created a structure in order to support 
getting shortest possible route that visits each Node and returns to the origin Node
with O(n) using a list, instead of the classic O(n!) using brute force to solve the Traveling Salesman Problem  


## Example
![Example case](https://upload.wikimedia.org/wikipedia/commons/3/30/Weighted_K4.svg)

In this case the shortest path is: 
> [A,B]:20 [B,C]:30 [C,D]:12 [A,D]:35 Total: 97

`pablodc00@gmail.com`







