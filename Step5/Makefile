LIB_ANTLR := lib/antlr.jar
LIB_ANTLR_WORKS := lib/antlrworks.jar
ANTLR_SCRIPT := MicroParser.g

group: 
	@echo "vharikum"

all: generate
	rm -rf classes
	mkdir classes
	javac -cp $(LIB_ANTLR_WORKS) -d classes src/*.java build/*.java

generate:
	rm -rf build
	mkdir build
	java -cp $(LIB_ANTLR_WORKS) org.antlr.Tool -o build $(ANTLR_SCRIPT)

clean:
	rm -rf classes build

.PHONY: all generate clean
