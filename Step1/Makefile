LIB_ANTLR := lib/antlr.jar
ANTLR_SCRIPT := MicroParser.g

all: generate
	rm -rf classes
	mkdir classes
	javac -cp $(LIB_ANTLR) -d classes src/*.java build/*.java

generate:
	rm -rf build
	mkdir build
	java -cp $(LIB_ANTLR) org.antlr.Tool -o build $(ANTLR_SCRIPT)

clean:
	rm -rf classes build

.PHONY: all generate clean
