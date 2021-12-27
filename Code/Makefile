JC = javac -implicit:none -d build -classpath build -sourcepath "src"

Listeners:
	$(JC) src/Listeners/*.java

Model:
	$(JC) src/Model/*.java

Vue:
	$(JC) src/Vue/*.java

classes: Listeners Model Vue

clean: 
	rm -rf build/*

run:
	java -classpath build Model.Main

