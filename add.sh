#!/bin/bash 


echo $1
if [ $1 -lt 31 ]; then 
	dir="_01Lists"
elif [ $1 -lt 51 ]; then 
	dir="_02Arithmetics"
fi 

echo "package $dir
import java.util.NoSuchElementException

object P$1 {

}" > ./src/main/scala/$dir/"P$1.scala"

echo "package $dir

import org.scalatest.{FunSpec, Matchers}

class P$1Test extends FunSpec with Matchers {

}
" > ./src/test/scala/$dir/"P$1Test.scala"

