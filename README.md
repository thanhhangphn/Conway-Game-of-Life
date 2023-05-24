# Conway-Game-of-Life

This project uses grid and arraylist to implement a specific version of cellular automata, [Conway's Game of Life](https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life), through exploring the simulation of entities on a 2D grid in which the entities will interact with each other to determine how they change over time. 

The result of the simulation is a a graphic window that displays Conway's Game of Life.

## Final Result Showcase
https://github.com/thanhhangphn/Conway-Game-of-Life/assets/119096071/42c14873-8f0f-4565-89e1-515dd5cf1cf1
![CS231](https://github.com/thanhhangphn/Conway-Game-of-Life/assets/119096071/85fafa77-d6ef-4286-bb40-991038405316)

## Description

By leveraging Java data structures to implement a version of Conway's Game of Life, I was able to examine the
relationship between the initial status chance and the number of living cells as following: It is easily seen that when the initial status chance is highest (80%), the number of living cells is actually lowest (0-5 cells). Therefore, the hypothesis is tested to be wrong. Based on the report above, it is the initial status chance of 50% that allows
the number of living cells after 1000 steps to potentially reach the highest. However, in that case, the number of living cells left is not consistently high either,
ranging from 3 to 36 cells. A potential guess could be that the range in the number of living cells is correlated to the grid dimension.

## Sources/Credits
Colby College's CS231 (Data Structures and Algorithms)'s resources
