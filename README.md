# ClassInterfacing
ClassInterfacing, or otherwise known as CInterface is a program that analyzes classes </br>
that creates interfaces in return to the analytical results of the methods in the classes provided.

## Usage
CInterface has two options available to convert classes into interfaces:

- **Individually** </br>
Example: ``java -jar ClassInterfacing.jar Example.class`` </br>
This example produces a ``ExampleI.class`` inside of the directory of the class given. </br>
The ``I`` inside of the generated class name, stands for **Interface**.
- **Directory** </br>
Example: ``java -jar ClassInterfacing.jar -d`` </br>
This example finds all the classes inside of the current directory and generates interfaces for </br>
the classes given inside of the directory. </br>
The ``I`` inside of the generated class name, stands for **Interface**. </br>

## License
This project, binary, and source files are all licensed under the **GPL v3** license.
