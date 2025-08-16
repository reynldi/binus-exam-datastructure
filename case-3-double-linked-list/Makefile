# Makefile for Case 3 - Doubly Linked List
# Java project with Node and DoublyLinkedList classes

# Compiler and flags
JAVAC = javac
JAVA = java
JAVAC_FLAGS = -d .build

# Source directory and main class
SRC_DIR = src
MAIN_CLASS = Main
BUILD_DIR = .build

all: build

build:
	@echo "Building Java project..."
	$(JAVAC) $(JAVAC_FLAGS) $(SRC_DIR)/*.java
	@echo "Build completed!"

run: build
	@echo "Running application..."
	$(JAVA) -cp $(BUILD_DIR) $(MAIN_CLASS)
	@echo "Application finished!"

# Build and run in one command
br: build run

# Run without rebuilding (assumes already built)
run-only:
	@echo "Running application (without rebuilding)..."
	$(JAVA) -cp $(BUILD_DIR) $(MAIN_CLASS)
	@echo "Application finished!"

clean:
	@echo "Cleaning compiled classes..."
	rm -rf $(BUILD_DIR)
	@echo "Clean completed!"

help:
	@echo "Available targets:"
	@echo "  build     - Compile Java source files"
	@echo "  run       - Build and run the application"
	@echo "  br        - Build and run in one command"
	@echo "  run-only  - Run without rebuilding (assumes already built)"
	@echo "  clean     - Remove compiled class files"
	@echo "  help      - Show this help message"
	
.PHONY: all build run br run-only clean help
