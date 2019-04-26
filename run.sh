#!/bin/bash

echo ""
echo "Compile java-files to class-files"

javac -d ./$1 $(find . -name "*.java") #./$1/*.java

echo ""
echo "============================================================"
echo ""

cd $1

echo "Run pattern $1"
echo ""
echo "============================================================"
echo ""

java -cp . $1Example