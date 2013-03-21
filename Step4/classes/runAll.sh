#!/bin/bash
# after typing >make all in the shell copy this script over to the classes folder with >cp runAll.sh classes/ and then >cd classes/ and run >./runAll.sh to run it against all 21 testcases
files=$(ls ../testcases/input/)
for i in $files
do
  echo $i
  java -cp .:../lib/antlrworks.jar Micro ../testcases/input/$i > $i.out
  a=(`echo $i | tr "." "\n"`)
  echo "Diff-ing " $i.out " " ${a[0]}.out 
  diff $i.out ../testcases/output/${a[0]}.out
  #cat ../testcases/output/${a[0]}.out
  echo
done

